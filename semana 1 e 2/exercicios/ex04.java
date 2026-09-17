
import java.util.Scanner;

// 4) Programa ler dois números do tipo float e informar o maior entre eles.
//    Utilize a estrutura condicional “if”

public class ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float x, y;

        System.out.print("Informe o valor de x: ");
        x = sc.nextFloat();

        System.out.print("Informe o valor de y: ");
        y = sc.nextFloat();

        if (x > y) { System.out.printf("O maior número informado é %.3f", x); }
        else if (y > x) { System.out.printf("O maior número informado é %.3f", y); }
        else { System.out.println("Os números informados são iguais."); }

    }
}
