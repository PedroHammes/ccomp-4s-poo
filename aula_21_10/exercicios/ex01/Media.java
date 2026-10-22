package aula_21_10.exercicios.ex01;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double nota1, nota2;

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        aluno.exibirMedia();
        scanner.close();

    }
}