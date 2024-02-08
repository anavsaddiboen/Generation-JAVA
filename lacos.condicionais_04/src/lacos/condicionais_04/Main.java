package lacos.condicionais_04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("JAVA | LAÇOS CONDICIONAIS | SWITCH | ATV 04\n");

		// Controle de Cargos
		float cargo1 = 10; // Gerente
		float cargo2 = 7; // Vendedor
		float cargo3 = 9; // Supervisor
		float cargo4 = 6; // Motorista
		float cargo5 = 5; // Estoquista
		float cargo6 = 8; // Técnico de TI

		// Entrada
		System.out.println("Nome do Colaborador: ");
		String nome = scanner.nextLine();

		System.out.println("Cargo: ");
		int cargo = scanner.nextInt();

		System.out.println("Salário: ");
		int salario = scanner.nextInt();

		// Operação
		switch (cargo) {
		case 1:
			float reaj1 = salario + salario * (cargo1 / 100);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.printf("Cargo: Gerente\nSalário: R$ %.2f ", reaj1);
			break;
		case 2:
			float reaj2 = salario + salario * (cargo2 / 100);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.printf("Cargo: Vendedor\nSalário: R$ %.2f ", reaj2);
			break;
		case 3:
			float reaj3 = salario + salario * (cargo3 / 100);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.printf("Cargo: Supervisor\nSalário: R$ %.2f ", reaj3);
			break;
		case 4:
			float reaj4 = salario + salario * (cargo4 / 100);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.printf("Cargo: Motorista\nSalário: R$ %.2f ", reaj4);
			break;
		case 5:
			float reaj5 = salario + salario * (cargo5 / 100);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.printf("Cargo: Estoquista\nSalário: R$ %.2f ", reaj5);
			break;
		case 6:
			float reaj6 = salario + salario * (cargo6 / 100);
			System.out.println("Nome do Colaborador: " + nome);
			System.out.printf("Cargo: Técnico de TI\nSalário: R$ %.2f ", reaj6);
			break;
		default:
			System.out.println("Você digitou um código inválido!");
		}

		scanner.close();
	}
}