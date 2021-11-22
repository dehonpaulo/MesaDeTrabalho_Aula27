package com.dehon.MesaDeTrabalho_Aula27.controller;

import com.dehon.MesaDeTrabalho_Aula27.persistence.entities.Usuario;
import com.dehon.MesaDeTrabalho_Aula27.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioRestController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarUsuarios() {
        return ResponseEntity.ok(service.obterUsuarios());
    }

    @PostMapping
    public ResponseEntity<String> criarUsuario(@RequestBody Usuario usuario) {
        if(service.salvarUsuario(usuario) != null) {
            return ResponseEntity.ok("Salvo com sucesso");
        }
        return ResponseEntity.badRequest().body("Não foi possível salvar");
    }

}
