package src;

import java.util.Scanner;

public class PosicionFibonacci {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int posicion;
		
		System.out.println("¿Qué posición quieres saber en la sucesión de Fibonacci? ");
		posicion = sc.nextInt();
		sc.close();
		
		fibonacci(posicion);	
	}
	
	private static int fibonacci (int posicion) {
		int resultado = 0;
		int posuno = 0, posdos = 1;
		
		if(posicion == 1) {
			resultado = 0;
		}
		else if(posicion == 2) {
			resultado = 1;
		}
		else {
			for(int i = 3; i <= posicion; i++) {
				resultado = posuno + posdos;
				posuno = posdos;
				posdos = resultado;
			}
		}
		System.out.println("La posición tiene el resultado: " + resultado);
		return posicion;
	}
}
