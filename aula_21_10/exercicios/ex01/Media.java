package aula_21_10.exercicios.ex01;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2;

        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota2 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        aluno.exibirMedia();
        sc.close();

    }
}