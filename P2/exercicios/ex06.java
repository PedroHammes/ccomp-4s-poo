// Exercício 6 – If aninhado (if dentro de if)
// Escreva um programa em Java que:
// - Leia a nota final de um aluno (valor de 0 a 10).
// - Classifique a situação:
//  • Nota >= 7 → “Aprovado”
//  • Nota >= 5 e < 7 → “Recuperação”
//  • Nota < 5 → “Reprovado”

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota final: ");
        double nota = sc.nextDouble();
        sc.close();

        if (nota >= 7)
        {
            System.out.println("Aprovado");
        } else if (nota >= 5)
        {
            System.out.println("Recuperação");
        } else
        {
            System.out.println("Reprovado");
        }

        sc.close();

    }
}
