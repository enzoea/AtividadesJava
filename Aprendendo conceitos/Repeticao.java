import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) throws Exception {
        /* Declarando o Scanner que irá receber todas os números digitados */
        Scanner scan = new Scanner(System.in);
        // Variavel que irá receber os valores na repeticao
        int numero;
        // Variável que irá realizar a soma de todos os números digitados;
        int soma = 0;

        // Estrutura de repetição que irá repetir de 0 a 10, recebendo todos os 10
        // números digitados pelo usuário
        for (int i = 1; i <= 10; i++) {
            // Recebendo os 10 valores do usuário
            System.out.println("Digite o valor do " + i + "° numero");
            // numero = scan.nextInt();
            // Somando todos os valores digitados
            // soma = soma + numero;
        }

        // Mostrando o resultado da soma para o usuário
        System.out.println("A soma dos valores e: " + soma);

        int numero2 = 1;
        int soma2 = 0;
        // Estrutura de repetição WHILE
        // Caso o usuário digite o número 0, a repetição irá parar.
        while (numero2 != 0) {
            System.out.println("Digite 0 para parar");
            System.out.println("Digite o numero");
            numero2 = scan.nextInt();
            soma2 += numero2;
        }
        System.out.println("O resultado da soma eh: " + soma2);
    }
}
