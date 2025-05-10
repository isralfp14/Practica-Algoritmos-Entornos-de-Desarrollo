package com.entornos.nombreCompleto.algoritmo;

public class algoritmos {
	
	public int fibonacci(int numero) { //numero de la secuencia a generar
		int n1 = 0;
		int n2 = 1;
		int suma;
		if(numero > 0) {
			try {
				for(int i = 0; i < numero; i++) {
					suma = n1 + n2;
					n1 = n2;
					n2 = suma;
				}
			} catch (IllegalArgumentException fallo) {
				System.out.print("Error en el metodo fibonacci");
			}
			
		}
		return n1; // n1 ahora devuelve el ultimo numero calculado
		
	}
	
	public int factorial(int numero) {
		int factorial = 1;
		if(numero >= 0) {
			try {
				for(int i = 1; i <= numero; i++) {
					factorial = i * factorial;
				}
			} catch (IllegalArgumentException fallo) {
				System.out.print("Error en el metodo factorial");
			}
		}
		return factorial;
	}
	
	public boolean primo(int numero) {
		boolean primo = true; //true si es primo, false si no lo es
		if(numero >= 2) {
			try {
				 for(int i = 2; i < numero; i++) {
						if(numero % i == 0) {
							primo = false;
							i = numero -1;
						}
					}
				
			} catch (IllegalArgumentException fallo) {
				System.out.print("Error en el metodo primo");
			}
		}
		else {
			primo = false; //todo numero menor a 2 no es primo
		}
		return primo;
	}
}
