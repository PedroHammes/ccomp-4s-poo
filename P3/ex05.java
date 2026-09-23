// Lista de Exercícios – Estrutura Sequencial Exercício 5 – Somar até atingir 100

// Crie um programa que seja capaz de somar a variável “soma”
// com a variável “numero” até que o valor dessa soma atinja o
// número 100. A variável “soma” deve iniciar com 0 (zero) e a
// variável “numero” deve iniciar com o valor 1. Ambas as variáveis
// terão seus valores incrementados de 1 até a soma entre eles
// atingir 100.

public class ex05 {
    public static void main(String[] args)
    {
        int sum = 0, number = 1;

        while ((sum + number) < 100)
        {
            System.out.printf("%d + %d = %d\n", sum, number, sum+number);
            sum++;
            number++;
        }

        System.out.printf(" > %d + %d = %d\nENCERRANDO", sum, number, sum+number);
    }
}
