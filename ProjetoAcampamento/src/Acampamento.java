public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo(){
        if (idade > 5 && idade <= 10){
            equipe = 'A';
        }else if (idade > 10 && idade <= 20 ){
            equipe = 'B';
        }else{
            equipe = 'C';
        }
    }

}
