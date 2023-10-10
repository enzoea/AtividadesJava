import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Disciplina {
    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getNome() {
        return nome;
    }
}

public class armazenaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Disciplina> disciplinas = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar disciplina");
            System.out.println("2. Registrar nota em disciplina");
            System.out.println("3. Calcular média em disciplina");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 4) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome da disciplina: ");
                    String nomeDisciplina = scanner.nextLine();
                    disciplinas.add(new Disciplina(nomeDisciplina));
                    System.out.println("Disciplina adicionada com sucesso.");
                    break;
                case 2:
                    if (disciplinas.isEmpty()) {
                        System.out.println("Nenhuma disciplina registrada ainda.");
                    } else {
                        System.out.println("Escolha uma disciplina:");
                        for (int i = 0; i < disciplinas.size(); i++) {
                            System.out.println((i + 1) + ". " + disciplinas.get(i).getNome());
                        }
                        int escolha = scanner.nextInt();
                        scanner.nextLine();
                        if (escolha >= 1 && escolha <= disciplinas.size()) {
                            System.out.print("Informe a nota: ");
                            double nota = scanner.nextDouble();
                            disciplinas.get(escolha - 1).adicionarNota(nota);
                            System.out.println("Nota registrada com sucesso.");
                        } else {
                            System.out.println("Escolha de disciplina inválida.");
                        }
                    }
                    break;
                case 3:
                    if (disciplinas.isEmpty()) {
                        System.out.println("Nenhuma disciplina registrada ainda.");
                    } else {
                        System.out.println("Escolha uma disciplina:");
                        for (int i = 0; i < disciplinas.size(); i++) {
                            System.out.println((i + 1) + ". " + disciplinas.get(i).getNome());
                        }
                        int escolha = scanner.nextInt();
                        scanner.nextLine();
                        if (escolha >= 1 && escolha <= disciplinas.size()) {
                            double media = disciplinas.get(escolha - 1).calcularMedia();
                            System.out.println("Média em " + disciplinas.get(escolha - 1).getNome() + ": " + media);
                        } else {
                            System.out.println("Escolha de disciplina inválida.");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}