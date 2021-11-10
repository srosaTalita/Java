-- Criando tabelas produto, categoria e carro
create table produto(
	id int generated always as identity,
	nome varchar(50) not null,
	descricao varchar(100) not null,
	codigo varchar(20) not null,
	preco float not null
);

create table categoria(
	id int primary key generated always as identity,
	nome varchar(50) not null,
	descricao varchar(100)
);

create table carro(
	id int generated always as identity,
	modelo varchar(50) not null,
	marca varchar(50) not null
);

-- Adicionando novas colunas a tabela carro
alter table carro 
	add column chassi varchar(20) not null,
	add column ano varchar(4) not null;

-- Removendo coluna da tabela produto
alter table produto 
	drop column codigo;
	
-- Deletanto a tabela carro e categoria
drop table carro;
drop table categoria;

-- Adicionando id_categoria na tabela produto
alter table produto 
	add column id_categoria int not null;

-- Adicionando uma constraint a coluna id_categoria na tabela produto
alter table produto 
	add constraint fk_categoria foreign key(id_categoria) references categoria(id);
