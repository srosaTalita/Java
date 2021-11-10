-- DTL = Data Transaction Language

begin transaction;

	create table categoria2(
		id int primary key generated always as identity,
		nome varchar(50) not null,
		descricao varchar(150) null
	);
	savepoint criacao_categoria;

	create table pessoa(
		id int primary key generated always as identity,
		nome varchar(50) not null,
		descricao varchar(150) null
	);
	rollback to criacao_categoria; -- Voltar ao savepoint

commit; -- Efetivar transação
end;