CREATE SCHEMA soysocia;

USE soysocia;

CREATE TABLE Usuario (
	usuario_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(15),
	apellido VARCHAR(20)  ,
    rut	VARCHAR(12)		,
    correo	VARCHAR(40)	,
    user	VARCHAR(15),
    contrasenia VARCHAR(15)	,
    telefono INTEGER,
    redsocial VARCHAR(10),
    interes1 VARCHAR(20),
    interes2 VARCHAR(20),
    interes3 VARCHAR(20),
    fecha_creacion_cuenta DATETIME,
    status		CHAR(1)	,
    descripcion	VARCHAR(250)	,
    imagen VARCHAR(150)
);

CREATE TABLE Tutorial(
   tutorial_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
   titulo VARCHAR (50),
   descripcion VARCHAR (250),
   contenido TEXT (64000),
   enlace VARCHAR (100),
   categoria VARCHAR (15)
);

CREATE TABLE Tutorial_usuario(
	tutorialusuario_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
	usuario_id  INTEGER NOT NULL,
    tutorial_id	INTEGER NOT NULL
);
   
   
ALTER TABLE Tutorial_usuario
ADD FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id);
ALTER TABLE Tutorial_usuario
ADD FOREIGN KEY (tutorial_id) REFERENCES Tutorial(tutorial_id);

ALTER TABLE Usuario
RENAME COLUMN user TO username;

INSERT INTO Usuario (nombre, apellido, rut, correo, username, contrasenia, telefono, redsocial, interes1, interes2, interes3, fecha_creacion_cuenta, status, descripcion, imagen)
VALUES ("Karen", "Rodriguez", "27814779-7", "karenrc.rrss@gmail.com", "karenAdmin", "123KK321", 975888420, "karenartc", "bailar", "diseño", "programacion", "2023-04-04 11:40:50", 'D', "Dictadora de esta wea", "https://ibb.co/74r2332 https://i.ibb.co/ZmcWQQW/cpamerica.jpg");


INSERT INTO Tutorial (titulo,descripcion,contenido,enlace,categoria) VALUES 
("Como ingresar a soy socia","Aca te explicaremos como ser parte de nuestra comunidad","fdnwkefnenwpfwemfcwejijmewoifjcwoiejoewnfoew","https://www.inmejorableinversiongastronomica.cl/","aprende");

INSERT INTO Tutorial_usuario (usuario_id,tutorial_id) VALUES (1,1);

CREATE TABLE Foro (
	foro_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    titulo	VARCHAR(100),
    categoria VARCHAR(20),
	cotenido TEXT (64000),
    fecha DATETIME,
    usuario_id INTEGER
);

ALTER TABLE Foro
ADD FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id);

CREATE TABLE Comentario (
	comentario_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    contenido TEXT (64000),
    fecha DATETIME,
    usuario_id INTEGER,
    foro_id INTEGER
);

ALTER TABLE Comentario
ADD FOREIGN KEY (usuario_id) REFERENCES Usuario(usuario_id);

ALTER TABLE Comentario
ADD FOREIGN KEY (foro_id) REFERENCES Foro(foro_id);

SELECT * FROM Tutorial_usuario;
SELECT * FROM Tutorial;
SELECT * FROM Usuario;
SELECT * FROM Foro;
SELECT * FROM Comentario;