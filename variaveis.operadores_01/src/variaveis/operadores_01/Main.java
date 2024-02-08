package variaveis.operadores_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner variaveis1 = new Scanner(System.in);

		System.out.println("JAVA | VARIÁVEIS E OPERADORES | ATV 01\n");
		
		// Entrada
		System.out.println("Digite seu salário: ");
		float salario = variaveis1.nextFloat();

		System.out.println("Digite o abono: ");
		float abono = variaveis1.nextFloat();

		// Operação
		float novo_salario = salario + abono;

		// Saída
		System.out.println("O novo salário será: " + novo_salario);
		
		variaveis1.close();
	}
}
