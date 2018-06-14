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
insert into countries values('1','Polska',7654454),
							('2','Kolumbia',5676636),
							('3','Senegal',44765875),
							('4','Japan',1546825);				
                            
select * from countries;

/*zadania 6*/
select lpad(country_id,5,0) as 'Kraj_ID', country_name as 'Nazwa_kraju', country_number as 'Numery'
from countries;
