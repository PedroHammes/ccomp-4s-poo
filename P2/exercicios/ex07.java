
import java.util.Scanner;

// Exercício 7 – Estrutura Switch / Case

// Escreva um programa em Java que:
// - Leia uma nota inteira de 0 a 10.
// - Use a estrutura switch-case para exibir o conceito correspondente:
//   ▪ 10 e 9 → Conceito A
//   ▪ 8 e 7 → Conceito B
//   ▪ 6 e 5 → Conceito C
//   ▪ 4 e 3 → Conceito D
//   ▪ 2, 1 e 0 → Conceito E
//   ▪ Se for digitado um valor fora desse intervalo, exiba “Nota inválida”.

public class ex07 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota: ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 10: case 9: System.out.println("Conceito A");
                break;
            case 8: case 7: System.out.println("Conceito B");
                break;
            case 6: case 5: System.out.println("Conceito C");
                break;
            case 4: case 3: System.out.println("Conceito D");
                break;
            case 2: case 1: case 0: System.out.println("Conceito E");
                break;
            default: System.out.println("Nota inválida");
                break;
        }
    }
}
