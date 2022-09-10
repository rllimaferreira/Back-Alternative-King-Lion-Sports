-- AQUI TEMOS O SEEDING DE DADOS

--Produto(Product)
INSERT INTO product (title, description, brand, image, price) VALUES ('Produto teste', 'Descrição teste','Nike', 'https://imgnike-a.akamaihd.net/1300x1300/01091215.jpg', '99.90');

--Categoria(Category)
INSERT INTO category (name) VALUES ('Camiseta');

--Cliente (Client) - Precisa criar o mvc completo
    -- INSERT INTO Client (email, fullname, birthdate, cpf, city, postalcode, state, street, residencenumber, residencecomplement, creationdate)