
create database hospital_management_system;
use hospital_management_system;


create table login(ID varchar(20),PW varchar(20));
select * from login;


insert into login value("sanskriti","123456789");

create table patient_info(ID varchar(20), Number varchar(40), Name varchar(20), gender varchar(20),
Patient_Disease varchar(20),Room_Number varchar(20), Time varchar(100), Deposit varchar(20));
select * from patient_info;

create table Room(room_no varchar(20), Availability varchar(20), Price varchar(20) , 
Room_type varchar(50));
select * from Room;

insert into Room values("100","Availabil","500","G Bed 1");
insert into Room values("101","Availabil","500","G Bed 2");
insert into Room values("102","Availabil","500","G Bed 3");
insert into Room values("103","Availabil","500","G Bed 4");
insert into Room values("200","Availabil","1500","Private Room");
insert into Room values("201","Availabil","1500","Private Room");
insert into Room values("202","Availabil","1500","Private Room");
insert into Room values("203","Availabil","1500","Private Room");
insert into Room values("300","Availabil","3500","ICU Bed 1");
insert into Room values("301","Availabil","3500","ICU Bed 2");
insert into Room values("302","Availabil","3500","ICU Bed 3");
insert into Room values("303","Availabil","3500","ICU Bed 4");
insert into Room values("304","Availabil","3500","ICU Bed 5");
insert into Room values("305","Availabil","3500","ICU Bed 6");

SET SQL_SAFE_UPDATES = 0;

UPDATE Room
SET Availability = 'Available'
WHERE Availability = 'Availabil';

SET SQL_SAFE_UPDATES = 1;

create table Department( Department varchar(100), Phone_no varchar(20));
select * from Department;

insert into Department values("Surgical department","9818597567");
insert into Department values("Nursing department","8368859338");
insert into Department values("Operation Theatre (OT)","8586003867");
insert into Department values("Paramedical Department","9999010387");

create table EMP_INFO(Name varchar(20), Age varchar(20), Phone_Number varchar(20), salary varchar(20), Gmail varchar(20), Aadhar_Number varchar(20));
select * from EMP_INFO;

INSERT INTO EMP_INFO VALUES ('Amit Sharma', '28', '9876543210', '45000', 'amit@gmail.com', '123456789012');

INSERT INTO EMP_INFO VALUES ('Priya Verma', '25', '9123456780', '52000', 'priya@gmail.com', '234567890123');

INSERT INTO EMP_INFO VALUES ('Rahul Singh', '30', '9988776655', '60000', 'rahul@gmail.com', '345678901234');

INSERT INTO EMP_INFO VALUES ('Sneha Gupta', '27', '9012345678', '48000', 'sneha@gmail.com', '456789012345');

INSERT INTO EMP_INFO VALUES ('Karan Mehta', '32', '9871234567', '70000', 'karan@gmail.com', '567890123456');

INSERT INTO EMP_INFO VALUES ('Neha Joshi', '24', '9090909090', '40000', 'neha@gmail.com', '678901234567');

INSERT INTO EMP_INFO VALUES ('Rohit Kumar', '29', '9811122233', '55000', 'rohit@gmail.com', '789012345678');

INSERT INTO EMP_INFO VALUES ('Anjali Kapoor', '26', '9765432109', '50000', 'anjali@gmail.com', '890123456789');

INSERT INTO EMP_INFO VALUES ('Vikas Yadav', '35', '9955667788', '80000', 'vikas@gmail.com', '901234567890');

INSERT INTO EMP_INFO VALUES ('Pooja Mishra', '23', '9887766554', '42000', 'pooja@gmail.com', '112233445566');

create table Ambulance(Name varchar(20), Gender varchar(20), Car_name varchar(20), Available varchar(20), Location varchar(20));
insert into Ambulance values("Avinash","Male","ZEN","Available","Sector-1");
