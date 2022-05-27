public class TestaBanco {

	public static void main(String[] args) {
		Cliente rebeca = new Cliente();
		rebeca.nome = "Rebeca Bastos";
		rebeca.cpf = "556.568.259-36";
		rebeca.profissao = "Estudante";
		
		Conta2 contaDaRebeca = new Conta2();
		contaDaRebeca.deposito(200);
		
		contaDaRebeca.titular = rebeca;
		System.out.println(contaDaRebeca.titular.nome);
		System.out.println(rebeca);
	}
}
