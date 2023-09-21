public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("marca" + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }

    public void calcularValor(){
        if ((marca == "HP")){
            preco += (preco * 30 /100);
        } else if (marca == "IBM") {
            preco += (preco * 50 / 100);
        }
    }

    public int alterarValor(double valor){
        if (valor > 0){
            preco = valor;
            return 1;
        }else {
            return 0;
        }
    }

}
