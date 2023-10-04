
/*Tempo do Coelhinho
A fabricação dos ovos de Páscoa é um processo muito
complicado. Diversas vezes os coelhinhos ficam até tarde
trabalhando para que tudo possa ser terminado a tempo,
delicioso e com perfeição. Para melhor gerenciar seus
cronogramas, os coelhinhos estipularam quantos minutos são
necessários para fabricar cada ovo de Páscoa. Já está quase no
final do expediente, e um dos coelhos pediu sua ajuda.
Faltam N minutos para a hora de ir embora, e restam dois
presentes para o coelho Joe fabricar.
Ajude a descobrir se ele conseguirá fabricar os dois ainda hoje,
ou se deve deixar o trabalho para amanhã 

Entrada (classe scanner)
Um inteiro N, indicando quantos minutos faltam para o
final do expediente.
Em seguida haverá dois inteiros A e B, indicando
quantos minutos são necessários para fabricar os dois
ovos de Páscoa que o coelho Joe precisa fabricar.

Saída (System.out.println)
Imprima uma linha, contendo a frase "Farei hoje!" caso
seja possível fabricar os dois ovos antes do final do
expediente, ou "Deixa para amanhã!" caso contrário.*/
import java.util.Scanner;

public class desafioCondicionais {
    public static void main(String[] args) {
        // Declarando o Scanner, para recebermos os valores do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo valores para cálculo, observar os textos escritos para melhor
        // entendimento
        System.out.print("Quantos minutos faltam para o final do expediente? ");
        int minutosRestantes = scanner.nextInt();

        System.out.print("Quantos minutos são necessários para fabricar o primeiro ovo? ");
        int minutosOvo1 = scanner.nextInt();

        System.out.print("Quantos minutos são necessários para fabricar o segundo ovo? ");
        int minutosOvo2 = scanner.nextInt();

        // Calculando o tempo total para fabricar os dois ovos
        int tempoTotal = minutosOvo1 + minutosOvo2;

        // Condicional que irá indicar se o mesmo consegue realizar a fabricação dos
        // ovos hoje
        // ou não, de acordo com o tempo de fabricação e o tempo que o mesmo tem para
        // disponível
        if (tempoTotal <= minutosRestantes) {
            System.out.println("Farei hoje!");
        } else {
            System.out.println("Deixa para amanhã!");
        }

        scanner.close();
    }
}