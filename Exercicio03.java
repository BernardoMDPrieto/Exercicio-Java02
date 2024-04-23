/*
Crie uma classe chamada "ContaBancaria" com os atributos número da conta e saldo.
Implemente os métodos para depositar e sacar dinheiro da conta
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[]args){
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.mostrarConta();
        minhaConta.cadastrarConta();
        minhaConta.depositar();
        minhaConta.sacar();
        minhaConta.sacar();
        minhaConta.mostrarConta();
    }
}
class ContaBancaria{
    Scanner sc = new Scanner(System.in);
    Long numeroDaConta;
    Float saldoDaConta;

    void cadastrarConta(){
        System.out.println("Informe o número da conta!");
        numeroDaConta = sc.nextLong();
        saldoDaConta = 0f;
        System.out.println("Conta criada com sucesso!");
        System.out.println("Saldo atual: " + saldoDaConta);
    }
    void mostrarConta(){
        if (numeroDaConta == null){
            System.out.println("É necessário ter uma conta para ver seus dados!");
        }else {
            String dadosConta = String.format("Número da conta: %d \nSaldo atual: R$%.2f",numeroDaConta,saldoDaConta);
            System.out.println(dadosConta);
        }
    }

    void depositar(){
        System.out.println("Informe quanto deseja depositar na conta!");
        saldoDaConta += sc.nextFloat();
        System.out.println("Seu novo saldo é de: R$" + saldoDaConta);
    }

    void sacar(){
        System.out.println("Informe quanto deseja sacar da sua conta!");
        float saqueUsuario = sc.nextFloat();
        if (saldoDaConta - saqueUsuario < 0){
            System.out.println("Impossível sacar essa quantia!");
            System.out.println("Quantia disponível para saque: R$" + saldoDaConta);
        }else{
            saldoDaConta -= saqueUsuario;
            System.out.println("Saque concluído!");
            System.out.println("Seu novo saldo é de: R$" + saldoDaConta);
        }
    }

}