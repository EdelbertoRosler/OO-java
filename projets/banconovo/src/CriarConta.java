public class CriarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 500;
        
        Conta conta2 = conta1;                              // conta2 se referencia ao mesmo objeto da conta1
        conta2.saldo += 150;

        Conta conta3 = new Conta();
        conta3.deposita(1000);
        conta3.titular = new Cliente();


        conta3.titular.nome = "Gabriel Rosler" ;            // Associa a conta3.titular para o Cliente
        conta3.titular.cpf = "222.222.222-22";
        conta3.titular.profissão = "programador";
                                      
        

        conta3.saca(75);
        // System.out.println(conta3.saldo);
        conta3.transfere(200, conta1);
        System.out.println(conta1.saldo);
        System.out.println(conta3.saldo);

        System.out.println("nome: " + conta3.titular.nome);            // GAbriel Rosler
        System.out.println("titular: " + conta3.titular.cpf); 
        System.out.println("profissão: " + conta3.titular.profissão); 
    }
}
