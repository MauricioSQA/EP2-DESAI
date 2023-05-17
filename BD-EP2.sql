CREATE TABLE Usuario (
  idUsuario INT AUTO_INCREMENT PRIMARY KEY,
  nombreUsuario VARCHAR(30),
  apelliUsuario VARCHAR(30),
  emailUsuario VARCHAR(30),
  contraUsuario VARCHAR(50)
);

CREATE TABLE medico (
  idMedico INT AUTO_INCREMENT PRIMARY KEY,
  nombreMedico VARCHAR(30),
  apelliMedico VARCHAR(30),
  sexoMedico VARCHAR(10),
  colegiMedico VARCHAR(10),  
  EspeciMedico VARCHAR(30),
  emailMedico VARCHAR(30),
  contraMedico VARCHAR(50)
);