INSERT INTO `HPDBSpring`.`form` (id, role_id) VALUES ('signup', 1);
INSERT INTO `HPDBSpring`.`form` (id, role_id) VALUES ('GuiText', 4);

INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (1, 1, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (2, 2, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (3, 3, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (4, 4, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (5, 5, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (6, 6, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (7, 8, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (8, 9, 'signup');
INSERT INTO `HPDBSpring`.`field_x_form` (position, field_id, form_id) VALUES (9, 10, 'signup');

INSERT INTO `HPDBSpring`.`section` (id) VALUES ('signup');
INSERT INTO `HPDBSpring`.`section` (id) VALUES ('createGuiText');

INSERT INTO `HPDBSpring`.`gui_text_x_section` (gui_text_id, section_id) VALUES (11, 'signup');

INSERT INTO `HPDBSpring`.`form_x_section` (form_id, section_id) VALUES ('signup', 'signup');




