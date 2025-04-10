package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import PruebasJUnit.Calculadora;

class CalculadoraTest {

	@Test
	void testSumar() {
		Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3)); // 2 + 3 = 5
	}
	
	@Test
	public void testSumarConNegativos() {

	    Calculadora calc = new Calculadora();

	    assertEquals(-1, calc.sumar(2, -3)); // 2 + (-3) = -1

	}

	@Test
	public void testSumarConCero() {

	    Calculadora calc = new Calculadora();

	    assertEquals(10, calc.sumar(10, 0)); // 10 + 0 = 10

	}
	
	@Test
	public void testSumarConNumeroGrande() {

	    Calculadora calc = new Calculadora();

	    assertEquals(824344904, calc.sumar(10, 824344894)); // 10 + 824344894 = 824344904

	}

}
