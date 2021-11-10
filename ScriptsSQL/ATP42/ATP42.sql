-- Inserir 3 categorias na tabela categoria
insert into categoria
	(nome, descricao)
values
	('frios', 'produtos refrigerados'), 
	('hortifruti', 'frutas e verduras'), 
	('bebidas', 'alcoolicos e não alcoolicos');

-- Inserir 6 produtos na tabela produto
insert into produto
	(nome, descricao, preco, id_categoria)
values
	('queijo', 'parmesão', 10.0, 1), 
	('queijo', 'prato', 8.5, 1), 
	('morango', 'frutas vermelhas', 5.0, 2), 
	('cereja', 'frutas vermelhas', 8.0, 2), 
	('vinho', 'tinto', 15.0, 3), 
	('água', 'mineral com gás', 5.0, 3);

-- Alterar descrição de dois produtos
update produto 
	set descricao = 'branco' where id = 5;
	
update produto 
	set descricao = 'mineral sem gás' where id = 6;

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
	set nome = 'sabonete', descricao = 'liquído' where id = 3;

-- Alterar o preço de todos os produtos tirando 1 real
update produto 
	set preco = preco - 1;