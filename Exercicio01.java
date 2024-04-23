import java.util.Scanner;

/*Crie uma classe chamada "Carro" com os atributos modelo, marca e ano. Implemente os
métodos necessários para definir e obter os valores desses atributos.*/
public class Exercicio01 {

    public static void main(String[]args){
        Carro carro01 = new Carro();
        carro01.definirModelo();
        carro01.definirMarca();
        carro01.definirAno();
        carro01.mostraCarro();



    }



}

class Carro{
    static Scanner leia = new Scanner(System.in);

    String modelo;
    String marca;
    int ano;

    void mostraCarro(){
        String mensagem = String.format("Modelo: %s \nMarca: %s\nAno: %d", modelo,marca,ano);
        System.out.println(mensagem);
    }

    void definirModelo(){
        System.out.println("Informe o modelo do carro!");
        this.modelo = leia.next();
    }

    void definirMarca(){
        System.out.println("Informe a marca do carro!");
        this.marca = leia.next();
    }

    void definirAno(){
        System.out.println("Informe o ano do carro!");
        this.ano = leia.nextInt();
    }

}
