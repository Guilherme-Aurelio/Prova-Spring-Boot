create table usuario (
  id int not null auto_increment primary key,
  nome varchar(100) not null,
  data_registro datetime not null,
  lista_emprestimos int not null
  );