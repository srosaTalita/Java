alter table pessoas
add column endereco varchar(200) not null;

alter table pessoas
add column id int generated always as identity;

alter table pessoas 
add column cpf varchar(20) not null default '000.000.000-00';