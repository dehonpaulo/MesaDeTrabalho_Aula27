package com.dehon.MesaDeTrabalho_Aula27.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TABELA_USUARIOS")
@Getter @Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String usuario;

    private String password;
}
