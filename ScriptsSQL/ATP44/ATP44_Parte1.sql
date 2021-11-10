begin transaction;

insert into categoria(nome, descricao)
	values ('limpeza', 'produtos de limpeza pra casa');

insert into produto(nome, descricao, preco, id_categoria)
	-- Erro esperado/id_categoria inexistente
	values('vassoura', 'Piaçava', 20.0, 7);

commit;
end;



