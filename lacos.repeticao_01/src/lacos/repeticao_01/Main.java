package lacos.repeticao_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS DE REPETIÇÃO | FOR | ATV 01\n");

		// Entrada
		System.out.println("Digite o primeiro número do intervalo: ");
		int num1 = scanner.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		int num2 = scanner.nextInt();

		// Operação
		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo inválido!\n");

		}

		scanner.close();
	}
}
