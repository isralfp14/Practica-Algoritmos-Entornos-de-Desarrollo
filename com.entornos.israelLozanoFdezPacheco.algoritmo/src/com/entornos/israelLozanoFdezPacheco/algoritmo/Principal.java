package com.entornos.israelLozanoFdezPacheco.algoritmo;

public class Principal {

	public static void main(String[] args) { 
		algoritmos a = new algoritmos();
		int[]numeros = new int[3];
		int[]resultadoFibonacci = new int[3];
		int[]resultadoFactorial = new int[3];
		boolean[]resultadoPrimos = new boolean[3];
		
		int aleatorio;
		boolean repetido;
		int contador = 0;
		
		//comprueba que no se repita ningun numero en el array
		while(contador < 3) {
			aleatorio = (int)(Math.random()*(10-2)+2);
			repetido = false;
			for(int i = 0; i < numeros.length; i++) {
				if(numeros[i] == aleatorio) {
					repetido = true;
					i = numeros.length;
				}	
			}
			//si no es repetido lo agregamos al array
			if(!repetido) {
				numeros[contador] = aleatorio;
				contador++;
			}
		}
		
		
		for(int i = 0; i < numeros.length; i++) {
			int num = numeros[i];
			resultadoFibonacci[i] = a.fibonacci(num); //calcula el fibonacci del array numeros
			resultadoFactorial[i] = a.factorial(num); //calcula el factorial del array numeros
			resultadoPrimos[i] = a.primo(num);  //comprueba los numeros primos del array numeros
		}
		
		
	}
}

