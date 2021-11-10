-- Liste todos os dados de todas as colunas da tabela Categoria.
select * from categoria;

-- Liste todos os dados de todas as colunas da tabela Produto.
select * from produto;

-- Liste os dados de todas as colunas da tabela Categoria, para as linhas que possuam uma descri��o preenchida.
select * from categoria where (descricao is not null);

--  Liste os dados das colunas Id, nome e pre�o da tabela Produto, para as linhas que possuem um nome iniciando com C.
select (id, nome, preco) from produto where nome like 'c%';

-- Liste os dados das colunas Id, nome e pre�o da tabela Produto e os dados id, 
-- nome e descri��o da tabela Categoria para as linhas que possuem um pre�o maior que 0.
select * from produto as p 
		join categoria as c 
		on p.id_categoria = c.id 
		where (p.preco > 0);
	
-- Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
select * from produto as p 
		where (p.id_categoria > 2);
	
-- Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna 
-- nome da tabela Produto, para as categorias que est�o sendo utilizadas por produtos.
select c.id, c.nome as "NomeCategoria", c.descricao, p.nome as "NomeProduto"
	from categoria as c 
	join produto as p 
	on c.id = p.id_categoria;

		
