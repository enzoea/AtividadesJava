class Moto {
    private String placa;
    private boolean licenciada;

    // Construtor Moto, que está "criando" uma nova moto com a placa que foi enviada
    // no main
    public Moto(String placa) {
        this.placa = placa;
        this.licenciada = false; // Inicialmente, a motocicleta não está licenciada
    }

    // Método utilizado para licensiar a moto, que inicialmente não está licenciada
    // Alterando o licensiamento de falso para verdadeio
    public void licenciar() {
        this.licenciada = true;
        System.out.println("Moto com placa " + placa + " foi licenciada.");
    }

    // Método utilizado apenas para retornar o "status" da licensa, se é verdadeira
    // ou falsa
    public boolean verificaLicenca() {
        return licenciada;
    }

    // Método para retornar a placa da moto
    public String getPlaca() {
        return placa;
    }
}

// Classe principal (onde o codigo principal irá rodar)
public class Motocicleta {
    public static void main(String[] args) {
        // Criando uma nova moto passando a placa como parâmetro
        Moto minhaMoto = new Moto("ABC123");
        // Usando o método de ver a placa e verificar licensa, já mostrando o resultado
        // na tela
        System.out.println("Placa da moto: " + minhaMoto.getPlaca());
        System.out.println("Está licenciada? " + minhaMoto.verificaLicenca());

        // Licensiando a moto
        minhaMoto.licenciar();
        System.out.println("Está licenciada? " + minhaMoto.verificaLicenca());
    }
}