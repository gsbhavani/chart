INSERT INTO customers (first_name, last_name, email, created_at, city) VALUES
    ('John', 'Doe', 'john.doe@example.com', '2023-01-01 10:00:00', 'New York'),
    ('Jane', 'Smith', 'jane.smith@example.com', '2023-01-15 11:30:00', 'Los Angeles'),
    ('Bob', 'Johnson', 'bob.johnson@example.com', '2023-02-01 09:15:00', 'Chicago'),
    ('Alice', 'Brown', 'alice.brown@example.com', '2023-02-15 14:45:00', 'Houston'),
    ('Charlie', 'Davis', 'charlie.davis@example.com', '2023-03-01 16:20:00', 'Phoenix');


    INSERT INTO products (title, price) VALUES
    ('T-shirt', 19.99),
    ('Jeans', 49.99),
    ('Sneakers', 79.99),
    ('Backpack', 39.99),
    ('Watch', 99.99);


    INSERT INTO orders (customer_id, total_price, created_at) VALUES
    (1, 69.98, '2023-01-10 13:30:00'),
    (2, 119.98, '2023-01-20 15:45:00'),
    (3, 159.97, '2023-02-05 11:00:00'),
    (4, 89.98, '2023-02-20 10:15:00'),
    (5, 199.98, '2023-03-05 14:30:00'),
(1, 139.97, '2023-03-15 16:00:00'),
(2, 179.98, '2023-04-01 09:45:00'),
(3, 99.99, '2023-04-10 12:30:00'),
(4, 129.98, '2023-04-20 11:15:00'),
(5, 229.97, '2023-05-01 15:00:00');