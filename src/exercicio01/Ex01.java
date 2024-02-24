package exercicio01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.print("Senha Invalida. Digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido.");
    }
}
