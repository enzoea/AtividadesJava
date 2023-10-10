import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void retirarQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Quantidade em estoque: " + quantidade;
    }
}

public class controleDeEstoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(String nome, int quantidade) {
        produtos.add(new Produto(nome, quantidade));
    }

    public void adicionarQuantidade(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.adicionarQuantidade(quantidade);
                break;
            }
        }
    }

    public void retirarQuantidade(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.retirarQuantidade(quantidade);
                break;
            }
        }
    }

    public void gerarRelatorio() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void main(String[] args) {
        controleDeEstoque controleEstoque = new controleDeEstoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Adicionar quantidade a um produto");
            System.out.println("3. Retirar quantidade de um produto");
            System.out.println("4. Gerar relatório de estoque");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int quantidade = scanner.nextInt();
                    controleEstoque.adicionarProduto(nome, quantidade);
                    break;
                case 2:
                    System.out.print("Nome do produto: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    controleEstoque.adicionarQuantidade(nomeAdicionar, quantidadeAdicionar);
                    break;
                case 3:
                    System.out.print("Nome do produto: ");
                    String nomeRetirar = scanner.nextLine();
                    System.out.print("Quantidade a retirar: ");
                    int quantidadeRetirar = scanner.nextInt();
                    controleEstoque.retirarQuantidade(nomeRetirar, quantidadeRetirar);
                    break;
                case 4:
                    controleEstoque.gerarRelatorio();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
