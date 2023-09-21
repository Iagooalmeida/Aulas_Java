import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] transporta = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento da linha " + (i + 1) + " coluna " + (j + 1) + ": ");
                transporta[i][i] = Integer.parseInt(sc.nextLine());
            }
        }

        int[][] matrizTransposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[i][j] = transporta[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%2d]", matrizTransposta[i][j]);
            }
            System.out.println();
        }
    }
}
