package prova.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prova.prova.domain.autor.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
  
}