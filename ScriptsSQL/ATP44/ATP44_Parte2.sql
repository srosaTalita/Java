-- Execute todos os comandos em uma única transação.
begin transaction;

-- Crie uma tabela Carros com id, marca e modelo. 
create table carros(
	id int primary key generated always as identity,
	marca varchar(25),
	modelo varchar(25)
);

-- Insira dois novos carros dentro desta tabela. 
insert into carros(marca, modelo)
	values('fiat', 'argo');

commit;
end;
