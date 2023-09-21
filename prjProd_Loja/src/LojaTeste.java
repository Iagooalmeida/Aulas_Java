import java.util.Scanner;

public class LojaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Informe o nome do produto: ");
        produto.setNome(sc.nextLine());
        System.out.println("Informe a descrição do produto: ");
        produto.setDescricao(sc.nextLine());
        System.out.println("Informe a quantidade em estoque: ");
        produto.setQuantidadeEmEstoque(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preço do produto: ");
        produto.setPrecoUnitario(Double.parseDouble(sc.nextLine()));

        produto.imprimir();
    }
}
