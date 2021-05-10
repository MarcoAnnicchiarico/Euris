create database euris;
use euris;

create table articoli(
idcodice int primary key,
nome varchar(50),
prezzo varchar(50)
);

insert into articoli (idcodice, nome, prezzo) values
 (438438988, 'Pesce', '0p0s12d'),
 (223050688, 'Brownies', '0p0s5d'),
 (232354565, 'Carne', '0p2s5d'),
 (978643763, 'Ombrello', '0p5s3d'),
 (123456907, 'Guinness', '0p0s8d'),
 (766555419, 'Cavallo', '50p19s11d'),
 (456894332, 'Regina', '999p19s11d')