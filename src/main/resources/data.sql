INSERT INTO CLIENT(client_id, client_name) VALUES (1,'Accor Hotel');
INSERT INTO CLIENT(client_id, client_name) VALUES (2,'SG');

INSERT INTO MISSION(mission_id, mission_title, client_id) VALUES (1,'Mission chez Accor', 1);
INSERT INTO MISSION(mission_id, mission_title, client_id) VALUES (2,'Mission chez SG', 2);
INSERT INTO MISSION(mission_id, mission_title, client_id) VALUES (3,'Mission chez Accor 2', 1);


INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone,mission_id) VALUES (1,'Julianne','Adams','SIGNIDYNE','julianne.adams@signidyne.com',37,'true','+1 (830) 477-3286',1);
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone,mission_id) VALUES (2,'Barry','Scott','LOVEPAD','barry.scott@lovepad.com',20,'false','+1 (997) 553-3575',2);
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone) VALUES (3,'Kelli','House','SNORUS','kelli.house@snorus.com',24,'false','+1 (984) 437-2623');
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone) VALUES (4,'Middleton','Chase','TROLLERY','middleton.chase@trollery.com',21,'true','+1 (963) 459-3773');
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone) VALUES (5,'Mays','Pena','BEZAL','mays.pena@bezal.com',28,'true','+1 (956) 443-2365');
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone) VALUES (6,'Barber','Craft','OATFARM','barber.craft@oatfarm.com',25,'true','+1 (912) 410-2833');
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone) VALUES (7,'Socorro','Rasmussen','VIRXO','socorro.rasmussen@virxo.com',23,'false','+1 (832) 458-3280');
INSERT INTO PERSON(person_id,first_name,last_name,company,email,age,active,phone) VALUES (8,'Griffith','Warren','ZEDALIS','griffith.warren@zedalis.com',20,'true','+1 (918) 566-2298');