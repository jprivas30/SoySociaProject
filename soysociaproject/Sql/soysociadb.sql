CREATE SCHEMA soysocia;

USE soysocia;

CREATE TABLE Usuario (
	usuario_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(30),
	apellido VARCHAR(30),
    rut	VARCHAR(12)		,
    correo	VARCHAR(40)	,
    username	VARCHAR(15),
    contrasenia VARCHAR(15)	,
    telefono INTEGER,
    redsocial VARCHAR(30),
    interes1 VARCHAR(30),
    interes2 VARCHAR(30),
    interes3 VARCHAR(30),
    fecha_creacion_cuenta DATETIME,
    status		CHAR(1)	,
    descripcion	VARCHAR(250)	,
    imagen VARCHAR(150),
    rol VARCHAR(15)
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

INSERT INTO Usuario (nombre, apellido, rut, correo, username, contrasenia, telefono, redsocial, interes1, interes2, interes3, fecha_creacion_cuenta, status, descripcion, imagen, rol)
VALUES ("Elen",	"Caballero",	"10801627-2",	"E_Caballero@gmail.com",	"ElenCaballero",	"123EC321",	945265478,	"Elen.Escribe",	"Administrar el tiempo",	"Psicología",	"Administración",	"2023-04-08 12:40:50",	"D", "Comparto mi mundo, lleno de relatos y aventuras. Me gusta enseñar a como construir una historia atractiva e interesante que logre conectar con tu público.", "https://i.ibb.co/17Xpv8R/4.png", "Colaboradora"),
("Javiera", "Gonzales", "12587446-8", "Javidiseña@gmail.com",	"JaviGart",	"123JG321",	926951478,	"JaviGart",	"Manualidades",	"Artesania", "Como tener más clientes",	"2023-04-08 09:40:50",	"D",	"El arte y la naturaleza son mi inspiración. Soy apasionada de crear identidades de marcas y ayudar a quienes estan empezando, dandole una personalidad e identificación.", "https://i.ibb.co/fS5C0nv/5.png", "Colaboradora"),
("Miranda",	"de la Torre",	"27640582-9",	"Miranda1Torre@gmail.com",	"MirandaTorre",	"123MT321",	916963258,	"Miranda-Torre1",	"Formalización de negocios", "Postulación a fondos", "Usar mejor mi tiempo",	"2023-04-07 09:40:50",	"D",	"Especialista y amante de la leyes.", "https://i.ibb.co/pRdChCy/6.png", "Colaboradora"),
("Catalina",	"Arroyo",	"32500760-5",	"ArroyoCata@gmail.com",	"ArroyoCata",	"123CA321",	975632478,	"ArroyoCata98",	"Tecnología",	"Aprender publicidad", "Usar mejor el computador",	"2023-04-07 15:40:50",	"D",	"Me dicen Cata, llevo mi propia empresa de tecnología enfocada en apoyar a empredimientos con sus páginas web y ventas.", "https://i.ibb.co/JQvx9Fd/7.png", "Colaboradora"),
("Antonia",	"Yang",	"56641840-1",	"Yang.Antonia@gmail.com",	"YangAconseja",	"123AY321",	972634781,	"YangAconseja",	"Psicología",	"Reciclaje",	"Calidad de vida",	"2023-04-07 20:40:50",	"D",	"Soy conocida como YangAconseja por mi comunidad en instagram y Youtube. Suelo de hablar de como enfrentar adversidades y vivir una vida más feliz y tranquila.", "https://i.ibb.co/r4bRMYm/8.png", "Colaboradora"),
("Gissele",	"Contreras",	"12021185-4",	"GisseleMusa@gmail.com",	"GisseleMusic",	"123GC321",	972631145,	"GisseleMusa",		"2023-04-02 20:40:50",	"D",	"La música ha sido una parte importante en mi vida por lo que me he encargado de mostrarsela al mundo.", "https://i.ibb.co/DbDDxWM/9.png", "Colaboradora"),
("Maria",	"Rojas",	"13110505-3",	"Roja.Maria@gmail.com",	"Roja.Maria",	"123MR321",	985234781, "Formalización de negocios", "Contabilidad", "Finanzas", "2023-04-03 20:40:50",	"D",	"Soy Maria Rojas, 32 años, tengo titulos en ciencias políticas y economía, pero mi mayor pasión es ver como sueños se convierten en empresas y acompañar en ese proceso.", "https://i.ibb.co/CJ8Fr72/1.png", "Colaboradora"),
("Alisa",	"Rivas", 	"27412679-5",	"Alisa.Ri@gmail.com",	"AlisaRivas",	"123AR321",	915742965,	"AlisateCuenta",	"Contabilidad",	"Como fijar precios", "Finanzas",	"2023-04-08 10:40:50",	"D",	"Soy Alisa Rivas, Chilena de 27 años Contadora de profesión, he trabajado con grander empresas y organizaciones. Me gusta el orden y en mi tiempo libre la paso con mi familia.", "https://i.ibb.co/nwJX4Gj/2.png", "Colaboradora"),
("Karen", "Zapata", "27965413-7", "KarenZp@gmail.com", "KarenZ", "123KZ321", 952446872, "KarenZ", "Servicios de mantención", "Usar mejor el computador", "Usar mejor redes sociales", "2023-04-03 20:15:50",	"D", "https://i.ibb.co/YbgJfwR/3.png", "Colaboradora");


INSERT INTO Tutorial (titulo,descripcion,contenido,enlace,categoria) VALUES 
("Como ingresar a soy socia","Aca te explicaremos como ser parte de nuestra comunidad","fdnwkefnenwpfwemfcwejijmewoifjcwoiejoewnfoew","https://www.inmejorableinversiongastronomica.cl/","aprende");


SELECT * FROM Tutorial_usuario;
SELECT * FROM Tutorial;
SELECT * FROM Usuario;
SELECT * FROM Foro;
SELECT * FROM Comentario;