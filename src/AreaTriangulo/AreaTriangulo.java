package AreaTriangulo; /**
 * @Author: José Antonio Quintero Maya
 */

import java.util.Scanner;

public class AreaTriangulo {
    public static double CalcularArea(double base, double altura) {

        return base*altura/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo");
        double b = sc.nextDouble();

        System.out.println("Introduce la altura del triángulo");
        double a = sc.nextDouble();

        System.out.println("El área del triángulo es: " + CalcularArea(b,a));
    }
}