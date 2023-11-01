create table livro (
  id int not null auto_increment primary key,
  nome varchar(100) not null,
  isbn int not null,
  anopublicacao year not null,
  copiasdisponiveis int not null,
  autor int not null
  );