
import java.util.Scanner;

// 3) Programa para ler dois números do tipo float e escrever a soma deles,
// isto é, o usuário digitará os dois números.

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor de x: ");
        float x = sc.nextFloat();
        System.out.print("Informe o valor de y: ");
        float y = sc.nextFloat();
        sc.close();

        System.out.printf("%.2f + %.2f = %.2f \n", x, y, (x+y));
    }
}
