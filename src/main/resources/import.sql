insert into user(id, name, login, password) values (1,'User','user','user123');

insert into role(id, name) values (1,'ROLE_USER');
insert into role(id, name) values (2,'ROLE_ADMIN');
insert into role(id, name) values (3,'ROLE_GUEST'); 

insert into user_role(user_id, role_id) values (1,2);

