import java.util.Scanner;

// Lista de Exercícios – Estrutura Sequencial Exercício 3 – Estrutura For – Palíndromo

// Escreva um programa em Java que peça uma palavra e
// verifique se ela é um palíndromo (lida da mesma forma de frente
// para trás e de trás para frente).

public class ex03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean is_palindrome = true;

        System.out.print("Informe uma palavra: ");
        String word = sc.next(); // para armazenar palavras
        // porque next para no primeiro espaço em branco
        // se quiser armazenar frases use nextLine() porque ele guarda a linha toda e só para no enter/quebra de linha
        
        int last_index = word.length()-1;

        System.out.println(word);

        for (int i=0; i<=last_index; i++)
        {
            if (word.charAt(i) !=  word.charAt(last_index-i))
            {
                is_palindrome = false;
            }
            // System.out.printf("[%d] %c | [%d] %c\n", i, word.charAt(i), (last_index-i), word.charAt(last_index-i));

        }

        if (is_palindrome)
        {
            System.out.println("É palíndromo");
        }else
        {
            System.out.println("Não é palíndromo");
        }



    }
}
