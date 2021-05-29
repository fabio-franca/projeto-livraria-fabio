CREATE DATABASE livraria_fabio;

USE livraria_fabio2;

CREATE TABLE livro(
				 id bigint(20) auto_increment,
				 titulo varchar(255) not null,
				 autor varchar(255) not null,
				 quantidade int(11) not null,
				 preco double not null,
				 primary key(id));

CREATE TABLE funcionarios(
				id bigint(20) auto_increment,
                nome varchar(255) not null,
                email varchar(255) not null,
                nascimento date not null,
                cargo varchar(255) not null,
                primary key(id));

INSERT INTO funcionarios(
				nome,
                email,
                nascimento,
                cargo)
			VALUES(
				'Joao',
                'joao@gmail.com',
                '2000-01-01',
                'GERENTE');

INSERT INTO funcionarios(
				nome,
                email,
                nascimento,
                cargo)
			VALUES(
				'Maria',
                'maria@outlook.com',
                '2005-09-15',
                'SUPERVISOR');

CREATE TABLE clientes(
				id bigint(20) auto_increment,
                nome varchar(255) not null,
                email varchar(255) not null,
                telefone varchar(255) not null,
                nascimento date not null,
                usuario varchar(255) not null,
                senha varchar(255) not null,
                primary key(id));

CREATE TABLE vendas(
				id bigint(20) AUTO_INCREMENT,
				cliente_id bigint(20) NOT NULL,
				livro_id bigint(20) NOT NULL,
				CONSTRAINT pk_vendas PRIMARY KEY(id),
				CONSTRAINT fk_vendas_cliente FOREIGN KEY(cliente_id) REFERENCES clientes(id),
				CONSTRAINT fk_vendas_livro FOREIGN KEY(livro_id) REFERENCES livro(id));

INSERT INTO livro(
				titulo,
				autor,
                quantidade,
                preco)
			VALUES(
				'Livros digitais e bibliotecas',
                'Liliana',
                20,
                25.99);

INSERT INTO livro(
				titulo,
				autor,
                quantidade,
                preco)
			VALUES(
				'A ascensão dos dragões',
                'Morgan Rice',
                100,
                99.99);