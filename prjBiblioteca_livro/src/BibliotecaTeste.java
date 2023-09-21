import java.util.Scanner;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Informe o titulo do livro: ");
        livro.setTitulo(sc.nextLine());
        System.out.println("Informe o nome do autor: ");
        livro.setAutor(sc.nextLine());
        System.out.println("Informe o ano de publicação: ");
        livro.setAnoPublicacao(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preço do livro: ");
        livro.setPreco(Double.parseDouble(sc.nextLine()));

        livro.imprimir();
    }
}
