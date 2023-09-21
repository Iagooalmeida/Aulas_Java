import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: ");
            valor[i] = Integer.parseInt(sc.nextLine());
        }

        int maior = valor[0];
        int menor = valor[0];

        for (int i = 0; i < 10; i++) {
            if (valor[i] > maior){
                maior = valor[i];
            }
            if (valor[i] < menor){
                menor = valor[i];
            }
        }
        System.out.println("Maior número é: " + maior);
        System.out.println("Menor número é: " + menor);
    }
}
