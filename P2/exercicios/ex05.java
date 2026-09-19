// Exercício 5 – if composto (if ... Else)
// Escreva um programa em Java que:
// - Leia a idade de uma pessoa.
// - Se a idade for maior ou igual a 18, exiba: “Você é maior de idade”.
// - Caso contrário, exiba: “Você é menor de idade”.

import java.util.Scanner;

public class ex05
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) 
        {
            System.out.println("Você é maior de idade");
        } else
        {
            System.out.println("Você é menor de idade");
        }
        
    }
}
