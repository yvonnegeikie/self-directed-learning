Create database SQLbolt;
USE SQLbolt;

Create table North_american_cities(
City varchar (50),
Country varchar (50),
Population int,
Latitude float,
Longitude float
);

INSERT into North_american_cities VALUES 
('Guadalajara', 'Mexico', 1500800, 20.659699, -103.349609), 
('Toronto', 'Canada', 2795060, 43.653226, -79.383184),
('Houston', 'United States', 2195914, 29.760427, -95.369803),
('New York', 'United States', 8405837, 40.712784, -74.005941), 
('Philadelphia', 'United States', 1553165, 39.952584, -75.165222),
('Havana', 'Cuba', 2106146, 23.05407, -82.345189),
('Mexico City', 'Mexico', 8555500, 19.432608, -99.133208),
('Phoenix', 'United States', 1513367, 33.448377, -112.074037),
('Los Angeles', 'United States', 3884307, 34.052234, -118.243685),
('Ecatepec de Morelos', 'Mexico', 1742000, 19.601841, -99.050674)
;

DESCRIBE North_american_cities;

-- 1 List all the Canadian cities and their populations 
SELECT city, population FROM north_american_cities WHERE country = 'Canada' ORDER BY population; 

-- 2 Order all the cities in the United States by their latitude from north to south 
SELECT city, latitude FROM north_american_cities
WHERE country = "United States" ORDER BY latitude DESC;

-- 3 List all the cities west of Chicago, ordered from west to east 
SELECT city, longitude FROM north_american_cities
WHERE longitude < -87.629798
ORDER BY longitude ASC;

-- 4 List the two largest cities in Mexico (by population)
SELECT city, population FROM north_american_cities
WHERE country LIKE "Mexico"
ORDER BY population DESC
LIMIT 2;

-- 5 List the third and fourth largest cities (by population) in the United States and their population
SELECT city, population FROM north_american_cities WHERE country = 'United States' 
ORDER BY population DESC LIMIT 2 OFFSET 2; 
