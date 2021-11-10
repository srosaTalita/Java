-- SQL
-- DDL - DATA DEFINITION LANGUAGE - Linguagem de Definição de Dados
-- CREATE, ALTER, DROP

-- TABELA - DEFINIÇÃO/Estrutura onde os dados são armazenados
-- Tabela é formada por linhas e colunas

create table PESSOAS(
	nome varchar(25) not null,
	sobrenome varchar(25) not null,
	idade int null
);

create table livros(
	titulo varchar(100) not null,
	autor varchar(50) not null,
	ano int not null
);