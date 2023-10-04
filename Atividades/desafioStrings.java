/*Faça um programa que questione o nome de uma
pessoa altere todas as letras para maiúsculas. Depois
mostre todas as letras em minúsculas. */

import java.util.Scanner;

public class desafioStrings {
    public static void main(String[] args) {
        // Declarando o Scanner, para recebermos os valores do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo o nome que será convertido para maiusculo e minusculo
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        // Converter o nome para maiúsculas
        String nomeMaiusculas = nome.toUpperCase();

        // Converter o nome maiúsculas para minúsculas
        String nomeMinusculas = nomeMaiusculas.toLowerCase();

        System.out.println("Nome em maiúsculas: " + nomeMaiusculas);
        System.out.println("Nome em minúsculas: " + nomeMinusculas);

        scanner.close();
    }
}