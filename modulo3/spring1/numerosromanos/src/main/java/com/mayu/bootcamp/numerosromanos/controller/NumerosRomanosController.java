package com.mayu.bootcamp.numerosromanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NumerosRomanosController {

  @GetMapping("/{numero}")
  public String convertToRoman(@PathVariable int numero) {
    if (numero < 1 || numero > 3999) {
      return "Invalid Roman Number Value";
    }
    String s = "";
    while (numero >= 1000) {
      s += "M";
      numero -= 1000;
    }
    while (numero >= 900) {
      s += "CM";
      numero -= 900;
    }
    while (numero >= 500) {
      s += "D";
      numero -= 500;
    }
    while (numero >= 400) {
      s += "CD";
      numero -= 400;
    }
    while (numero >= 100) {
      s += "C";
      numero -= 100;
    }
    while (numero >= 90) {
      s += "XC";
      numero -= 90;
    }
    while (numero >= 50) {
      s += "L";
      numero -= 50;
    }
    while (numero >= 40) {
      s += "XL";
      numero -= 40;
    }
    while (numero >= 10) {
      s += "X";
      numero -= 10;
    }
    while (numero >= 9) {
      s += "IX";
      numero -= 9;
    }
    while (numero >= 5) {
      s += "V";
      numero -= 5;
    }
    while (numero >= 4) {
      s += "IV";
      numero -= 4;
    }
    while (numero >= 1) {
      s += "I";
      numero -= 1;
    }
    return s;
  }
}
