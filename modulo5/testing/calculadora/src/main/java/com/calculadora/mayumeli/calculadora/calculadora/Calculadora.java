package com.calculadora.mayumeli.calculadora.calculadora;

public class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double diminuir(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }
}
