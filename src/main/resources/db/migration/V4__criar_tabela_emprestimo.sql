create table emprestimo (
  id int not null auto_increment primary key,
  dataemprestimo datetime not null,
  datadevolucao datetime not null,
  livroemprestado varchar(100) not null,
  id_usuario int not null,
  FOREIGN KEY (id_usuario) REFERENCES usuario(id),
  );