package lacos.repeticao_03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS DE REPETIÇÃO | DO.. WHILE | ATV 03\n");

		int positivos = 0;
		int idade;

		// Entrada
		do {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			if (idade > 0) {
				positivos += idade;
			}
		} while (idade != 0);

		System.out.println("A soma dos números positivos é:  " + positivos);

		scanner.close();
	}
}