
import java.util.Scanner;

// Exercício 1 – Estrutura Sequencial - Área do círculo
// Escreva um programa em Java que:
// - Leia o valor do raio de um círculo.
// - Calcule a área usando a fórmula: A = π * r2
// -  Considere: π = 3.14159
// - Exiba a área calculada.

public class ex01 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14159f;

        System.out.print("Informe o valor do raio: ");
        float raio = sc.nextFloat();

        float area = pi * (raio*raio);         

        System.out.printf("Area = %.2f", area);
        
    }
}
