public class Conta2 {
	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();
	
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
	public boolean transferir(double valor, Conta2 destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		else {
			return false;
		}
	}
}