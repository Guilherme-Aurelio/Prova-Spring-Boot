package prova.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.UserDetails;

import prova.prova.domain.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
  }