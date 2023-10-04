import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) throws Exception {

        /* Recebendo os valores do usuário */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 3");
        int x = scan.nextInt();

        /*
         * Utilizando a estrutura condicional IF-ELSE para verificar qual número o
         * usuário digitou
         */
        if (x == 1) {
            System.out.println("Você digitou 1");
        } else if (x == 2) {
            System.out.println("Você digitou 2");
        } else if (x == 3) {
            System.out.println("Você digitou 3");
        } else {
            System.out.println("Valor inválido");
        }

        /* Recebendo NOVAMENTE NOVOS valores do usuário */
        System.out.println("Digite um numero entre 1 e 3");
        int y = scan.nextInt();

        /*
         * Utilizando a estrutura condicional SWITCH CASE para verificar qual número o
         * usuário digitou
         */
        switch (y) {
            case 1:
                System.out.println("Você digitou 1");
                break;

            case 2:
                System.out.println("Você digitou 2");
                break;

            case 3:
                System.out.println("Você digitou 3");
                break;

            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
