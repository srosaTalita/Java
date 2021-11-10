-- DTL = Data Transaction Language

begin transaction;

	create table categoria2(
		id int primary key generated always as identity,
		nome varchar(50) not null,
		descricao varchar(150) null
	);

commit; -- Efetivar transação
end;