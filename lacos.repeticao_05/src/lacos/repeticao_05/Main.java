package lacos.repeticao_05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS DE REPETIÇÃO | WHILE | ATV 05\n");

		// Entrada
		int mulherFront = 0;
		int devBack = 0;
		int hoMobile40 = 0;
		int naoBiFullMenor30 = 0;
		int participantes = 0;
		float total = 0;
		float media;
		char continua = 'S';
		
		// Operações
		do {
			System.out.println("Idade: ");
			int idade = scanner.nextInt();
			System.out.println("Identidade de Gênero: ");
			int idGen = scanner.nextInt();
			System.out.println("Pessoa Desenvolvedora: ");
			int tipoDev = scanner.nextInt();
			
			participantes +=1;
			total += idade;
			
			if (tipoDev == 1) { 
				devBack += 1;
			}
			
			if ((idGen == 1 || idGen == 4) && tipoDev == 2) {
				mulherFront += 1;
			}
			
			if ((idGen == 2 || idGen == 5) && tipoDev == 3 && idade >= 40) {
				hoMobile40 += 1;
			}
			
			if (idGen == 3 && tipoDev == 4 && idade <= 30) {
				naoBiFullMenor30 += 1;
			}
			
			System.out.println("Deseja continuar (S/N): ");
			continua = scanner.next().charAt(0);
			
			if (continua == 'n' || continua == 'N') {
				break;
			}
			
		}while (continua != 'N' || continua != 'n');
		

	
	media = total / participantes;
	
	System.out.println("Total de pessoas desenvolvedoras Backend: " + devBack);
	System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFront);
	System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+ hoMobile40);
	System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos:" + naoBiFullMenor30);
	System.out.println("\nO número total de pessoas que responderam à pesquisa: " + participantes);
	System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f",media);
		

		scanner.close();
	}
	}