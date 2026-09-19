
import java.util.Scanner;

// Exercício 3 – Estrutura Sequencial - Cálculo da média aritmética
// Escreva um programa em Java que:
// - Leia três notas de um aluno (valores decimais).
// - Calcule a média aritmética simples.
// - Exiba a média final.

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b, c, media;

        System.out.print("Informe a 1° nota: ");
        a = sc.nextFloat();
        System.out.print("Informe a 2° nota: ");
        b = sc.nextFloat();
        System.out.print("Informe a 3° nota: ");
        c = sc.nextFloat();
        sc.close();
        media = (a+b+c)/3;

        System.out.printf("A média é: %.2f\n", media);

    }
}
