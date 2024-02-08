package variaveis.operadores_04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner variaveis4 = new Scanner(System.in);

		System.out.println("JAVA | VARIÁVEIS E OPERADORES | ATV 03\n");

		// Entrada

		System.out.println("numero1:");
		float n1 = variaveis4.nextFloat();

		System.out.println("numero2:");
		float n2 = variaveis4.nextFloat();

		System.out.println("numero3:");
		float n3 = variaveis4.nextFloat();

		System.out.println("numero4:");
		float n4 = variaveis4.nextFloat();


		// Operação

		float calculo = (n1 * n2) - (n3 * n4);

		// Saída

		System.out.println("A média final é: " + calculo);
		
		variaveis4.close();
	}
}