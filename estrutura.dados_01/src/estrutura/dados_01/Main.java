package estrutura.dados_01;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | ESTRUTURA DE DADOS | ATV 01\n");

		Queue<String> fila = new LinkedList<>();

		while (true) {
			System.out.println("** Sistema de Atendimento **\n----------------------------");
			System.out.println(
					"1. Adicionar pessoa na fila;\n2. Realizar atendimento;\n3. Verificar tamanho da fila;\n4. Sair;\n"
					+"----------------------------");
			System.out.println("**   Escolha uma opção:   **\n");
			int escolha = scanner.nextInt();
			scanner.nextLine(); 
			
			switch (escolha) {
				case 1:
					System.out.println("\nDigite o nome da pessoa que será adicionada à fila: \n");
					String nome = scanner.nextLine();
					fila.offer(nome);
					System.out.println("\n>> "+nome + " foi adicionado(a) à fila de espera.\n");
					
					break;

				case 2:
					if (!fila.isEmpty()) {
						String pessoaAtendida = fila.poll();
						System.out.println(">> Atendendo..." + pessoaAtendida);
					} else {
						System.out.println("\n>> Não há alguém na dila de espera!\n");
					}
					break;

				case 3:
					System.out.println("\n>> O tamanho da fila de espera é: " + fila.size()+"\n");
					break;

				case 4:
					System.out.println(">> Você saiu do programa.\n");
					System.exit(0); 
					break;

				default:
					System.out.println(">> Opção inválida!\n");
					break;
			}
		}
	}
}