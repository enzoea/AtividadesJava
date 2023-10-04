
/*Faça um programa para ler N
números inteiros e exibir a soma dos
números ímpares.
A quantidade N de números a serem
lidos é informada pelo usuário.*/
import java.util.Scanner;

public class desafioRepeticao {
    public static void main(String[] args) {
        // Declarando o Scanner, para recebermos os valores do usuário
        Scanner scanner = new Scanner(System.in);

        // Perguntando ao usuário quantos números ele irá informar, 
        // para sabermos quantas repetições iremos fazer
        System.out.print("Quantos números você deseja informar? ");
        int n = scanner.nextInt();

        // Variavel que irá fazer a soma dos ímpares, iniciamos de zero
        int somaImpares = 0;

        // Percorrendo recebendo todos os N números que o usuário irá digitar
        for (int i = 0; i < n; i++) {
            // Recebendo números
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            //Estrutura condicional para avaliarmos se o número é ímpar
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }
        
        // Mostrando o resultado da soma
        System.out.println("A soma dos números ímpares é: " + somaImpares);

        scanner.close();
    }
}