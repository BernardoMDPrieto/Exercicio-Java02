/*
Crie uma classe chamada "Triangulo" com os atributos lado1, lado2 e lado3. Implemente
um método para verificar se os lados formam um triângulo válido.
*/

public class Exercicio08 {
    public static void main(String[]args){
        Triangulo triangulo01 = new Triangulo(3,4,5);
        triangulo01.verificarTriangulo();
        Triangulo triangulo02 = new Triangulo(1,1,3);
        triangulo02.verificarTriangulo();

    }
}

class Triangulo{
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float ladoA,float ladoB,float ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    void verificarTriangulo(){
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            System.out.println("É triângulo!");
        }else{
            System.out.println("Não é triângulo!");
        }
    }
}
