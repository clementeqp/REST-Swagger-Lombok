
DROP TABLE IF EXISTS CLIENTES;

CREATE TABLE CLIENTES (
                                id BIGINT AUTO_INCREMENT  PRIMARY KEY,
                                nombre VARCHAR(250) NOT NULL,
                                apellidos VARCHAR(250) NOT NULL,
                                fecha DATE,
                                dni VARCHAR(250) NOT NULL
);



