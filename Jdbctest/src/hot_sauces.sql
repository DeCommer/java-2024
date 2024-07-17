-- database: hot_sauces 
-- sauceName, Location, heat_scale_to_10, flavor_scale_to_10, comments


CREATE SCHEMA hot_sauces;
USE hot_sauces;

DROP TABLE hot_sauces;

CREATE TABLE hot_sauces (
	id INT AUTO_INCREMENT PRIMARY KEY,
	sauceName VARCHAR(200),
    location VARCHAR(200),
    flavor_type VARCHAR(200),
    heat_rating INT,
    flavor_rating INT,
    comments VARCHAR(500)
);

DESCRIBE hot_sauces;

INSERT INTO hot_sauces VALUES
(1, "Hawaiian Lava Flow", "Hawaii", "Pinapple vinegar" , 4, 2, "Had a strange sour vinegar taste that was not very good");

SELECT * FROM hot_sauces;