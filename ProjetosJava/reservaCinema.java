import java.util.Scanner;

class Cinema {
    private int capacidadeAssentos;
    private int assentosDisponiveis;
    private boolean[] assentos;

    public Cinema(int capacidadeAssentos) {
        this.capacidadeAssentos = capacidadeAssentos;
        this.assentosDisponiveis = capacidadeAssentos;
        this.assentos = new boolean[capacidadeAssentos];
    }

    public boolean reservarAssento(int assento) {
        if (assento < 1 || assento > capacidadeAssentos) {
            System.out.println("Assento inválido. Escolha um assento entre 1 e " + capacidadeAssentos);
            return false;
        }

        if (assentos[assento - 1]) {
            System.out.println("O assento " + assento + " já está ocupado.");
            return false;
        }

        assentos[assento - 1] = true;
        assentosDisponiveis--;
        System.out.println("Assento " + assento + " reservado com sucesso.");
        return true;
    }

    public void exibirAssentosDisponiveis() {
        System.out.println("Assentos disponíveis:");
        for (int i = 0; i < capacidadeAssentos; i++) {
            if (!assentos[i]) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();
    }
}

public class reservaCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema(10); // Capacidade do cinema com 10 assentos

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Reservar assento");
            System.out.println("2. Exibir assentos disponíveis");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            switch (opcao) {
                case 1:
                    cinema.exibirAssentosDisponiveis();
                    System.out.print("Escolha um assento: ");
                    int assentoEscolhido = scanner.nextInt();
                    cinema.reservarAssento(assentoEscolhido);
                    break;
                case 2:
                    cinema.exibirAssentosDisponiveis();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}