-- *for Windows
-- \! chcp 1251

-- *for Linux
-- sudo -i -u postgres
-- psql

-- *new password for user postgres
-- ALTER USER postgres PASSWORD 'admin';

-- DROP SCHEMA IF EXISTS spring_cloud_hw;
-- CREATE SCHEMA spring_cloud_hw;
--
-- SET search_path TO spring_cloud_hw;

DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products (id bigserial, title varchar(255), price numeric(8, 2), PRIMARY KEY (id));
-- \d products;
INSERT INTO products (title, price) VALUES
('АС-Аврора-16 (mono)', 11250),
('АС-Аврора-32 (mono)', 12250),
('АС-Аврора-50 (mono)', 13250),
('АС-Аврора-65 (mono)', 14250),
('АС-Аврора-16 (RGB)', 15500),
('АС-Аврора-32 (RGB)', 16500),
('АС-Аврора-50 (RGB)', 17500),
('АС-Аврора-65 (RGB)', 18500),
('АС-Спектрум-105', 19500),
('АС-Спектрум-210', 20500);
-- SELECT * FROM products;