create database insertdatabase6;
use insertdatabase6;
select database();
show databases;

create table countries(
				country_id varchar(11),
				country_name varchar(50),
				country_number decimal(10,0)
);
describe countries;
select * from countries;
insert into countries values('1','Polska',76457),
							('2','Czechy',56766),
							('3','Wielko Brytania',14765),
							('4','Swajcaria',45468);							
select * from countries;

/*zadania 6*/
select lpad(country_id,5,0) as 'Kraj_ID', country_name as 'Nazwa_kraju', country_number as 'Numery'
from countries;
