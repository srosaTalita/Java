begin transaction;
	
insert into estado(nome, sigla, pais_id) values('Minas Gerais', 'MG', 1);
	
insert into estado(nome, sigla, pais_id) values('São Paulo', 'SP', 1);
		
insert into cidade(nome, estado_id) values('Alagoinhas', 1);
	
insert into cidade(nome, estado_id) values('Salvador', 1);

insert into cidade(nome, estado_id) values('Belo Horizonte', 2);

insert into cidade(nome, estado_id) values('Ouro Preto', 2);

insert into cidade(nome, estado_id) values('São Paulo', 3);

select c.id as "IdCidade", c.nome, e.id as "IdEstado", e.nome, e.sigla, p.id as "IdPais", p.sigla
	from cidade as c
	join estado as e 
	on c.estado_id = e.id 
	join pais as p 
	on e.pais_id  = p.id; 

commit;
end;
