class Conta {
    private double saldo;                               // no caso do saldo só tem geter, pois para setá-lo usa-se o saca(), deposita() e transfere().                            
    private int agencia;                                // atributos privados ñ poderão ser acessados senão através dos geters e seters
    private int numero;             
    private Cliente titular;

    public void deposita(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean saca(double valor){
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            return true;
        
        return false;
    }

    public boolean transfere(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saca(valor);
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

// ---------------------- geters e seters ---------------------------- \\

    public double getSaldo(){
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }



}