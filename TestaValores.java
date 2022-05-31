public class TestaValores {

    public static void main(String[] args) {
		Conta3 conta = new Conta3(-02, 666);
		System.out.println(conta.getAgencia());
		
		Conta3 conta2 = new Conta3(88, 667);
		
		System.out.println(conta2.getAgencia());
		
		System.out.println(Conta3.getTotal());
		
	}
    
}
