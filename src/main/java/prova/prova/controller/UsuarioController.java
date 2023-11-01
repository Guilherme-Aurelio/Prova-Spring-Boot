package prova.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import prova.prova.domain.usuario.Usuario;
import prova.prova.repository.UsuarioRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("usuarios")

public class UsuarioController {
    
    @Autowired
    private UsuarioRepository repository;
    
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid Usuario usuario, UriComponentsBuilder uriBuilder){
        Usuario usuarioLocal = repository.save(usuario);
        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarioLocal.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}