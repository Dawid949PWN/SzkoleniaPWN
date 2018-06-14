create database checkage;
Use checkage;
show tables;
select database();

create table Persons(
			ID int not null,
			LastName varchar(255) not null,
			FirstName varchar(255),
			Age int, check (Age>=18)
);
show tables;
describe Persons;
select * from Persons;

insert into Persons values	('1','Ciocka','Aneta',32),
							('2','Witecka','Julia',23),
                            ('3','Kowalewska','Aneta',29),
                            ('4','Grubowska','Paulina',37),
                            ('5','Bak','Viktoria',42),
                            ('6','Ludłowska','Aneta',22),
                            ('7','Marynarska','Balbuna',29),
                            ('8','Chudyka','Ursula',35),
                            ('9','Lewczuk','Bozena',21),
                            ('10','Swietochowska','Aneta',19),
                            ('11','Domanska','Sylwia',24);
select * from Persons;
                            
                            
select LastName, FirstName, Age from Persons where FirstName = 'Aneta';