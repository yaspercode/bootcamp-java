CREATE DATABASE db_trivia;
use db_trivia;

CREATE TABLE category(
	id int AUTO_INCREMENT NOT NULL,
    name varchar(45),
    description varchar(255),
    PRIMARY KEY(id)
);

CREATE TABLE question(
	id int AUTO_INCREMENT NOT NULL,
    description varchar(255),
    explanation varchar(255),
    category_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE answer(
	id int AUTO_INCREMENT,
    description varchar(255),
    is_correct TINYINT(1),
    question_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (question_id) REFERENCES question(id)
);
