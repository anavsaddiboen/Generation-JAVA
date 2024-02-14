package lacos.repeticao_06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS DE REPETIÇÃO | DO.. WHILE | ATV 06\n");

		int multiplos3 = 0;
		float totalmultiplos3 = 0;
		float numero;
		// Entrada
		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			if (numero > 0 && numero%3 == 0) {
				multiplos3 += numero;
				totalmultiplos3 += 1;
			}
		} while (numero != 0);

		float media = multiplos3 / totalmultiplos3;
		System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);

		scanner.close();
	}
}