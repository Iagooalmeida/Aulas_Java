import java.util.Scanner;

public class MultiplicarMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz01 = new int[2][2];
        int[][] matriz02 = new int[2][2];
        int[][] resultado = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Matriz 01 - Informe o elemento Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                matriz01[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Informe o elemento Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                matriz02[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("A multiplicação das matrizes");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matriz01[i][j] + matriz02[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%2d] ", resultado[i][j]);
            }
            System.out.println();
        }
    }
}
