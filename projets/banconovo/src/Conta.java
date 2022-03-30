import java.util.function.Function;

class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
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




}