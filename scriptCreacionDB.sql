CREATE TABLE autor (
                       idautor INTEGER NOT NULL,
                       nombre TEXT NOT NULL,
                       apellido TEXT NOT NULL,
                       PRIMARY KEY (idautor)
);

CREATE TABLE libro (
                       idlibro INTEGER NOT NULL,
                       nombre TEXT NOT NULL,
                       volumen INTEGER NOT NULL,
                       edicion INTEGER NOT NULL,
                       fechaPublicacion DATE NOT NULL,
                       cantPag INTEGER NOT NULL,
                       copias INTEGER NOT NULL,
                       PRIMARY KEY (idlibro)
);

CREATE TABLE autorEnLibro (
                              idlibro INTEGER NOT NULL,
                              idautor INTEGER NOT NULL,
                              PRIMARY KEY (idlibro, idautor),
                              FOREIGN KEY (idlibro)
                                  REFERENCES libro(idlibro),
                              FOREIGN KEY (idautor)
                                  REFERENCES autor(idautor)
);

CREATE TABLE bibliotecario (
                               idbibliotecario INTEGER NOT NULL,
                               nombre TEXT NOT NULL,
                               apellido TEXT NOT NULL,
                               PRIMARY KEY (idbibliotecario)
);

CREATE TABLE lector (
                        idlector INTEGER NOT NULL,
                        nombre TEXT NOT NULL,
                        apellido TEXT NOT NULL,
                        PRIMARY KEY (idlector)
);

CREATE TABLE estadoPrestamo (
                                idestadoPrestamo INTEGER NOT NULL,
                                estado TEXT NOT NULL,
                                PRIMARY KEY (idestadoPrestamo)
);

CREATE TABLE prestamo (
                          idprestamo INTEGER NOT NULL,
                          fechaRetiro DATE NOT NULL,
                          fechaDevolucion DATE NOT NULL,
                          idlector INTEGER NOT NULL,
                          idbibliotecario INTEGER NOT NULL,
                          idestadoPrestamo INTEGER NOT NULL,
                          PRIMARY KEY (idprestamo),
                          FOREIGN KEY (idlector)
                              REFERENCES lector(idlector),
                          FOREIGN KEY (idbibliotecario)
                              REFERENCES bibliotecario(idbibliotecario),
                          FOREIGN KEY (idestadoPrestamo)
                              REFERENCES estadoPrestamo(idestadoPrestamo)
);

CREATE TABLE libroEnPrestamo (
                                 idlibro INTEGER NOT NULL,
                                 idprestamo INTEGER NOT NULL,
                                 copiasPrestadas INTEGER NOT NULL,
                                 PRIMARY KEY (idlibro, idprestamo),
                                 FOREIGN KEY (idlibro)
                                     REFERENCES libro(idlibro),
                                 FOREIGN KEY (idprestamo)
                                     REFERENCES prestamo(idprestamo)
);