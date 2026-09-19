
import java.util.Scanner;

// 3a) Programa para ler dois números do tipo double e escrever a soma deles.

public class ex03a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Informe o valor de y: ");
        double y = sc.nextDouble();

        sc.close();

        System.out.printf("%.2f + %.2f = %.2f\n", x, y, (x+y));
    }    
}
