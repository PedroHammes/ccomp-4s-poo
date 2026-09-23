// Exercício 9 – Adivinhar Número Aleatório

// O programa deve gerar um número secreto aleatório entre 1 e 50.
// O usuário deve tentar adivinhar até acertar.
// O programa deverá dizer se o número digitado pelo usuário é mais alto ou mais baixo que o número aleatório.

import java.util.Random;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(50), i=1;


        System.out.print("Tente adivinhar o número: ");
        int attempt = sc.nextInt();

        while (attempt != x)
        {
            i++;
            if (attempt > x)
            {
                System.out.printf("[%d °] Errado. Tente um número menor: ", i);
                attempt = sc.nextInt();
            } else
            {
                System.out.printf("[%d °] Errado. Tente um número maior: ", i);
                attempt = sc.nextInt();
            }
            
        }

        System.out.printf("ACERTOU! O número era: %d\n", x);
        sc.close();
    }
}
