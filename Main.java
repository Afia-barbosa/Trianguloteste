import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado A:");
        double a = scanner.nextDouble();

        System.out.println("Digite o comprimento do lado B:");
        double b = scanner.nextDouble();

        System.out.println("Digite o comprimento do lado C:");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triângulo válido.");
            if (a == b && b == c) {
                System.out.println("O triângulo é Equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }

        scanner.close();
    }
}
