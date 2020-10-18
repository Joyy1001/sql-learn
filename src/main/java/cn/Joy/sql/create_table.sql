create table student
(
	sno int auto_increment,
	name varchar(200) null,
	age int null,
	constraint student_pk
		primary key (sno)
) character set = utf8;
