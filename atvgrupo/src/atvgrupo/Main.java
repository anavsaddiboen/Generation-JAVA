package atvgrupo;

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random sorteador = new Random();
		// DECLARAÇÕES
		int contador1 = 10;
		int contador2 = 10;
		int contador = 10;
		int escolha;
		System.out.println("** BEM VINDO(A) AO JOGO DA ADVINHAÇÃO **");
		int numeroDigitado1 = 0;
		int numeroDigitado2 = 0;
		int aleatorio = sorteador.nextInt(0, 100);
		System.out.println(aleatorio);

		// ESCOLHA DO MODO DE JOGO
		System.out.println("Você deseja jogar contra máquina ou contra um amigo?\n(1) - Máquina\n(2) - Amigo\n ");
		escolha = scanner.nextInt();

		// SE FOR MULTIPLAYER
		if (escolha == 2) {
			System.out.println("\n           *** Vamos começar!! ***");
			do {

				System.out.println(
						"----------------------------------------------\nNúmero de tentativas restantes do jogador 1: "
								+ contador1 + "\nNúmero de tentativas restantes do jogador 2: " + contador2
								+ "\n----------------------------------------------\n");

				System.out.println(">> Jogador 1 - Advinhe o número: \n"); // INICIO RODADA
				numeroDigitado1 = scanner.nextInt();

				// jogador 1 saindo do jogo
				if (numeroDigitado1 == 404) {
					System.out
							.println("\n**Jogador 1 saiu do jogo**\nJogador 2 redirecionado para o modo individual!\n");
					escolha = 1;
					contador = contador2;
					break;
				}

				if (numeroDigitado1 < 0 || numeroDigitado1 > 100 && numeroDigitado1 < 404 || numeroDigitado1 > 404) {
					System.out.println(
							"\n**VocÊ digitou um número inválido. Tente novamente ou Digite '404' para sair do jogo!\n");
				} else if (numeroDigitado1 > aleatorio) {
					System.out.println("\n**Errou! Tente um número MENOR ou Digite '404' para sair do jogo!");
				} else if (numeroDigitado1 < aleatorio) {
					System.out.println("\n**Errou! Tente um número MAIOR ou Digite '404' para sair do jogo!\n\n");
				} else if (numeroDigitado1 == aleatorio) {
					break;
				}

				contador1--;

				// jogador 2
				System.out.println("\n>> Jogador 2 - Advinhe o número: \n");
				numeroDigitado2 = scanner.nextInt();
				if (numeroDigitado2 == aleatorio) {
					break;
				}

				if (numeroDigitado2 == 404) {
					System.out
							.println("\n**Jogador 1 saiu do jogo**\nJogador 2 redirecionado para o modo individual!\n");
					escolha = 1;
					contador = contador1;
					break;
				}

				if (numeroDigitado2 < 0 || numeroDigitado2 > 100 && numeroDigitado2 < 404 || numeroDigitado2 > 404) {
					System.out.println(
							"\n**VocÊ digitou um número inválido. Tente novamente ou Digite '404' para sair do jogo!\n");
				} else if (numeroDigitado2 > aleatorio) {
					System.out.println("\n**Errou! Tente um número MENOR ou Digite '404' para sair do jogo!");
				} else if (numeroDigitado2 < aleatorio) {
					System.out.println("\n**Errou! Tente um número MAIOR ou Digite '404' para sair do jogo!\n\n");
				}

				contador2--;

			} while (numeroDigitado1 != aleatorio && numeroDigitado1 != 404 && numeroDigitado2 != aleatorio
					&& numeroDigitado2 != 404);
		}

		// SE FOR INDIVIDUAL

		if (escolha == 1) {
			System.out.println("** MODO INDIVIDUAL **\n----------------------\n");
			do {

				if (contador1 >= 1) {
					System.out.println("Número de tentativas restantes: " + contador);
				}
				System.out.println("Advinhe o número:\n");

				numeroDigitado1 = scanner.nextInt();

				if (numeroDigitado1 == 404) {
					System.out.println("\nVocê saiu do jogo");
					break;
				}

				if (numeroDigitado1 < 0 || numeroDigitado1 > 100 && numeroDigitado1 < 404 || numeroDigitado1 > 404) {
					System.out.println(
							"\n---------------------------------------------------\n**VocÊ digitou um número inválido. Tente novamente ou Digite '404' para sair do jogo!\n---------------------------------------------------\n");
				} else if (numeroDigitado1 > aleatorio) {
					System.out.println(
							"\n----------------------------------------------------------------\n**Errou! Tente um número MENOR ou Digite '404' para sair do jogo!\n----------------------------------------------------------------\n");
				} else if (numeroDigitado1 < aleatorio) {
					System.out.println(
							"\n----------------------------------------------------------------\n**Errou! Tente um número MAIOR ou Digite '404' para sair do jogo!\n----------------------------------------------------------------\n");
				}

				contador--;
			} while (numeroDigitado1 != aleatorio && numeroDigitado1 != 404 && numeroDigitado2 != aleatorio
					&& numeroDigitado2 != 404);
		}

		if (escolha == 2) {

			if (numeroDigitado1 == aleatorio) {
				System.out.println(
						"\n-------------------------------------------\nO jogador 1 venceu! O número sorteado foi "
								+ aleatorio + "\nNúmero de tentativas: " + contador1
								+ "\n-------------------------------------------\n");
			}
			if (numeroDigitado2 == aleatorio) {
				System.out.println(
						"\n-------------------------------------------\nO jogador 2 venceu! O número sorteado foi "
								+ aleatorio + "\nNúmero de tentativas: " + contador2
								+ "\n-------------------------------------------\n");
			}
		} else if (escolha == 1) {
			if (numeroDigitado1 == aleatorio) {
				System.out.println("\n-------------------------------------------\nVocê venceu! O número sorteado foi "
						+ aleatorio + "\nNúmero de tentativas: " + contador
						+ "\n-------------------------------------------\n");
			}
			scanner.close();
		}
	}
}
