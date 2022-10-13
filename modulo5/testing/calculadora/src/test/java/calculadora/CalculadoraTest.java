package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
