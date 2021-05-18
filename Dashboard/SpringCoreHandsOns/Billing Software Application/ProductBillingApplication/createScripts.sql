create database if not exists eshopping;
use eshopping;
drop table if exists product;

create table product
(
	product_code int primary key,
	product_name varchar(50) null,
	product_category varchar(50) null,
	product_desc varchar(50) null,
	product_price decimal(8,2)  null
);



 insert into product values(1001,'mobile','electronics','smart phone',35000);
 insert into product values(1002,'LEDTV','electronics','TV',45000);
 insert into product values(1003,'Teddy','toys','soft toy',800);
 insert into product values(1004,'Pencil','stationary','A pack of 12 pencils',80);

