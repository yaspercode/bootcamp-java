CREATE DATABASE db_streaming_netflix;
USE db_streaming_netflix;

create table users(
  	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    email int NOT NULL,
    username varchar(40) NOT NULL,
    password_user int NOT NULL
);
create table profile_user(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    profile_name varchar(100) NOT NULL,
    id_users int,
    FOREIGN KEY (id_users) REFERENCES users(id)
);
create table genre(
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(100)
);
create table movie(
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	title varchar(100) NOT NULL,
    synopsis varchar(255) NOT NULL,
    release_date date,
    rating double,
    id_genre int,
    FOREIGN KEY (id_genre) REFERENCES genre(id)
);
create table series(
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title varchar(100) NOT NULL,
    synopsis varchar(255) NOT NULL,
    season int,
    release_date date,
    last_update date,
    rating double,
    episodes int,
    id_genre int,
    FOREIGN KEY (id_genre) REFERENCES genre(id)
);

create table movie_playlist(
  	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_profile int,
    movie_id int,
    FOREIGN KEY (id_profile) REFERENCES profile_user(id),
    FOREIGN KEY (movie_id) REFERENCES movie(id)
);
create table series_playlist(
  	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    profile_id int,
    series_id int,
    FOREIGN KEY (profile_id) REFERENCES profile_user(id),
    FOREIGN KEY (series_id) REFERENCES series(id)
);
