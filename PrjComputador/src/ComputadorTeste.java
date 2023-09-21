public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();

        computador1.marca = "HP";
        computador1.preco = 3200.00;
        computador1.cor = "Verde";
        computador1.modelo = "HP";
        computador1.numeroSerie = 284590;

        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        computador2.marca = "IBM";
        computador2.preco = 5490.00;
        computador2.cor = "Preto";
        computador2.modelo = "IMB Mobile Suit";
        computador2.numeroSerie = 328464;

        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        computador2.alterarValor(5000.00);
        if (computador2.alterarValor(5000.00) == 1){
            System.out.println("\nValor Alterado");
        }else{
            System.out.println("\nValor NÂO alterado");
        }

        computador2.imprimir();
    }
}