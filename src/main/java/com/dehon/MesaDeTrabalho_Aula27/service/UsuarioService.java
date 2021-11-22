package com.dehon.MesaDeTrabalho_Aula27.service;

import com.dehon.MesaDeTrabalho_Aula27.persistence.entities.Usuario;
import com.dehon.MesaDeTrabalho_Aula27.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> obterUsuarios() {
        return repository.findAll();
    }

    public String salvarUsuario(Usuario usuario) {
        if(repository.save(usuario) != null) {
            return "Salvo com sucesso";
        }
        return null;
    }
}
