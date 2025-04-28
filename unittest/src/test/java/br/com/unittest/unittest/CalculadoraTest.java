package br.com.unittest.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
  private final Calculadora calculadora = new Calculadora();

  @Test
  void testAdd() {
    assertEquals(2, calculadora.somar(1, 1), "1 + 2 deveria ser 2");
  }

  @Test
  void testMultiplicar() {
    assertEquals(2, calculadora.multiplicar(2, 3), "2 * 3 deveria ser 6");
  }

}
