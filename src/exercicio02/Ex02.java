package exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Digite a coordenada Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0 ) {
                System.out.println("Primeiro");
                System.out.print("Digite a coordenada X: ");
                x = sc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                y = sc.nextInt();
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
                System.out.print("Digite a coordenada X: ");
                x = sc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                y = sc.nextInt();
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
                System.out.print("Digite a coordenada X: ");
                x = sc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                y = sc.nextInt();
            } else {
                System.out.println("Quarto");
                System.out.print("Digite a coordenada X: ");
                x = sc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                y = sc.nextInt();
            }
        }
    }
}
