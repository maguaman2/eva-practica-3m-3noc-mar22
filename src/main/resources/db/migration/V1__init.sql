CREATE TABLE IF NOT EXISTS pago (
    id SERIAL,
    placa VARCHAR (8) NOT NULL,
    anio int not null,
    valor int not null,
    PRIMARY KEY (id)
    );