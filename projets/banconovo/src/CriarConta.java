public class CriarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.saldo = 500;
        
        Conta conta2 = conta1;                      // conta2 se referencia ao mesmo objeto da conta1
        conta2.saldo += 150;

        System.out.println(conta1.saldo);
        System.out.println(conta1);
        System.out.println(conta2);
        
    }
}
