
import java.util.Scanner;

// Estrutura Sequencial Exercício 6 – Somar números positivos até digitar negativo
// Escreva um programa que peça números inteiros e os some.
// Ao final, exiba a soma de todos os números positivos digitados.
// O processo deve parar quando o usuário digitar um número negativo.

public class ex06 
{ 
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        int x, sum = 0;
        
        System.out.print("Informe um numero: ");
        x = sc.nextInt();

        while (x >= 0) { 
            sum += x;
            System.out.print("Informe um numero: ");
            x = sc.nextInt();
        }

        sc.close();
        System.out.printf("Soma: %d/n", sum);
    }

}