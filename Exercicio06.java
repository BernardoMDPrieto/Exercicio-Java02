/*Crie uma classe chamada "Cachorro" com os atributos nome, raça e idade. Implemente
um método para latir.*/
public class Exercicio06 {
    public static void main(String[]args){
        Cachorro meuCachorro = new Cachorro("Peter","vira-lata",13);
        meuCachorro.latir();
    }
}
class Cachorro{
    String nome;
    String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    void latir(){
        System.out.println("Au! Au! Au!");
    }

}
