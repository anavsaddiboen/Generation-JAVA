package vetores.matrizes_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		System.out.println("JAVA | VETORES E MATRIZES | ATV 01\n");
		
		int[] lista = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int existe = 0;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int procure = numero.nextInt();

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == procure) {
				existe = 1;
				System.out.print("\nO número " + procure + " está localizado na posição: " + i);
			}
		}

		if (existe == 0) {
			System.out.print("O número " + procure + " não foi encontrado!");

		}

	}
}