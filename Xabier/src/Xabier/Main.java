package Xabier;

import java.util.Scanner;

public class Main {
	// Iniciamos el lector
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca su nombre : ");
		
		String nombre = scanner.next();

		System.out.println("Hola "+nombre+", perteneces a la generacón del futuro");
	}

}
