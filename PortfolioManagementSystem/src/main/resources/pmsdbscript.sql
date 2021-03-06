CREATE DATABASE pmsdb;
USE pmsdb;
CREATE TABLE userdetails (
    user_id   int ,
    first_name varchar(20) not null,
     last_name varchar(20) not null,
     mobile_number int,
	register_date DATE,
	password VARCHAR(16),
	role VARCHAR(20),
    PRIMARY KEY (login_id)
);



CREATE TABLE portfolio (
    user_id  int primary key,
    purchased_quantity int,
    sell_quantity int,
    net_quantity int,
    commodity_code int;
    commodity_value int
);
CREATE TABLE company (
    company_id int primary key,
    company_name varchar(50) not null,
    sector  varchar(15) not null check(unit in ('pharmcy','cement','realestate','PACK')),
    turn_over decimal(10,2) not null, 
    user_id int not null,    
	current_price int not null,    
    CONSTRAINT CAT_ITEMS_FK FOREIGN KEY ( user_id ) references categories(user_id)
);
CREATE TABLE portfoliowallet (
    user_id int primary key,   
    total_amount_earned int not null,    
	bankaccount_number int not null, 
	pan_no  int not null
    CONSTRAINT portfoliowallet_PK FOREIGN KEY (pan_no) references categories(pan_no)
);
CREATE TABLE commodity (
    user_id int primary key,   
    commodity_code varchar(50) not null,  
	 commodity_name varchar(50) not null,
	pan_no  int not null,
	quantity  int not null
    CONSTRAINT commodity_PK FOREIGN KEY (pan_no) references categories(pan_no)
);
