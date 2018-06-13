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

insert into Persons values('1','Ciociocka','Aneta',32),
							('2','Witecka','Aniu',22),
                            ('3','Kowalewska','Aneta',29),
                            ('4','Grubowska','Paulina',37),
                            ('5','Bak','Viktoria',42),
                            ('6','Ludłowska','Aneta',18),
                            ('7','Marynarska','Balbuna',22),
                            ('8','Chudyka','Ursula',35),
                            ('9','Lewczuk','Bozena',27),
                            ('10','Swietochowska','Aneta',19),
                            ('11','Domanska','Sylwia',28);
select * from Persons;
                            
select LastName, FirstName, Age from Persons where FirstName = 'Aneta';


