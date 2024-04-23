/*
Crie uma classe chamada "Pessoa" com os atributos nome, idade e altura. Implemente
um método para verificar se uma pessoa é maior de idade
*/

public class Exercicio05 {
    public static void main(String[]args){
    Pessoa pessoa01 = new Pessoa("Bernardo",19,1.81f);
    Pessoa pessoa02 = new Pessoa("Matheus", 17, 1.72f);

    pessoa01.verificarIdade();
    pessoa02.verificarIdade();

    }
}
class Pessoa{
    private String nome;
    private int idade;
    private float altura;


    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String pegarNome(){
        return nome;
    }

    public int pegarIdade(){
        return idade;
    }

    public float pegarAltura(){
        return altura;
    }

    void verificarIdade(){
        if(this.idade < 18){
            System.out.println("Menor de idade!");
        }else{
            System.out.println("Maior de idade!");
        }
    }

}
