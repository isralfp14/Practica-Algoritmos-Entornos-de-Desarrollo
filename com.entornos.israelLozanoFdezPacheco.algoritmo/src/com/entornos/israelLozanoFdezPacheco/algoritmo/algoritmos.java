package com.entornos.israelLozanoFdezPacheco.algoritmo;

public class algoritmos {
	
	/**
	 * Metodo que devuelve el numero fibonacci del digito que recibe
	 * @return numero de fibonacci
	 * */
	
	public int fibonacci(int numero) { //numero de la secuencia a generar
		int n1 = 0;
		int n2 = 1;
		int suma;
		if(numero < 0) {
			throw new IllegalArgumentException();
		}
		for(int i = 0; i < numero; i++) {
			suma = n1 + n2;
			n1 = n2;
			n2 = suma;
		}	
	
		return n1; // n1 ahora devuelve el ultimo numero calculado
		
	}

	
	/**
	 * Metodo que devuelve el numero factorial del digito que recibe
	 * @return numero factorial
	 * */
	public int factorial(int numero) {
		int factorial = 1;
		if(numero < 0) {
			throw new IllegalArgumentException();
		}
				for(int i = 1; i <= numero; i++) {
					factorial = i * factorial;
				}
		
		return factorial;
	}
	
	/**
	 * Metodo que devuelve el numero primo del digito que recibe
	 * @return si es numero primo o no
	 * */
	
	public boolean primo(int numero) {
		boolean primo = true; //true si es primo, false si no lo es
		if(numero < 2) {
			throw new IllegalArgumentException();
		}
				 for(int i = 2; i < numero; i++) {
						if(numero % i == 0) {
							primo = false;
							i = numero -1;
						}
					}
		return primo;
	}
}
