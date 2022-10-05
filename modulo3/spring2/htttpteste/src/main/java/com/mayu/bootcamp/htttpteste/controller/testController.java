package com.mayu.bootcamp.htttpteste.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.mayu.bootcamp.htttpteste.model.Pessoa;

@RestController
@RequestMapping("/test")
@CrossOrigin("*")

public class testController {

  @GetMapping()
  public String returningString() {
    return "Hello World";
  }

  @GetMapping("/variable/{nome}/{sobrenome}")
  public String returnStringTwo(@PathVariable String nome, @PathVariable String sobrenome) {
    return "Hello " + nome + " " + sobrenome;
  }

  @GetMapping("/query/")
  public String returnStringThree(@RequestParam String cidade, @RequestParam String estado) {
    return "Você é de: " + cidade + " " + estado;
  }

  @PostMapping("/post")
  public ResponseEntity<Pessoa> returningStringPost(@RequestBody Pessoa p) {
    return new ResponseEntity<>(p, HttpStatus.OK);
  }

  @GetMapping("/lista")
  @ResponseBody
  public List<Pessoa> returningList() {
    ArrayList<Pessoa> lista = new ArrayList<>();
    lista.add(new Pessoa("Mayu", "Santos", 19));
    lista.add(new Pessoa("Mayu", "Santos", 19));
    lista.add(new Pessoa("Mayu", "Santos", 19));
    return lista;
  }
}
