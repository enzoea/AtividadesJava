import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Despesa {
    private String descricao;
    private double valor;

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}

public class gerenciadorDeDespesas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Despesa> despesas = new ArrayList();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Registrar uma despesa");
            System.out.println("2. Visualizar despesas");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da despesa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Valor da despesa: ");
                    double valor = scanner.nextDouble();
                    despesas.add(new Despesa(descricao, valor));
                    System.out.println("Despesa registrada com sucesso.");
                    break;
                case 2:
                    if (despesas.isEmpty()) {
                        System.out.println("Nenhuma despesa registrada ainda.");
                    } else {
                        System.out.println("Despesas registradas:");
                        for (Despesa despesa : despesas) {
                            System.out.println(despesa.getDescricao() + ": R$" + despesa.getValor());
                        }
                        double totalGasto = despesas.stream().mapToDouble(Despesa::getValor).sum();
                        System.out.println("Total gasto: R$" + totalGasto);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}