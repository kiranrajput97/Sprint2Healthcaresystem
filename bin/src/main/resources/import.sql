import.sql

INSERT INTO `patient` (id,age,contact_no,email,gender,name) VALUES (1,'20','7678986567','prind@hch.com','female','Princy');

INSERT INTO `patient` (id,age,contact_no,email,gender,name) VALUES (2,'20','7678986567','prind@hch.com','female','Kittu');

INSERT INTO `patient` (id,age,contact_no,email,gender,name) VALUES (3,'20','7678986567','prind@hch.com','female','Anurag');

INSERT INTO `patient` (id,age,contact_no,email,gender,name) VALUES (4,'20','7678986567','prind@hch.com','female','Nikhita');

INSERT INTO `patient` (id,age,contact_no,email,gender,name) VALUES (5,'20','7678986567','prind@hch.com','female','Shahrukh');




INSERT INTO `centre` (id,name) VALUES (1,'Jalandhar');
INSERT INTO `centre` (id,name) VALUES (2,'Phagwara');
INSERT INTO `centre` (id,name) VALUES (3,'Mumbai');
INSERT INTO `centre` (id,name) VALUES (4,'Delhi');
INSERT INTO `centre` (id,name) VALUES (5,'Allahabad');


INSERT INTO `test` (id,name,centre_id) VALUES (1,'Blood',1);

INSERT INTO `test` (id,name,centre_id) VALUES (2,'BP',1);

INSERT INTO `test` (id,name,centre_id) VALUES (3,'Corona',2);

INSERT INTO `test` (id,name,centre_id) VALUES (4,'Sugar',2);

INSERT INTO `test` (id,name,centre_id) VALUES (5,'Liver',3);

INSERT INTO `test` (id,name,centre_id) VALUES (6,'Brain',3);



INSERT INTO `appointment` (id,approval_status,date,time,centre_id,patient_id,test_id) VALUES (1,'yes','23-4-2020','8:05pm',1,1,1);

INSERT INTO `appointment` (id,approval_status,date,time,centre_id,patient_id,test_id) VALUES (2,'yes','23-4-2020','8:05pm',2,2,2);