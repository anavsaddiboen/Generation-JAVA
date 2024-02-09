package lacos.repeticao_02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS DE REPETIÇÃO | WHILE | ATV 02\n");

		String parar = "n";
		int menor21 = 0;
		int maior50 = 0;

		// Entrada
		while (parar != "s") {
			System.out.println("Digite uma idade: ");
			int idade = scanner.nextInt();

			if (idade >= 0) {
				if (idade < 21) {
					menor21 += 1;
				} else if (idade > 50) {
					maior50 += 1;
				}

			} else {
				parar = "s";
			}

		}
		System.out.println("\\nTotal de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

		scanner.close();
	}
}
