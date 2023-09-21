import java.util.Scanner;

public class SomaDiagonaisMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento da linha " + (i + 1) + " coluna " + (j+1) + ": ");
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        int somaDiagonalPrincipal= 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        int somaDiagonalSecundario = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundario += matriz[i][2 - i];
        }

        System.out.println("A soma diagonal principal é: " + somaDiagonalPrincipal);
        System.out.println("A soma diagonal Secundária é: " + somaDiagonalSecundario);
    }
}
