/*Table Category*/
/*INSERT INTO Category (NAME) VALUES ('Aquatique');
INSERT INTO Category (NAME) VALUES ('Aérien');
INSERT INTO Category (NAME) VALUES ('Découverte');
INSERT INTO Category (NAME) VALUES ('Test');

/*Table Place*/
INSERT INTO Place (NAME, COUNTRY, CITY) VALUES ('Tour eiffel', 'France', 'Paris');
INSERT INTO Place (NAME, COUNTRY, CITY) VALUES ('Promenade des Anglais', 'France', 'Nice');
INSERT INTO Place (NAME, COUNTRY, CITY) VALUES ('La Canebière', 'France', 'Marseille');

/*Table Adventure*/
INSERT INTO Adventure (DATE_END, DATE_START, DESCRIPTION, CATEGORY_ID, PLACE_ID, NAME, NUMBER_OF_PARTICIPANTS, PRICE) VALUES ('2018-09-04','2018-09-04', 'Bapteme en helicoptere', 1, 1,'pret pour le bapteme ?',2, 200);
INSERT INTO Adventure (DATE_END, DATE_START, DESCRIPTION, CATEGORY_ID, PLACE_ID, NAME, NUMBER_OF_PARTICIPANTS, PRICE) VALUES ('2018-09-04','2018-09-04','Saut en parachute', 2, 3,'sautez de tres haut !',5 ,100 );
INSERT INTO Adventure (DATE_END, DATE_START, DESCRIPTION, CATEGORY_ID, PLACE_ID, NAME, NUMBER_OF_PARTICIPANTS, PRICE) VALUES ('2018-09-04','2018-09-04','Vol en mongolfiere', 1, 2,'envolez-vous !',100,4);

/*Table Picture*/
INSERT INTO Picture (ADVENTURE_ID, PATH) VALUES ('1','/pictures/eiffel.jpeg');
INSERT INTO Picture (ADVENTURE_ID, PATH) VALUES ('1','/pictures/eiffel2.jpeg');
INSERT INTO Picture (ADVENTURE_ID, PATH) VALUES ('2','/pictures/sea.jpeg');
INSERT INTO Picture (ADVENTURE_ID, PATH) VALUES ('2','/pictures/sea2.jpg');
INSERT INTO Picture (ADVENTURE_ID, PATH) VALUES ('3','/pictures/animal2.jpeg');
INSERT INTO Picture (ADVENTURE_ID, PATH) VALUES ('3','/pictures/animal1.jpeg');*/

