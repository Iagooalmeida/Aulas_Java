import java.util.Scanner;

public class ConcessionariaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Informe o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Informe a marca do carro: ");
        carro.setMarca(sc.nextLine());
        System.out.println("Informe o ano do carro: ");
        carro.setAno(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preço do carro: ");
        carro.setPreco(Double.parseDouble(sc.nextLine()));

        carro.imprimir();
    }
}
