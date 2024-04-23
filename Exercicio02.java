/*
Crie uma classe chamada "Retangulo" com os atributos comprimento e largura.
Implemente um método para calcular a área do retângulo
*/

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();
        meuRetangulo.calcularArea();


    }
}
    class Retangulo{
        Scanner leia = new Scanner(System.in);
        private Double comprimento;
        private Double largura;
        private Double area;

        void lerComprimento(){
            System.out.println("Informe o comprimento do retangulo!");
            this.comprimento = leia.nextDouble();
        }

        void  lerLargura(){
            System.out.println("Informe a largura do retangulo");
            this.largura = leia.nextDouble();
        }

        void calcularArea() {
            if (this.comprimento == null && this.largura == null) {
                System.out.println("Não é possível calcular a área, faltam informações!");
                lerComprimento();
                lerLargura();
            }
            area = comprimento * largura;
            System.out.println("A área do retângulo é: " + area);

        }
    }

