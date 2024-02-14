package vetores.matrizes_03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);

		System.out.println("JAVA | VETORES E MATRIZES | ATV 03\n");

		int[][] matriz = { { 1, 2, 3 }, // 00 01 02
				{ 4, 5, 6 }, // 10 11 12
				{ 7, 8, 9 } // 20 21 22
		};

		int[] diagonalPrincipal = new int[3];
		int[] diagonalSecundaria = new int[3];
		int somaPrin = 0;
		int somaSec = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				if (matriz[linha] == matriz[coluna]) {
					diagonalPrincipal[linha] = matriz[linha][coluna];
					somaPrin += matriz[linha][coluna];
				}

			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				// Verifica se a coordenada está na diagonal secundária
				if (linha + coluna == matriz.length - 1) {
					diagonalSecundaria[linha] = matriz[linha][coluna];
					somaSec += matriz[linha][coluna];
				}
			}

		}

		System.out.print("Elementos da Diagonal Principal:\n");
		for (int i = 0; i < diagonalPrincipal.length; i++) {
			System.out.print(diagonalPrincipal[i] + " ");
		}
		System.out.print("\nElementos da Diagonal Secundária:\n");
		for (int i = 0; i < diagonalSecundaria.length; i++) {
			System.out.print(diagonalSecundaria[i] + " ");
		}
		System.out.print("\nSoma dos Elementos da Diagonal Principal:\n"+somaPrin);
		System.out.print("\nSoma dos Elementos da Diagonal Secundária:\n"+somaSec);


	}

}
