create table autor (
  id int not null auto_increment primary key,
  nome varchar(100) not null,
  nacionalidade varchar(100) not null,
  lista_livros int not null,
  FOREIGN KEY (lista_livros) REFERENCES livro(id)
  );