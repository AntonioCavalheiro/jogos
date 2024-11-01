Create Table Cliente(
id int not null primary key auto_increment,
nome varchar (100),
endereco varchar (120),
numero varchar (50),
bairro varchar (80),
id_municipio int not null,
telefone varchar (30),
celular varchar (30)
);

Create Table Lancamento (
id int not null primary key auto_increment,
datalancamento date,
idcliente bigint not null,
tipolancamento varchar (10),
valorlancamento decimal (12,2)
);

Create Table Municipio(
id int not null primary key auto_increment,
nome varchar (100),
estado char (2)
);

alter table cliente add constraint FK_municipio_cliente
foreign key (id_municipio) references municipio(id);

alter table lancamento add constraint FK_cliente_lancamento
foreign key (idcliente) references cliente(id);