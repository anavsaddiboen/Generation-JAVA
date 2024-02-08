package lacos.condicionais_02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS CONDICIONAIS | ATV 02\n");

		// Entrada
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		// Saída

		if (numero < 0) {
			if (numero % 2 == 0) { // o numero é negativo e par
				System.out.println("O número " + numero + " é par e negativo!");
			} else {
				System.out.println("O número " + numero + " é ímpar e negativo!");
			}
		} else {
			if (numero % 2 == 0) { // o numero é positivo e par
				System.out.println("O número " + numero + " é par e positivo!");
			} else {
				System.out.println("O número " + numero + " é ímpar e positivo!");
			}

		}
		scanner.close();
	}
}
