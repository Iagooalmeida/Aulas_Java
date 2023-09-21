public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nome_cliente;

    public String getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void imprimir(){
        System.out.println("Conta: " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nome_cliente = " + nome_cliente);
    }
}
