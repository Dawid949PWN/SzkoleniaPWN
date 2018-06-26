# ZADANIE  ĆWICZENIA
create database samochod;
use samochod;
select database();
show tables;

create table dane(
					id_numer int(11) primary key,
                    nazwa varchar(45) not null,
					imie varchar(45) not null,
                    cena_auta decimal(0),
                    miasto varchar(45) not null,
                    numert varchar(45) not null
);
create table szczegoly(
					id_numer2 int(11) primary key,
					nr_rejestracji varchar(45) not null,
					samochod_rocznik varchar(45) not null
);
create table samochod(
					id_numer3 int(11) primary key,
					marka varchar(45) not null,
					model varchar(45) not null,
					rodzaj_paliwa varchar(45) not null,
					średnia_paliwa_litrach varchar(45) not null,
					auta_moc decimal(0)
);
show tables;
describe samochod;
select * from samochod;

insert into dane values(1,'Paulina','Boguska',52434,'Warszawa',5467381),
(2,'Maciej','Karczowski',63247,'Poznań',8547384),
(3,'Wojtek','Wasilewski',78322,'Kraków',6467387),
(4,'Balbuna','Wisniewska',36138,'Poznań',6767389),
(5,'Ursula','Domzalska',86438,'Warszawa',4467384),
(6,'Zoszia','Samoszia',77434,'Kraków',5467382);
select * from dane; 

insert into szczegoly values(1,'WL8042', 2014),
(2,'PO4733', 2016),
(3,'KR7673', 2017),
(4,'PO4029', 2016),
(5,'WB3587', 2018),
(6,'KR3886', 2017);
select * from szczegoly;

insert into samochod values
(1,'Bmw','coupé','Benzyna',11,185),
(2,'Volvo AB','kombi','Benzyna',8,210),
(3,'Mercedes-Benz','limuzyna','Diesel',9,160),
(4,'Porsche','coupé','Benzyna',11,260),
(5,'Audi','coupé','Hybrid',9,190),
(6,'Toyota','limuzyna','Hybrid ',8,185);
select * from samochod;

# 1 ćwiczenia
select nazwa, imie, miasto from dane;

# 2 ćwiczenia
select lower(marka), upper(marka) from samochod;

# 3 ćwiczenia
select * from dane where miasto = 'Poznań' or miasto = 'Warszawa' group by miasto;

# 4 ćwiczenia
select nazwa, numert, case when numert >= 5514645 then 'Aktywne' else 'Unaktywne' end "aktywne i unaktywne"
from dane;

# 5 ćwiczenia
select concat_ws("-", marka, rodzaj_paliwa), średnia_paliwa_litrach as 'l/100km' from samochod;

# 6 ćwiczenia
select marka, model,(length(marka)+ length(model))
as 'liczba___' from samochod;

# 7 ćwiczenia 
select concat(left(średnia_paliwa_litrach,2),' l') from samochod;

# 8 ćwiczenia
create trigger Samochody_regstr
before insert on samochod
	for each row
	set new.marka = new.marka;
insert into samochod values(7,'Volkswagen','limuzyna','Diesel',9,200);
select * from samochod order by auta_moc;

drop trigger Samochody_regstr;

