INSERT INTO books (book_name,book_cost,book_deport,book_quantity)
VALUES
( 'bookName1' ,10000, 'deport1', 14),
( 'Windows' ,21000, 'deport1', 4),
( 'WindowsNT' ,30000, 'deport2', 2),
( 'WindowsServer' ,10000, 'deport2', 6),
( 'bookName5' ,40000, 'deport3', 12),
( 'bookName6' ,30000, 'deport3', 13),
( 'bookName7' ,15000, 'deport4', 8),
( 'bookName8' ,50000, 'deport4', 9)


INSERT INTO buyers (buyer_name,buyer_district,buyer_discount)
VALUES
( 'buyerName1' ,'Sormovsky',5),
( 'buyerName2' ,'Sovetsky',5),
( 'buyerName3' ,'Avtozavodsky',10),
( 'buyerName4' ,'Sormovsky',10),
( 'buyerName5' ,'Nizhegorodsky',15),
( 'buyerName6' ,'Sovetsky',15)




INSERT INTO store (store_name,store_district,store_commission)
VALUES
( 'storeName1' ,'Sormovsky',5),
( 'storeName2' ,'Sormovsky',5),
( 'storeName3' ,'Sovetsky',10),
( 'storeName4' ,'Nizhegorodsky',10),
( 'storeName5' ,'Sovetsky',5),
( 'storeName6' ,'Nizhegorodsky',10)


INSERT INTO orders (order_date,order_seller,order_buyer,order_book,order_quantity,order_amount)
VALUES
('22.03.2019',1,1,1,1,9500),
('23.03.2019',1,2,2,2,39900),
('24.03.2019',2,3,3,3,81000),
('26.03.2019',3,4,4,1,9500),
('02.04.2019',4,5,5,2,68000),
('10.04.2019',5,6,6,2,51000),
('11.04.2019',6,1,7,1,14250),
('14.04.2019',2,3,8,1,45000)