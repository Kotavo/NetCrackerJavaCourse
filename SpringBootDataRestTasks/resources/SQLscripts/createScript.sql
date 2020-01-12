CREATE DATABASE bookstore
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Russia.1251'
    LC_CTYPE = 'Russian_Russia.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


CREATE TABLE buyers (
buyer_id serial CONSTRAINT buyer_id PRIMARY KEY,
buyer_name varchar(30),
buyer_district varchar(40),
buyer_discount float4
);

CREATE TABLE store (
store_id serial CONSTRAINT store_id PRIMARY KEY,
store_name varchar(30),
store_district varchar(40),
store_commission float4
);

CREATE TABLE books (
book_id serial CONSTRAINT book_id PRIMARY KEY,
book_name varchar(30),
book_cost float4,
book_deport varchar(40),
book_quantity int
);


CREATE TABLE orders (
order_id serial CONSTRAINT order_id PRIMARY KEY,
order_date date,
order_seller int NOT NULL,
order_buyer int NOT NULL,
order_book int  NOT NULL,
order_quantity int,
order_amount float4,
FOREIGN KEY (order_seller) REFERENCES store (store_id) ON DELETE NO ACTION ON UPDATE CASCADE,
FOREIGN KEY (order_buyer) REFERENCES buyers (buyer_id)ON DELETE NO ACTION ON UPDATE CASCADE,
FOREIGN KEY (order_book) REFERENCES books (book_id)	ON DELETE NO ACTION ON UPDATE CASCADE
);