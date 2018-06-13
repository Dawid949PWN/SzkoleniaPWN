  CREATE DATABASE PIEKARNIA;
  USE PIEKARNIA;
  SHOW TABLES;
  SELECT DATABASE();
  
  CREATE TABLE CENY_CHLEBA_1 
   (
   ROK integer primary key, 
	CENA_BIALEGO decimal(38,2), 
	CENA_RAZOWEGO decimal(38,2)
   );

   
  CREATE TABLE CENY_CHLEBA_2 
   (
   ID_CENY serial primary key, 
	ROK integer, 
	CENA decimal(38,2), 
	RODZAJ text
   );
   
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1990','1.75','1.37');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1991','1.7','1.11');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1992','1.67','1.3');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1993','1.64','1.08');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1994','1.67','1.42');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1995','1.64','1.17');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1996','1.57','1.29');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1997','1.44','1.47');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1998','1.46','1.67');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('1999','1.35','1.65');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2000','1.37','1.36');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2001','1.26','1.41');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2002','1.3','1.56');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2003','1.13','1.77');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2004','1.29','1.37');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2005','1.23','1.68');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2006','1.26','1.54');
Insert into CENY_CHLEBA_1 (ROK,CENA_BIALEGO,CENA_RAZOWEGO) values ('2007','1.45','1.46');


Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1990','1.75','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1991','1.7','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1992','1.67','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1993','1.64','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1994','1.67','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1995','1.64','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1996','1.57','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1997','1.44','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1998','1.46','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1999','1.35','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2000','1.37','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2001','1.26','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2002','1.3','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2003','1.13','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2004','1.29','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2005','1.23','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2006','1.26','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2007','1.45','biały');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1990','1.37','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1991','1.11','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1992','1.3','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1993','1.08','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1994','1.42','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1995','1.17','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1996','1.29','razowy');
Insert into CEceny_chleba_1NY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1997','1.47','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1998','1.67','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('1999','1.65','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2000','1.36','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2001','1.41','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2002','1.56','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2003','1.77','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2004','1.37','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2005','1.68','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2006','1.54','razowy');
Insert into CENY_CHLEBA_2 (ROK,CENA,RODZAJ) values ('2007','1.46','razowy');


/*3 Zadania--
WYPISAŁEM CENY BIAEGO CHLEBU OD ROKU 2000*/
SELECT CENA_BIALEGO, ROK  
FROM CENY_CHLEBA_1
WHERE ROK >='2000'
ORDER BY CENA_BIALEGO DESC;


/*4 Zadania--
WYPISAEM CENY DO 2002 ROKU OBEDWOJE RODZAJ CHLEBU*/
SELECT ROK, CENA, RODZAJ FROM CENY_CHLEBA_2 WHERE ROK <'2002'
ORDER BY ROK DESC;
