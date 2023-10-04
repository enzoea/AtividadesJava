/*Construa um algoritmo que preencha
dois vetores reais de 15 posições, e
depois crie um terceiro vetor cujo
conteúdo de cada posição é 1 se os
elementos dos dois vetores forem iguais
nessa posição, ou 0 caso contrário.
Imprima os três vetores*/

public class AtividadedVetores {
    public static void main(String[] args) throws Exception {
        // Declarando o tamanho do vetor
        int tamanho = 15;

        // Declarando os vetores, os dois primeiros a serem digitados, e o terceiro que
        // iremos gerar
        double[] vetor1 = new double[tamanho];
        double[] vetor2 = new double[tamanho];
        int[] vetorResultado = new int[tamanho];

        // Preenchendo os dois primeiros vetores com valores reais
        // Para preencher, estamos utilizando números aleatórios com random()
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = Math.random(); // Preencha com valores reais aleatórios
            vetor2[i] = Math.random(); // Preencha com valores reais aleatórios
        }

        // Criando o terceiro vetor com base na comparação
        // Neste caso, caso o número da posição i do vetor1, seja igual à mesma posicao
        // do vetor2, o terceiro vetor recebe o valor 1 na mesma posição i, caso
        // contrário,
        // o mesmo recebe o valor 0
        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] == vetor2[i]) {
                vetorResultado[i] = 1;
            } else {
                vetorResultado[i] = 0;
            }
        }

        // Imprimindo os três vetores
        // Mostrando vetor1
        System.out.println("Vetor 1:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();
        // Mostrando vetor2
        System.out.println("Vetor 2:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();
        // Mostrando vetor3
        System.out.println("Vetor de Resultado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
        System.out.println();
    }
}