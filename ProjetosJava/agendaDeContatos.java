import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

public class agendaDeContatos {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void editarContato(String nome, String novoNome, String novoTelefone) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contato.setNome(novoNome);
                contato.setTelefone(novoTelefone);
                break;
            }
        }
    }

    public void excluirContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equals(nome));
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public static void main(String[] args) {
        agendaDeContatos gerenciador = new agendaDeContatos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Editar contato");
            System.out.println("3. Excluir contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            // Limpa a quebra de linha
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    gerenciador.adicionarContato(new Contato(nome, telefone));
                    break;
                case 2:
                    System.out.print("Nome do contato a ser editado: ");
                    String nomeEditar = scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    gerenciador.editarContato(nomeEditar, novoNome, novoTelefone);
                    break;
                case 3:
                    System.out.print("Nome do contato a ser excluído: ");
                    String nomeExcluir = scanner.nextLine();
                    gerenciador.excluirContato(nomeExcluir);
                    break;
                case 4:
                    gerenciador.listarContatos();
                    break;
                case 5:
                    System.out.println("Saindo do programa. Adeus!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}