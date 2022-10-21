package com.exercicioaula.mayumeli.exercicioaula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Entity // indica que esta classe será persistida no banco
@Table(name = "user") // opcional - nome da tabela no banco
public class UserBD {

    @Id // indica que este atributo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o valor automaticamente (1, 2, 3...)
    private long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(name = "e_mail", length = 100, unique = true)
    private String email;
}
