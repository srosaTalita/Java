-- Inserir 3 categorias na tabela categoria
insert into categoria
	(nome, descricao)
values
	('frios', 'produtos refrigerados'), 
	('hortifruti', 'frutas e verduras'), 
	('bebidas', 'alcoolicos e n�o alcoolicos');

-- Inserir 6 produtos na tabela produto
insert into produto
	(nome, descricao, preco, id_categoria)
values
	('queijo', 'parmes�o', 10.0, 1), 
	('queijo', 'prato', 8.5, 1), 
	('morango', 'frutas vermelhas', 5.0, 2), 
	('cereja', 'frutas vermelhas', 8.0, 2), 
	('vinho', 'tinto', 15.0, 3), 
	('�gua', 'mineral com g�s', 5.0, 3);

-- Alterar descri��o de dois produtos
update produto 
	set descricao = 'branco' where id = 5;
	
update produto 
	set descricao = 'mineral sem g�s' where id = 6;

-- Deletar um produto e uma categoria
delete from produto
	where id = 5;

delete from produto
	where id = 6;

delete from categoria
	where id = 3;

-- Alterar uma categoria e um produto
update categoria 
	set nome = 'higiene', descricao = 'higiene pessoal' where id = 2;

update produto
	set nome = 'cotonete', descricao = 'hastes flexiveis' where id = 4;

update produto
	set nome = 'sabonete', descricao = 'liqu�do' where id = 3;

-- Alterar o pre�o de todos os produtos tirando 1 real
update produto 
	set preco = preco - 1;