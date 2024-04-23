import java.util.Scanner;

/*Crie uma classe chamada "Funcionario" com os atributos nome, cargo e salário.
Implemente um método para aumentar o salário do funcionário em uma determinada
porcentagem*/
public class Exercicio09 {
    public static void main(String[]args){
        Funcionario funcionario01 = new Funcionario("Breno","Financeiro", 1530.00);
        System.out.println(funcionario01.mostrarSalario());
        funcionario01.aumentarSalario();
        System.out.println(funcionario01.mostrarSalario());
    }
}
class Funcionario{
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    String mostarNome(){
        return nome;
    }

    String mostarCargo(){
        return cargo;
    }

    double mostrarSalario(){
        return salario;
    }

    public double aumentarSalario(){
        System.out.println("Qual será a percentual de aumento do cliente?");
        double aumento = sc.nextDouble();
        sc.close();
        salario = salario+((salario*aumento)/100);
        return salario;
    }





}
