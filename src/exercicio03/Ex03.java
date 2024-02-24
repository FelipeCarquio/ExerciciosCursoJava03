package exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alc = 0;
        int gas = 0;
        int die = 0;

        System.out.print("Digite o combustível de sua preferencia: " + '\n' +
                        "[1] Alcool" + '\n' +
                        "[2] Gasolina" + '\n' +
                        "[3] Diesel" + '\n' +
                        "[4] Sair" + '\n');
        System.out.println();
        System.out.print("Escolha seu combustível: ");
        int x = sc.nextInt();

        while (x != 4) {
            if (x == 1) {
                alc ++;
                System.out.print("Escolha seu combustível: ");
                x = sc.nextInt();
            } else if (x == 2) {
                gas ++;
                System.out.print("Escolha seu combustível: ");
                x = sc.nextInt();
            } else if (x == 3) {
                die ++;
                System.out.print("Escolha seu combustível: ");
                x = sc.nextInt();
            } else {
                System.out.print("Digite uma opção valida: ");
                x = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Muito Obrigado:");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
    }
}
