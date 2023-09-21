import java.util.Scanner;

public class PlaylistTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Musica musica = new Musica();

        System.out.println("Informe o nome da musica: ");
        musica.setNome(sc.nextLine());
        System.out.println("Informe o artista da musica; ");
        musica.setArtista(sc.nextLine());
        System.out.println("Informe a duração da música");
        musica.setDuracao(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe o gênero da música: ");
        musica.setGenero(sc.nextLine());

        musica.imprimir();
    }
}
