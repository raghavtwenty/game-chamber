use social_network;
-- -----------------------------------------------------
-- Table `mydb`.`profile`
-- -----------------------------------------------------
CREATE TABLE profile (
  `username` VARCHAR(50) PRIMARY KEY,
  `name` VARCHAR(50) NOT NULL,	
  `mail_id` VARCHAR(50) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `profile_pic` MEDIUMBLOB,
  `level` INT  DEFAULT 0,
  `level_points` INT DEFAULT 0);


-- -----------------------------------------------------
-- Table `mydb`.`subway_surfers`
-- -----------------------------------------------------
CREATE TABLE subway_surfers (
  `username` VARCHAR(50) NOT NULL PRIMARY KEY,
  `best_score` INT DEFAULT 0,
  `total_score` INT DEFAULT 0,
  `total_play_time` INT DEFAULT 0,
  `missions_completed` INT DEFAULT 0,
  `achivements` INT DEFAULT 0,
  `chamber_points` INT DEFAULT 0,
    FOREIGN KEY (`username`) REFERENCES profile(`username`) ON DELETE CASCADE);
    

-- -----------------------------------------------------
-- Table `mydb`.`clash_of_clans`
-- -----------------------------------------------------
CREATE TABLE clash_of_clans(
  `username` VARCHAR(50) NOT NULL PRIMARY KEY,
  `toh_level` INT DEFAULT 0,
  `clan_level` INT DEFAULT 0,
  `total_play_time` INT DEFAULT 0,
  `missions_completed` INT DEFAULT 0,
  `achivements` INT DEFAULT 0,
  `chamber_points` INT DEFAULT 0,
    FOREIGN KEY (`username`) REFERENCES profile(`username`) ON DELETE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`BGMI`
-- -----------------------------------------------------
CREATE TABLE bgmi(
  `username` VARCHAR(50) NOT NULL PRIMARY KEY,
  `chicker_dinner` INT DEFAULT 0,
  `total_kills` INT DEFAULT 0,
  `total_play_time` INT DEFAULT 0,
  `missions_completed` INT   DEFAULT 0,
  `achivements` INT   DEFAULT 0,
  `chamber_points` INT   DEFAULT 0,
    FOREIGN KEY (`username`) REFERENCES profile(`username`) ON DELETE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`candy_crush`
-- -----------------------------------------------------
CREATE TABLE candy_crush (
  `username` VARCHAR(50) NOT NULL PRIMARY KEY,
  `best_score` INT   DEFAULT 0,
  `total_score` INT   DEFAULT 0,
  `total_play_time` INT   DEFAULT 0,
  `missions_completed` INT   DEFAULT 0,
  `achivements` INT   DEFAULT 0,
  `chamber_points` INT   DEFAULT 0,
    FOREIGN KEY (`username`) REFERENCES profile(`username`) ON DELETE CASCADE);

INSERT INTO SUBWAY_SURFERS VALUES('',0,0,0,0,0,0);
INSERT INTO CLASH_OF_CLANS VALUES('',0,0,0,0,0,0);
INSERT INTO BGMI VALUES('',0,0,0,0,0,0);
INSERT INTO CANDY_CRUSH VALUES('',0,0,0,0,0,0);
