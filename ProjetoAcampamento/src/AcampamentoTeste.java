public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento acampamento1 = new Acampamento();

        acampamento1.nome = "Sogeking";
        acampamento1.idade = 23;

        acampamento1.imprimir();
        acampamento1.separarGrupo();
        acampamento1.imprimir();
    }
}