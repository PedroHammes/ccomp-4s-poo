
import java.util.Scanner;

// Exercício 2 – Estrutura Sequencial - Conversão de temperatura
// Escreva um programa em Java que:
// - Leia uma temperatura em graus Celsius.
// - Converta para Fahrenheit usando a fórmula: F=(C×9/5)+32
// - Mostre o valor convertido na tela.

public class ex02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float celsius, fahrenheit = 0f;

        System.out.print("Informe a temperatura: ");
        celsius = sc.nextFloat();
        fahrenheit = (celsius * 9 / 5) + 32;

        sc.close();
        System.out.printf("%.2f Celsius = %.2f Fahrenheit", celsius, fahrenheit);

    }
}
