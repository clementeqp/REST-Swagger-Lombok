
DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes (
                                id BIGINT AUTO_INCREMENT  PRIMARY KEY,
                                nombre VARCHAR(250) NOT NULL,
                                apellidos VARCHAR(250) NOT NULL,
                                fecha_alta DATE,
                                dni VARCHAR(250) NOT NULL
);



