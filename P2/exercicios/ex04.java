// Exercício 4 – if simples
// Escreva um programa em Java que:
// - Leia um número inteiro.
// - Verifique se ele é positivo.
// - Se for, exiba a mensagem: “O número é positivo”.

import java.util.Scanner;

public class ex04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int x = sc.nextInt();
        sc.close();

        if (x > 0) System.out.println("O número é positivo");
    }
}
