public class TesteMetodo { 
    public static void main(String[] args) { 
        Conta contaTeste = new Conta();
        contaTeste.saldo = 100;
        contaTeste.deposito(50);
        System.out.println(contaTeste.saldo); 

        boolean conseguiuRetirar = contaTeste.saque(20);
        System.out.println(contaTeste.saldo); 
        System.out.println(conseguiuRetirar);

        Conta contaTeste2 = new Conta();
        contaTeste2.deposito(1000);

        boolean sucessoTransferencia = contaTeste2.transferir(300, contaTeste);
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");

        }
        System.out.println(contaTeste2.saldo);
        System.out.println(contaTeste.saldo); 
    }
}
