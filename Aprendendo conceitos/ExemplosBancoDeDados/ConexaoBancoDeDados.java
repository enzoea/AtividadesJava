
// Necessária importação das seguintes bibliotecas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConexaoBancoDeDados {

    public static void main(String[] args) {
        // Parâmetros de conexão
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        Connection conexao = null;

        try {
            // Estabelece a conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão bem-sucedida!");

            // Aqui você pode executar operações no banco de dados, como consultas ou
            // atualizações.
            // Ex: você pode criar uma consulta e executar
            Statement stmt = conexao.createStatement();
            String consultaSQL = "SELECT * FROM sua_tabela";
            ResultSet resultado = stmt.executeQuery(consultaSQL);

            // Processa o resultado da consulta
            while (resultado.next()) {
                // Aqui você pode acessar os dados da consulta, por exemplo,
                // resultado.getString("nome_coluna").
            }

        } catch (SQLException e) {
            // O método e.printStackTrace()é usado em Java para imprimir informações
            // elaboradas sobre uma exceção (ou erro) que ocorreu em seu programa. Ele é
            // frequentemente
            // usado para depurar e entender o motivo de uma exceção ter sido lançada.
            e.printStackTrace();
        } finally {
            // Certifique-se de fechar a conexão quando terminar.
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
