create database aula12;

use aula12;

create table cliente(
	id int primary key auto_increment,
	nome varchar (40),
	cpf varchar (12),
	telefone varchar (11)
);