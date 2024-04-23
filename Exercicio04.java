/*
Crie uma classe chamada "Aluno" com os atributos nome e nota. Implemente um
método para calcular a média das notas de um grupo de alunos
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[]args){
        Sistema meuSistema = new Sistema();

        meuSistema.criarAluno();
        meuSistema.pegarMediaDosAlunos();
        meuSistema.mostrarAlunos();
    }
}

class Aluno{
    private String nome;
    private float media;

    public Aluno(String nome, float media){
        this.nome = nome;
        this.media = media;
    }

    public float pegarMedia(){
        return media;
    }

    public String pegarNome(){
        return nome;
    }

}

class Sistema {
    Scanner sc = new Scanner(System.in);
    ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public void criarAluno() {
        while (true) {
            System.out.println("Informe o nome do(a) aluno(a) para continuar ou 'sair' para terminar de cadastrar os alunos!");
            String nomeAluno = sc.nextLine();
            if (nomeAluno.equals("sair")) {
                break;
            }
            System.out.println("Agora informe a média do(a) aluno(a)!");
            float mediaAluno = sc.nextFloat();
            sc.nextLine();
            listaDeAlunos.add(new Aluno(nomeAluno, mediaAluno));

        }
    }

    public void pegarMediaDosAlunos() {
        float totalNotas = 0f;
        for (Aluno aluno : listaDeAlunos) {
            totalNotas += aluno.pegarMedia();
        }
        double media = totalNotas/listaDeAlunos.size();

        System.out.println(String.format("Média turma: %.2f",media));
    }

    public void mostrarAlunos(){
        for(Aluno aluno: listaDeAlunos){
            System.out.println("Aluno: " + aluno.pegarNome());
            System.out.println("Media: " + aluno.pegarMedia());
            System.out.println("--------------------------------------");
        }
    }


}


