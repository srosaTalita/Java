--DML - Data Manipulation Language
--INSERT, UPDATE, DELETE

-- Inserindo na tabela
insert into pessoas(
	nome, sobrenome, idade, endereco 
)
values(
	'Talita', 'Rosa', 19, 'Bahia'
);

-- Atualizando dado em linha especifica
update pessoas
	set 
		nome = 'Nat' 
	where id = 13
	
delete from pessoas 
	where id = 1;