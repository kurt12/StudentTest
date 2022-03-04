CREATE TABLE student (
id bigint auto_increment,
first_name varchar(255) not null,
date_of_birth date

);

CREATE TABLE books (
id bigint auto_increment,
name_book varchar(255) not null,
author varchar(255) not null,
date_of_issue date,
student_id bigint,
foreign key(student_id) references student (id)


);
