public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("anoPublicacao = " + anoPublicacao);
        System.out.println("preco = " + preco);
    }
}
