package prova.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prova.prova.domain.livro.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}