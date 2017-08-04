DELIMITER //
DROP PROCEDURE IF EXISTS `HPDBSpring`.`new_user_sp`//
CREATE PROCEDURE `HPDBSpring`.`new_user_sp`(IN inusername     VARCHAR(256), IN inemail VARCHAR(256),
                                            IN inname         VARCHAR(256), IN inlast_name VARCHAR(256),
                                            IN inpassword     VARCHAR(256), IN inbirth_date DATE,
                                            IN inaccess_token VARCHAR(512), IN insex_id CHAR,
                                            IN incountry_id   INT, IN inlanguage_id INT
)
  BEGIN
    INSERT INTO user (username, email, name, last_name, password, birth_date, access_token, sex_id,
                      category_id, account_state_id, country_id, language_id)
    VALUES (inusername, inemail, inname, inlast_name, inpassword, inbirth_date, inaccess_token,
                        insex_id, 1, 1, incountry_id, inlanguage_id);
  END //

DROP PROCEDURE IF EXISTS `HPDBSpring`.`get_token_user_info_sp`//
CREATE PROCEDURE `HPDBSpring`.`get_token_user_info_sp`(IN inemailOrUsername VARCHAR(256), IN inpassword VARCHAR(256))
  BEGIN
    SELECT
      user.id,
      user.access_token,
      language.language,
      role.role
    FROM user
      INNER JOIN language ON user.language_id = language.id
      INNER JOIN role_x_user ON user.id = role_x_user.user_id
      INNER JOIN role ON role_x_user.role_id = role.id
    WHERE
      (user.email = inemailOrUsername OR user.username = inemailOrUsername)
      AND user.password = inpassword;
  END //
DROP PROCEDURE IF EXISTS `HPDBSpring`.`get_form_sp`//
CREATE PROCEDURE `HPDBSpring`.`get_form_sp`(IN insection_id VARCHAR(255), IN inrole VARCHAR(255),
                                            IN inlanguage   VARCHAR(255))
  BEGIN
    SELECT
      field.name,
      field_type.field_type,
      text_translated.text_translated
    FROM field_x_form
      INNER JOIN form ON field_x_form.form_id = form.id
      INNER JOIN field ON field_x_form.field_id = field.id
      INNER JOIN form_x_section ON form.id = form_x_section.form_id
      INNER JOIN section ON form_x_section.section_id = section.id
      INNER JOIN field_type ON field.field_type_id = field_type.id
      INNER JOIN role ON form.role_id = role.id
      INNER JOIN gui_text ON field.label_id = gui_text.id
      INNER JOIN gui_text_in_language ON gui_text.id = gui_text_in_language.gui_text_id
      INNER JOIN language ON gui_text_in_language.language_id = language.id
      INNER JOIN text_translated ON gui_text_in_language.gui_text_translated_id = text_translated.id
    WHERE
      section.id = insection_id AND role.role = inrole AND language.language = inlanguage
      ORDER BY field_x_form.position ASC;
  END //
DROP PROCEDURE IF EXISTS `HPDBSpring`.`get_gui_texts_sp`//
CREATE PROCEDURE `HPDBSpring`.`get_gui_texts_sp`(IN insection_id VARCHAR(255), IN inrole VARCHAR(255),
                                                 IN inlanguage   VARCHAR(255))
  BEGIN
    SELECT
      gui_text.gui_text,
      text_translated.text_translated,
      gui_text_type.gui_text_type
    FROM gui_text
      INNER JOIN gui_text_x_section ON gui_text.id = gui_text_x_section.gui_text_id
      INNER JOIN section ON gui_text_x_section.section_id = section.id
      INNER JOIN gui_text_in_language ON gui_text.id = gui_text_in_language.gui_text_id
      INNER JOIN language ON gui_text_in_language.language_id = language.id
      INNER JOIN text_translated ON gui_text_in_language.gui_text_translated_id = text_translated.id
      INNER JOIN gui_text_type ON gui_text.gui_text_type_id = gui_text_type.id
      INNER JOIN role ON gui_text.role_id = role.id
    WHERE
      section.id = insection_id AND role.role = inrole AND language.language = inlanguage;
  END //
DELIMITER ;
# CREATE PROCEDURE `HPDBSpring`.`test`(IN inuser_id VARCHAR(256), IN inlang VARCHAR(256))
#   BEGIN
#     SELECT
#       user.id,
#       user.access_token,
#       role.role
#     FROM user
#       INNER JOIN role_x_user ON user.id = role_x_user.user_id
#       INNER JOIN role ON role_x_user.role_id = role.id
#     WHERE
#       (user.email = inemailOrUsername OR user.username = inemailOrUsername)
#       AND user.password = inpassword;
#   END;