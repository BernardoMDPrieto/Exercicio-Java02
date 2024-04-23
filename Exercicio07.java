/*
Crie uma classe chamada "Livro" com os atributos título, autor e ano de publicação.
Implemente um método para exibir as informações do livro.
*/

public class Exercicio07 {
    public static void main(String[] args) {
        Livro livro01 = new Livro("O Processo", "Kafka",1925 );
        livro01.mostrarDadosDoLivro();
    }
}
class Livro{
    String titulo;
    String autor;
    int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String pegarTitulo(){
        return titulo;
    }
    public String pegarAutor(){
        return autor;
    }
    public int pegarAnoDePublicacao(){
        return anoDePublicacao;
    }

    public void mostrarDadosDoLivro(){
        System.out.println("Titulo: " + pegarTitulo());
        System.out.println("Autor: " + pegarAutor());
        System.out.println("Ano de publicação: " + pegarAnoDePublicacao());
    }
}
