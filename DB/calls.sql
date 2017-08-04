INSERT INTO `HPDBSpring`.`account_state` (`id`, `account_state`) VALUES (1, 'Confirmation email not sent');
INSERT INTO `HPDBSpring`.`account_state` (`id`, `account_state`) VALUES (2, 'Confirmed');
INSERT INTO `HPDBSpring`.`account_state` (`id`, `account_state`)
VALUES (3, 'Deactivated(email confirmation not received on time).');
INSERT INTO `HPDBSpring`.`account_state` (`id`, `account_state`) VALUES (4, 'Waiting for email confirmation.');

INSERT INTO `HPDBSpring`.`category` (`id`, `category`) VALUES (1, 'regular');
INSERT INTO `HPDBSpring`.`category` (`id`, `category`) VALUES (2, 'premium');

INSERT INTO `HPDBSpring`.`role` (`id`, `role`) VALUES (1, 'USER');
INSERT INTO `HPDBSpring`.`role` (`id`, `role`) VALUES (2, 'DOCTOR');
INSERT INTO `HPDBSpring`.`role` (`id`, `role`) VALUES (3, 'ADMIN');
INSERT INTO `HPDBSpring`.`role` (`id`, `role`) VALUES (4, 'DEVELOPER');

INSERT INTO `HPDBSpring`.`sex` (`id`, `sex`) VALUES (1, 'Male');
INSERT INTO `HPDBSpring`.`sex` (`id`, `sex`) VALUES (2, 'Female');
INSERT INTO `HPDBSpring`.`sex` (`id`, `sex`) VALUES (3, 'Intersex');

INSERT INTO `HPDBSpring`.`country` (`id`, `country`, `code`) VALUES (1, 'Mexico', 'MX');
INSERT INTO `HPDBSpring`.`country` (`id`, `country`, `code`) VALUES (2, 'United States', 'US');
INSERT INTO `HPDBSpring`.`country` (`id`, `country`, `code`) VALUES (3, 'Canada', 'CA');

INSERT INTO `HPDBSpring`.`language` (`id`, `language`) VALUES (1, 'esMX');
INSERT INTO `HPDBSpring`.`language` (`id`, `language`) VALUES (2, 'enUS');
INSERT INTO `HPDBSpring`.`language` (`id`, `language`) VALUES (3, 'frFR');

INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (1, 'text');
INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (2, 'email');
INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (3, 'password');
INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (4, 'number');
INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (5, 'calendar');
INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (6, 'select');
INSERT INTO `HPDBSpring`.`field_type` (id, field_type) VALUES (7, 'hidden');

INSERT INTO `HPDBSpring`.`gui_text_type` (id, gui_text_type) VALUES (1, 'label');
INSERT INTO `HPDBSpring`.`gui_text_type` (id, gui_text_type) VALUES (2, 'placeholder');

CALL `HPDBSpring`.`new_user_sp`(
    'searlese',
    'ats@h.com',
    'sergio',
    'san',
    'qwerty',
    '1997-06-13',
    'myaccess_token',
    1,
    1,
    1
);
CALL `HPDBSpring`.`new_user_sp`(
    'kiera13',
    'ki@h.com',
    'kiera',
    'mor',
    'qwerty',
    '1998-07-14',
    'test_access_token',
    2,
    2,
    2
);

DELETE FROM `HPDBSpring`.`role_x_user`
WHERE user_id = 1 OR user_id = 2;

INSERT INTO `HPDBSpring`.`role_x_user` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `HPDBSpring`.`role_x_user` (`user_id`, `role_id`) VALUES ('1', '2');
INSERT INTO `HPDBSpring`.`role_x_user` (`user_id`, `role_id`) VALUES ('2', '1');

CALL get_token_user_info_sp('ats@h.com', 'qwerty');

CALL `HPDBSpring`.`get_form_sp`('signup', 'user', 'enUS');

CALL `HPDBSpring`.`get_gui_texts_sp`('signup', 'user', 'esMX');