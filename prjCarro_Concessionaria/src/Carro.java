public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("modelo = " + modelo);
        System.out.println("marca = " + marca);
        System.out.println("ano = " + ano);
        System.out.println("preco = " + preco);
    }
}
