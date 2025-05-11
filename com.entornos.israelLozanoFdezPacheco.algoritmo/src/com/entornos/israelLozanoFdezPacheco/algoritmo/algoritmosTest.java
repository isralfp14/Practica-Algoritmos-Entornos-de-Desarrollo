package com.entornos.israelLozanoFdezPacheco.algoritmo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

class algoritmosTest {
	
	static algoritmos a;
	
	@BeforeAll
	static void setup() {
		a = new algoritmos() {};
	}
	
	//Test metodos

	@Test
	void testFibonacci() {
		assertEquals(2, a.fibonacci(3));
		assertEquals(8, a.fibonacci(6));
		assertEquals(21, a.fibonacci(8));
	}

	@Test
	void testFactorial() {
		assertEquals(24, a.factorial(4));
		assertEquals(5040, a.factorial(7));
		assertEquals(720, a.factorial(6));
	}

	@Test
	void testPrimo() {
		assertEquals(true, a.primo(5));
		assertEquals(false, a.primo(9));
		assertEquals(true, a.primo(17));
	}
	
	
	//Test excepciones
	
	@Test
	void testFibonacciExcepcion() {
		assertThrows(IllegalArgumentException.class,() -> {
			a.fibonacci(-1);
		});
	}

	@Test
	void testFactorialExcepcion() {
		assertThrows(IllegalArgumentException.class,() -> {
			a.factorial(-4);
		});
	}

	@Test
	void testPrimoExcepcion() {
		assertThrows(IllegalArgumentException.class,() -> {
			a.primo(-3);
		});
	}

}
