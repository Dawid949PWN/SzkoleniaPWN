create database bazadanychpizzy;
use bazadanychpizzy;
select database();
show tables;

create table Rejestracja_kli(
				id_rejestracji Int(11) primary key,
				username 	Varchar(45) not null,
				email		Varchar(25) not null,
				password	Varchar(12) not null
);
create table Logowanie_table_kli(
				id_klienta	Int(11) primary key,
				Logowanie	Varchar(25) not null,
				passwordpod	Varchar(12) not null
);
create table pizzy(
				Id_pizzy 	Int(11) primary key,
				Nazwa		Varchar(45) not null,
				Cena		Decimal(8,2),
				Rozmiary	varchar(10) not null
);
create table Artykuly(
				Id_pizzy	varchar(8) not null,
				sztuk_Int	varchar(10) not null
);
create table zamowienia(
				Nazwa_uz	Varchar(45) not null,
				Ulica		Varchar(45) not null,
				Miejscowosc	Varchar(45) not null,
				Telefon		Varchar(20) not null,
                Cena		Decimal(8,2)
);
create table Id_obsługi(
				id_rejestracji Int(11) primary key,
				Telefon		Varchar(20) not null
);

insert into Rejestracja_kli 
values(1,'Adam_konto', 'uzytkownik1@gmail.com', 123456),
		(2,'Balbuna_konto', 'uzytkownik2@gmail.com', 123457),
		(3,'Michale_konto', 'uzytkownik3@gmail.com', 123458),
		(4,'Zoszia_konto', 'uzytkownik4@gmail.com', 123459);
select * from Rejestracja_kli;

insert into Logowanie_table_kli
values(1, 'Balbuna_konto', 2344543635);
select * from Logowanie_table_kli;

insert into pizzy
			  values(10, 'Marghareta', 19, 26),
					(11, 'Funghi', 25, 30),
					(12, 'Prosciotto', 23, 22),
					(13, 'Jarska', 28, 43),
					(14, 'Wiosenna', 18, 28),
					(15, 'Hawajska', 19, 18),
					(16, 'Śląska', 24, 32),
					(17, 'Peperoni', 27, 43),
					(18, 'Kowbojska', 21, 26),
					(19, 'Morska', 22, 30),
					(20, 'Meksykańska', 29, 22),
					(21, 'Turecka', 20, 18);
select * from pizzy;

insert into zamowienia values('Karolina', 'ulica Marynarska 37', 'Warszawa', 385736271, 19),
								('Ursula', 'ulica Karolkowska 25', 'Wrocław', 385285271, 25), 
								('Jacek', 'ulica Zigmuntowsska 20', 'Łodz', 385732881, 23),
								('Kuba', 'ulica Wołowska 38', 'Kraków', 385736381, 28),
								('Kacper', 'ulica Bonifacego 46', 'Rzeszów', 385736893, 18),
								('Sławek', 'ulica Wilanowska 22', 'Gdansk', 327953627, 24),
								('Maciej', 'ulica Łucka 15', 'Poznan', 385721771, 27),
								('Balbuna', 'ulica Zelazna 79', 'Olsztyn', 385736467, 21),
								('Aneta', 'ulica Swietokrzyska 34', 'Warszawa', 369373627, 22),
								('Ola', 'ulica Batomego 21', 'Poznan', 385254271, 20),
								('Marela', 'ulica Kasprzaka 58', 'Wrocław', 385734789, 29);
select * from zamowienia;

insert into Artykuly
				values(1746, 11),
						(1132, 12),
						(1432, 14),
						(1243, 16),
						(3124, 17),
						(1421, 15),
						(1532, 16),
						(1224, 18),
						(1145, 14),
						(1522, 12),
						(1455, 19);
select * from Artykuly;

insert into Id_obsługi
values(4, 'Zoszia_konto');
select * from Id_obsługi;

show tables;
describe pizzy;
select * from pizzy;

/*PIZZY_PROJECT */

# 1) Wypisz pizzy sumie ile litery zawierają!?
select Nazwa, length(Nazwa) as 'Liczba litery ' from pizzy;

# 2) Wypisz te pizzy który zawierają litery "C"!?
select Id_pizzy, Nazwa, locate('c',Nazwa) as 'Zawiera "c": ' from pizzy;

# 3) Wypisz jedną ulubianą pizzy 6 razy!?
select repeat(Nazwa, 6) as 'Nazwa Pizzy 6_razy ' from Pizzy;

# *4) Wypisz pierwszy 2 litery!?
select left(Nazwa, 2) as 'Paragraph wypisane ' from Pizzy;

# 5) Wypisz klienta_nazwe spowrotem w tablicu zamowiania?
# tablica razem!?
select Nazwa_uz, reverse(Nazwa_uz) as 'Przecziwnie_nazwa ' from zamowienia;

# 6) Podaj wielkości rozmiary!?
select count(*) Rozmiary, Nazwa from pizzy
group by Rozmiary;

# 7)  Wypisz listę klientów w formacie klient_nazwa, ulica (cena),
# np. “ Jacek (Cena) ”!?
select Nazwa_uz, Ulica, Cena
from zamowienia z
where Cena>(select Cena from zamowienia where Nazwa_uz='Jacek ');

# 8) Policz, jaka jest średnia rozmiary pizzy!?
select avg(dane.suma) as 'Pizzy_Cena_avg '
from(select (Cena) suma from zamowienia) as dane; 

# 9) Wypisz listę zamowienia w formacie Nazwa_uz, Ulica, Miejscowosc, Cena,
# np. “ Nazwa_uz Ulica Miejscowosc (Cena) ”. !?
select Nazwa_uz, Ulica, Miejscowosc, Cena, concat(Nazwa_uz ,'',Ulica ,'', Miejscowosc, ' (',Cena,'Zł)') as 'W jednym colummn' from zamowienia;
 
# 10) Podaj ilości Rozmiary wyższych niż 30cm, a pozatym,
# Podaj ilości Ceny ktróy miedzy 24 oraz 30 liczbe zawieraja!?
select Nazwa, Rozmiary, Cena
from (select * from pizzy where Rozmiary >32) as z1
where Cena between 24 and 30; 

# 11) Dodane TRIGGERA
create trigger Reg_BeforeInsert
before insert on Rejestracja_kli
	for each row
	set New.username = upper(New.username);
        
insert into Rejestracja_kli values(4,'Zoszia_konto', 123459);
select * from Rejestracja_kli order by password desc;

# Skasowanie TRIGGERA
drop trigger Reg_BeforeInsert;

# 12) Dodane TRIGGERA
create trigger Reg_pizzy
before insert on pizzy
	for each row
	set New.Nazwa = upper(New.Nazwa);
        
insert into pizzy values(14, 'Wiosenna', 18, 28);
select * from pizzy group by Cena;

# 13) TRIGGERA delimiter

delimiter //       

create trigger Mod_pizzy
before insert on pizzy
for each row
if (exists(select * from pizzy where Nazwa = New.Nazwa) = true) then
set New.Nazwa = concat(New.Nazwa, '-copy');

end if;

// 

# 14) W Zadaniu usunięcie TRIGGERA tablice Mod_pizzy
# Usunięcie TRIGGERA

drop trigger Mod_pizzy;






