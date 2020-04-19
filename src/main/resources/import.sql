import.sql

INSERT INTO `appointment` (id,approval_status,date,time,centre_id,patient_id,test_id) VALUES (1,'yes','23-4-2020','8:05pm',1,1,1);

INSERT INTO `centre` (id,name) VALUES (5,'Allahabad');

INSERT INTO `test` (id,name,centre_id) VALUES (1,'Blood',1);
