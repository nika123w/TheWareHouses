CREATE TABLE warehouse (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE shop (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE shop_warehouse (
    shop_id BIGINT NOT NULL,
    warehouse_id BIGINT NOT NULL,
    PRIMARY KEY (shop_id, warehouse_id),
    FOREIGN KEY (shop_id) REFERENCES shop(id),
    FOREIGN KEY (warehouse_id) REFERENCES warehouse(id)
);

CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    quantity INTEGER NOT NULL,
    warehouse_id BIGINT NOT NULL,
    shop_id BIGINT NOT NULL,
    FOREIGN KEY (warehouse_id) REFERENCES warehouse(id),
    FOREIGN KEY (shop_id) REFERENCES shop(id)
);
