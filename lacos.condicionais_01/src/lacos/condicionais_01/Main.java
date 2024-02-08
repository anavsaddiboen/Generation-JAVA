package lacos.condicionais_01;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS CONDICIONAIS | ATV 01\n");

		// Entrada
		System.out.println("Digite o número A: ");
		int numA = scanner.nextInt();

		System.out.println("Digite o número B: ");
		int numB = scanner.nextInt();

		System.out.println("Digite o número C: ");
		int numC = scanner.nextInt();

		// Operação
		int soma = numA + numB;

		// Saída

		if (soma == numC) {
			System.out.println(numA + " + " + numB + " = " + soma + " = " + numC);
			System.out.println("A soma de A + B é Igual a C");
		} else if (soma > numC) {
			System.out.println(numA + " + " + numB + " = " + soma + " > " + numC);
			System.out.println("A soma de A + B é Maior do que C");
		} else {
			System.out.println(numA + " + " + numB + " < " + soma + " > " + numC);
			System.out.println("A soma de A + B é Menor do que C");
		}
		scanner.close();

	}
}
