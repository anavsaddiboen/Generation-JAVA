package variaveis.operadores_03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner variaveis3 = new Scanner(System.in);

		System.out.println("JAVA | VARIÁVEIS E OPERADORES | ATV 03\n");

		// Entrada

		System.out.println("Digite o salário bruto: ");
		float salarioBruto = variaveis3.nextFloat();

		System.out.println("Digite o adicional noturno: ");
		float adicionalNoturno = variaveis3.nextFloat();

		System.out.println("Digite as horas extras: ");
		float horasExtras = variaveis3.nextFloat();

		System.out.println("Digite os descontos: ");
		float descontos = variaveis3.nextFloat();

		// Operação

		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		// Saída

		System.out.println("O salário Líquido é: " + salarioLiquido);

		variaveis3.close();
	}
}