CREATE TABLE IF NOT EXISTS category (
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    description varchar(255)
);


CREATE TABLE IF NOT EXISTS product(
    id INt PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    description varchar(255),
    price double ,
    categoryId int ,
    FOREIGN KEY (categoryId) REFERENCES category(id)


)