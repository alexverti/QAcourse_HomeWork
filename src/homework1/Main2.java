package homework1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello, input a: ");
        Scanner console = new Scanner(System.in);
        double a = console.nextInt();
        System.out.println("Hello, input b: ");
        double b = console.nextInt();
        System.out.println("Hello, input c: ");
        double c = console.nextInt();

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        double d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("Корней нет");

        } else if (d == 0) {
            double x = (-b ) / (2 * a);
            System.out.println("Корень = " + x);

        } else if (d > 0) {
            double x1 = (-b + (Math.sqrt(d))) / (2 * a);
            double x2 = (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("Корни = " + x1 +", " + x2 );
        }

    }

}
