package level.one.operators;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticTest {
    /**
     * Voce pode clicar encima do nome do metodo e com o botao direito
     * rodar ele separadamente
     * Ou pode clicar abaixo do cabecalho da classe e rodar todos os testes
     */

    Arithmetic arithmetic;

    @Before
    public void setUp() throws Exception {
        arithmetic = new Arithmetic();
    }

    /**
     * testes para formulas de adicao e subtraction:
     */
    @Test
    public void addition1() {
        assertEquals(10, arithmetic.addition(3, 7));
    }

    @Test
    public void addition2() {
        assertEquals(0, arithmetic.addition(3, -3));
    }

    @Test
    public void subtraction1() {
        assertEquals(6, arithmetic.subtraction(3, -3));
    }

    @Test
    public void subtraction2() {
        assertEquals(300, arithmetic.subtraction(300, 0));
    }

    /**
     * testes para formulas de multiplicacao e divisao:
     */
    @Test
    public void division1() {
        assertEquals(3, arithmetic.division(30, 10));
    }

    @Test
    public void division2() {
        assertEquals(0, arithmetic.division(2, 0));
    }

    @Test
    public void multiplication1() {
        assertEquals(0, arithmetic.multiplication(2, 0));
    }

    @Test
    public void multiplication2() {
        assertEquals(-24, arithmetic.multiplication(12, -2));
    }

    /**
     * Outras funcoes
     */
    @Test
    public void calculationOne() {
        assertEquals(-22, arithmetic.calculationOne(12, -2));
    }

    @Test
    public void calculationTwo() {
        assertEquals(-20, arithmetic.calculationTwo(12, -2));
    }

    @Test
    public void calculationOne1() {
        assertEquals(-2, arithmetic.calculationOne(0, -2));
    }

    @Test
    public void calculationTwo1() {
        assertEquals(400, arithmetic.calculationTwo(100, 100));
    }

    /**
     * Teste para conversao de graus Celcius para Fahrenheit
     */
    @Test
    public void celsiusToFahrenheit1() {
        assertEquals(32, arithmetic.celsiusToFahrenheit(0));
    }

    @Test
    public void celsiusToFahrenheit2() {
        assertEquals(89.6, arithmetic.celsiusToFahrenheit(32));
    }

    @Test
    public void celsiusToFahrenheit3() {
        assertEquals(30.2, arithmetic.celsiusToFahrenheit(-1));
    }

}