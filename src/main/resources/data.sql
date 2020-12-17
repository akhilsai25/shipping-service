DROP TABLE IF EXISTS shipping;

CREATE TABLE shipping (
  order_shipping_id INT AUTO_INCREMENT  PRIMARY KEY,
  order_id INT PRIMARY KEY,
  order_shipping_addressline1 VARCHAR(250) NOT NULL,
  order_shipping_addressline2 VARCHAR(250) NULL,
  order_shipping_city VARCHAR(50) NOT NULL,
  order_shipping_state VARCHAR(50) NOT NULL,
  order_shipping_zip INT(50) NOT NULL,
  order_shipping_country VARCHAR(50) NOT NULL
);

INSERT INTO shipping (order_id, order_shipping_addressline1, order_shipping_addressline2,
order_shipping_city, order_shipping_state, order_shipping_zip, order_shipping_country) VALUES
  (1, '123 lincoln ave', '#2', 'pittsburgh','pa',12929,'us'),
  (2, '124 lincoln ave', '#3', 'pittsburgh','pa',12929,'us');