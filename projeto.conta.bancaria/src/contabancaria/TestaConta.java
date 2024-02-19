package contabancaria;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria novaConta = new ContaBancaria();
		
		novaConta.setNumero(32);
		novaConta.setAgencia(453);
		novaConta.setTipo(2);
		novaConta.setTitular("Nelson");
		novaConta.setSaldo(2345);
		
		System.out.println("Número da conta "+novaConta.getNumero());
		System.out.println("Número da agência "+novaConta.getAgencia());
		System.out.println("Tipo da conta "+novaConta.getTipo());
		System.out.println("Titular da conta "+novaConta.getTitular());
		System.out.println("Saldo da conta "+novaConta.getSaldo());
	}

}
