public class Conta3 {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta3(int agencia, int numero) {
		if(agencia <= 0) {
			System.out.println("INVÁLIDO");
		}
		Conta3.total++;
		System.out.println("Total de contas criadas: " + Conta3.total);
		this.agencia = agencia;
		this.numero= numero;
		
		System.out.println("NOVA CONTA: " + this.numero);
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public boolean saque(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transferir(double valor, Conta3 destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("INVÁLIDO");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("INVÁLIDO");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular= titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta3.total;
	}
}