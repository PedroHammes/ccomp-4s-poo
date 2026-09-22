// Lista de Exercícios – Estrutura Sequencial Exercício 4 – Estrutura While – Senha

// Crie um programa que solicite ao usuário uma senha. Enquanto
// a senha digitada for diferente de "java123", o programa deve
// pedir novamente.

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String password = "java123", word = "";

        if (word.isEmpty() || word.isBlank()) 
        {
            System.out.print("Informe sua senha: ");
            word = sc.next();

        }

        while (!word.equals(password))
            {
                System.out.print("Informe sua senha novamente: \n > ");
                word = sc.next();
            }

            System.out.print("Entrando na sua conta...\n");
            sc.close();




    }
}
