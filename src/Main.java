import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura de la piramide: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = altura; j > i; j--) {
                System.out.print(" *");
            }

            System.out.println("");
        }
        System.out.println(" ");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            for (int j = (altura - 1); j > i; j--) {
                System.out.print(" ");
            }
            for (int j = (altura - 1); j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}