import java.util.Scanner;

public class matriz {
    public static void main(String[] args) throws Exception {
        int[][] testeArray = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // Rececbendo a matriz com valores do usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o numero da posicao" + i + "x" + j);
                testeArray[i][j] = sc.nextInt();
            }
        }
        // Mostrando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(testeArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
