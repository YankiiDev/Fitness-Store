CREATE TABLE Category
(
    id   INTEGER PRIMARY KEY,
    name VARCHAR NOT NULL,
);

CREATE TABLE SubCategory
(
    id       INTEGER PRIMARY KEY,
    name     VARCHAR NOT NULL,
    category INTEGER
);

CREATE TABLE Discount
(
    id            INTEGER PRIMARY KEY,
    discount_name VARCHAR NOT NULL,
    is_active     BOOLEAN,
    percentage    DOUBLE PRECISION,
);

CREATE TABLE Product_Info
(
    product_id   INTEGER PRIMARY KEY,
    name         VARCHAR NOT NULL,
    discount     INTEGER,
    sub_category INTEGER
);
