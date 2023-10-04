import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) throws Exception {
        int[] testeArray = new int[3];
        Scanner sc = new Scanner(System.in);
        // Recebendo o vetor com valores do usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + i + "° numero do array");
            testeArray[i] = sc.nextInt();
        }
        // Mostrando o array
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "° Posicao: " + testeArray[i]);
        }
    }
}
