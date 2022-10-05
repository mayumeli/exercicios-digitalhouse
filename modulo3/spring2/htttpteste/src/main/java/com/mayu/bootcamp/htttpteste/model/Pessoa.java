package com.mayu.bootcamp.htttpteste.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
  private String nome;
  private String sobrenome;
  private int idade;
}
