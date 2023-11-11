use surveydb;

CREATE TABLE surveys(
id bigint NOT NULL AUTO_INCREMENT,
city varchar (255) NOT NULL,
comments varchar(255) DEFAULT NULL,
date_of_survey date NOT NULL,
email varchar(255) NOT NULL,
first_name varchar (255) NOT NULL,
hear_abt_us varchar (255) DEFAULT NULL,
last_name varchar (255) NOT NULL,
recommend varchar (255) DEFAULT NULL,
state varchar(255) NOT NULL,
street_address varchar(255) NOT NULL,
tel_num bigint NOT NULL,
zip int NOT NULL,
PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SHOW PROCESSLIST;

select * from surveys;

-- delete from surveys where id=1;

CREATE TABLE likes_abt_campus(
id bigint NOT NULL,
likes_abt varchar(255) DEFAULT NULL,
FOREIGN KEY (id) REFERENCES surveys(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into surveys values(1,'hyd', NULL, STR_TO_DATE('1-01-2023', '%d-%m-%Y'), 'ex@gmail.com', 'lokesh', 'friends', 
'mamidi', 'yes', 'Virginia', '5b', 7039759559, 22030);