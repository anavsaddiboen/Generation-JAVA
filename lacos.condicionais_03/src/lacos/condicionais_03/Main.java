package lacos.condicionais_03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS CONDICIONAIS | SWITCH | ATV 03\n");

		// MENU
		float prod1 = 10.00f; //Cachorro Quente
		float prod2 = 15.00f; // X-Salada
		float prod3 = 18.00f; //X-Bacon
		float prod4 = 12.00f; //Bauru
		float prod5 = 8.00f;  //Refrigerante
		float prod6 = 13.00f; //Suco de Laranja

		// Entrada
		System.out.println("Código do Produto: ");
		int produto = scanner.nextInt();
		System.out.println("Quantidade: ");
		int qtd = scanner.nextInt();
		
		
		// Operação
		switch (produto) {
		case 1:
			float total1 = qtd * prod1;
			System.out.printf("Produto: Cachorro Quente\nValor total: R$ %.2f ",total1);
			break;
		case 2:
			float total2 = qtd * prod2;
			System.out.printf("Produto: X-Salada\nValor total: R$ %.2f ", total2);
			break;
		case 3:
			float total3 = qtd * prod3;
			System.out.printf("Produto: X-Bacon\nValor total: R$ %.2f ", total3);
			break;
		case 4:
			float total4 = qtd * prod4;
			System.out.printf("Produto: Bauru\nValor total: R$ %.2f ", total4);
			break;
		case 5:
			float total5 = qtd * prod5;
			System.out.printf("Produto: Refrigerante\nValor total: R$ %.2f ", total5);
			break;
		case 6:
			float total6 = qtd * prod6;
			System.out.printf("Produto: Suco de Laranja\nValor total: R$ %.2f ", total6);
			break;
		default:
			System.out.println("Você digitou um código inválido!");			
		}
		
		scanner.close();
	}
}