package prova.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prova.prova.domain.emprestimo.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
  
}