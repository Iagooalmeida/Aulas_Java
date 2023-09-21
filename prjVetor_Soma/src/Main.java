import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valor = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: ");
            valor[i] = Integer.parseInt(sc.nextLine());
            soma += valor[i];
        }
        System.out.println(soma);
    }
}
