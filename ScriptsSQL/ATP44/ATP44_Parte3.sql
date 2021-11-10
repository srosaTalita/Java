begin transaction;
-- Crie uma tabela país com id(PK), nome e sigla.
create table pais(
	id int primary key generated always as identity,
	nome varchar(100),
	sigla varchar(10)
);

create table estado(
	id int primary key generated always as identity,
	nome varchar(100),
	sigla varchar(10),
	pais_id int not null,
	constraint fk_pais foreign key(pais_id) references pais(id)
);

create table cidade(
	id int primary key generated always as identity,
	nome varchar(100),
	sigla varchar(10),
	estado_id int not null,
	constraint fk_estado foreign key(estado_id) references estado(id)
);

-- Adicione um país, um estado e uma cidade. Execute os DDL e DML em uma mesma transação 
insert into pais(nome, sigla)
	values('Brasil', 'BR');
	
insert into estado(nome, sigla, pais_id)
	values('Bahia', 'BA', 1);
	
insert into cidade(nome, sigla, estado_id)
	values('Feira de Santana', 'FSA', 1);

commit;
end;