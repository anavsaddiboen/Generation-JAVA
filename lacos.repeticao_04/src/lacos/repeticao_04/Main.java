package lacos.repeticao_04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS DE REPETIÇÃO | FOR | ATV 04\n");

		// Entrada
		int par = 0;
		int impar = 0;

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite o "+ (contador+1) +"º número:");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}

		System.out.println("\nTotal de números pares:"+par+"\n\nTotal de números ímpares:"+impar);

		scanner.close();
	}
}
