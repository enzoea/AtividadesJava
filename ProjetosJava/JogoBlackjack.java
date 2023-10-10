import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Carta {
    private final String nome;
    private final int valor;

    public Carta(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public Baralho() {
        String[] nomes = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        int[] valores = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };

        for (int i = 0; i < nomes.length; i++) {
            cartas.add(new Carta(nomes[i], valores[i]));
        }
    }

    public Carta pegarCarta() {
        Random random = new Random();
        int index = random.nextInt(cartas.size());
        Carta carta = cartas.get(index);
        cartas.remove(index);
        return carta;
    }
}

public class JogoBlackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralho baralho = new Baralho();
        int pontuacaoJogador = 0;
        int pontuacaoComputador = 0;

        System.out.println("Bem-vindo ao Jogo de Blackjack!");

        for (int i = 0; i < 2; i++) {
            Carta cartaJogador = baralho.pegarCarta();
            Carta cartaComputador = baralho.pegarCarta();
            System.out.println("Você recebeu uma carta: " + cartaJogador);
            System.out.println("O computador recebeu uma carta: " + cartaComputador);
            pontuacaoJogador += cartaJogador.getValor();
            pontuacaoComputador += cartaComputador.getValor();
        }

        while (pontuacaoJogador < 21) {
            System.out.println("Sua pontuação atual: " + pontuacaoJogador);
            System.out.print("Deseja receber outra carta? (sim/não): ");
            String escolha = scanner.nextLine().toLowerCase();
            if (escolha.equals("sim")) {
                Carta cartaJogador = baralho.pegarCarta();
                System.out.println("Você recebeu uma carta: " + cartaJogador);
                pontuacaoJogador += cartaJogador.getValor();
            } else {
                break;
            }
        }

        while (pontuacaoComputador < 17) {
            Carta cartaComputador = baralho.pegarCarta();
            System.out.println("O computador recebeu uma carta: " + cartaComputador);
            pontuacaoComputador += cartaComputador.getValor();
        }

        System.out.println("Sua pontuação: " + pontuacaoJogador);
        System.out.println("Pontuação do computador: " + pontuacaoComputador);

        if (pontuacaoJogador > 21 || (pontuacaoComputador <= 21 && pontuacaoComputador > pontuacaoJogador)) {
            System.out.println("O computador venceu!");
        } else if (pontuacaoJogador == pontuacaoComputador) {
            System.out.println("Empate!");
        } else {
            System.out.println("Você venceu!");
        }
    }
}