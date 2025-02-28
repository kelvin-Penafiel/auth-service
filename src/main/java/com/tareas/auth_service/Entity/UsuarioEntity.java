package com.tareas.auth_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
@Data
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable = false, unique = true)
    private String identificacion;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String password;

    @Column(name = "nickusuario")
    private String nickusuario;
}