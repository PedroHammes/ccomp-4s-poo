
import java.util.Scanner;

// Lista de Exercícios – Estrutura Sequencial Exercício 2 – Estrutura For – Tabuada de multiplicar por N

// Escreva um programa que receba um número inteiro “N” e exiba
// a tabuada de multiplicar para esse número, considerando o
// intervalo de 1 até 10.

public class ex02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d x %d = %d\n", i, N, i*N);
        }
        
    }
}
