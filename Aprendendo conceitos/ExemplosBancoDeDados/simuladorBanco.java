import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}

public class simuladorBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();
        int numeroConta = 1;

        // Conectar ao banco de dados MySQL
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Abrir nova conta");
            System.out.println("2. Fazer depósito");
            System.out.println("3. Fazer saque");
            System.out.println("4. Verificar saldo");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            switch (opcao) {
                case 1:
                    contas.add(new ContaBancaria(numeroConta));
                    System.out.println("Conta " + numeroConta + " aberta com sucesso.");
                    numeroConta++;
                    break;
                case 2:
                    System.out.print("Número da conta: ");
                    int numero = scanner.nextInt();
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    boolean depositoSucesso = false;
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta() == numero) {
                            conta.depositar(valorDeposito);
                            depositoSucesso = true;
                            System.out.println("Depósito efetuado com sucesso.");
                            break;
                        }
                    }
                    if (!depositoSucesso) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.print("Número da conta: ");
                    int numeroSaque = scanner.nextInt();
                    System.out.print("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    boolean saqueSucesso = false;
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta() == numeroSaque) {
                            saqueSucesso = conta.sacar(valorSaque);
                            if (saqueSucesso) {
                                System.out.println("Saque efetuado com sucesso.");
                            }
                            break;
                        }
                    }
                    if (!saqueSucesso) {
                        System.out.println("Conta não encontrada ou saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.print("Número da conta: ");
                    int numeroSaldo = scanner.nextInt();
                    boolean contaEncontrada = false;
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta() == numeroSaldo) {
                            System.out.println("Saldo da conta " + numeroSaldo + ": " + conta.getSaldo());
                            contaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}