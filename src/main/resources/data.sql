DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  user_name VARCHAR(250) NOT NULL,
  phone_number VARCHAR(250) NOT NULL,
  cell_phone_number VARCHAR(250) NOT NULL,
  birthday VARCHAR(250) NOT NULL,
  blood_group VARCHAR(10) NOT NULL
);