// 3) Programa para ler dois números do tipo double e escrever a soma deles.

import java.util.Scanner;

public class ex03 {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Double x,y;

        System.out.print("Informe o valor de x: ");
        x = sc.nextDouble();

        System.out.print("Informe o valor de y: ");
        y = sc.nextDouble();

        sc.close();

        System.out.printf("%.2f + %.2f = %.2f", x, y, x+y);
    }
}
