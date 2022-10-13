package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.calculadora.mayumeli.calculadora.calculadora.Calculadora;

public class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste de soma")
    public void soma_returnDouble_whenSuccess() {
        double a = 2;
        double b = 2;
        double expected = 4;
        double result = calculadora.somar(a, b);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Teste de divisão")
    public void divisao_returnDouble_whenSuccess() {
        double a = 2;
        double b = 2;
        double expected = 1;
        double result = calculadora.dividir(a, b);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Testa divisão por zero")
    public void divisao_returnException_whenDivideByZero() {
        double a = 2;
        double b = 0;
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(a, b));
    }
}
