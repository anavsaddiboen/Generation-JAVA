package variaveis.operadores_02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner variaveis2 = new Scanner(System.in);
		
		System.out.println("JAVA | VARIÁVEIS E OPERADORES | ATV 02\n");
		
		//Entrada
		
		System.out.println("Digite a 1ª nota");
		float nota1 = variaveis2.nextFloat();
		
		System.out.println("Digite a 2ª nota");
		float nota2 = variaveis2.nextFloat();	
		
		System.out.println("Digite a 3ª nota");
		float nota3 = variaveis2.nextFloat();
		
		System.out.println("Digite a 4ª nota");
		float nota4 = variaveis2.nextFloat();
		

		// Operação
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		//Saída
		
		System.out.println("A média final é: " + media);
	
		variaveis2.close();
	}
}
