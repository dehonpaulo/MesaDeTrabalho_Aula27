package com.dehon.MesaDeTrabalho_Aula27.persistence.repository;

import com.dehon.MesaDeTrabalho_Aula27.persistence.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
