public class CriarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(111, 134531);
        conta1.deposita(500);
        
        Conta conta2 = conta1;                                              // conta2 se referencia ao mesmo objeto da conta1
        conta2.deposita(150);

        Conta conta3 = new Conta(333, 387763);
        conta3.deposita(1000);
        conta3.setTitular(new Cliente());


        conta3.getTitular().setNome("Gabriel Rosler") ;                       // Associa a conta3.titular para o Cliente
        conta3.getTitular().setCpf("222.222.222-22");
        conta3.getTitular().setProfissão("programador");
                                      
        

        conta3.saca(75);
        // System.out.println(conta3.saldo);
        conta3.transfere(200, conta1);
        System.out.println(conta1.getSaldo());
        System.out.println(conta3.getSaldo());

        System.out.println("nome: " + conta3.getTitular().getNome());            // GAbriel Rosler
        System.out.println("titular: " + conta3.getTitular().getCpf()); 
        System.out.println("profissão: " + conta3.getTitular().getProfissão()); 

        System.out.println(Conta.getTotal());
    }
}
