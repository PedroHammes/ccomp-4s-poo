
import java.util.Scanner;

// 5) Programa para ler o número referente ao dia da semana e, então, escrever o nome do dia da semana correspondente ao número informado. 
//    Utilizar a função switch()

public class ex05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número da semana: ");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1: System.out.println("Domingo");
                break;
            case 2: System.out.println("Segunda-feira");
                break;
            case 3: System.out.println("Terça-feira");
                break;
            case 4: System.out.println("Quarta-feira");
                break;
            case 5: System.out.println("Quinta-feira");
                break;
            case 6: System.out.println("Sexta-feira");
                break;
            case 7: System.out.println("Sábado");
                break;
            default: System.out.println("Informe um número válido (1 à 7).");
                break;
        }

    }
}
