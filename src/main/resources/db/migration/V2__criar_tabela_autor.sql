create table autor (
  id int not null auto_increment primary key,
  nome varchar(100) not null,
  nacionalidade varchar(100) not null,
  lista_livros varchar(100) not null,
  FOREIGN KEY (lista_livros) REFERENCES livro(id)
  );