
// Importando a biblioteca para gerar números aleatórios
import java.util.Random;

// Definindo a classe Carro
class Carro {
    // Declarando as variáveis da classe
    // Resumino, um carro deve conter:
    String nomeCarro;
    String modelo;
    int potencia;
    String motor;
    int ano;
    String nomePiloto;

    // Aqui é onde construímos um carro, o nome desta parte do codigo é CONSTRUTOR
    // Note que recebemos como parâmetros (tudo que está entre parênrteses) todas as
    // variáveis
    // As variáveis são as características do carro
    public Carro(String nomeCarro, String modelo, int potencia, String motor, int ano, String nomePiloto) {
        // Indicando o valor de cada característica do carro
        this.nomeCarro = nomeCarro;
        this.modelo = modelo;
        this.potencia = potencia;
        this.motor = motor;
        this.ano = ano;
        this.nomePiloto = nomePiloto;
    }

    // Método apenas para apresentar o nome do carro
    public void apresentar() {
        System.out.println("Apresentando o carro: " + nomeCarro);
    }

    // Método apenas para apresentar o nome do carro que VENCEU a corrida
    public void ganharRace() {
        System.out.println(nomePiloto + " ganhou a corrida com o carro " + nomeCarro);
    }

    // Método apenas para apresentar o nome do carro que PERDEU a corrida
    public void perderRace() {
        System.out.println(nomePiloto + " perdeu a corrida com o carro " + nomeCarro);
    }

    // Método apenas para apresentar o nome do carro que EMPATOU a corrida
    public void empatarRace() {
        System.out.println(nomePiloto + " empatou a corrida com o carro " + nomeCarro);
    }
}

// Definindo a classe corrida
class Corrida {
    // A corrida terá apenas dois elementos, o carro desafiante e o carro desafiado
    Carro desafiante;
    Carro desafiado;

    // Aqui é onde construímos uma corrida, o nome desta parte do codigo é
    // CONSTRUTOR
    // Note que recebemos como parâmetros (tudo que está entre parênrteses) todas as
    // variáveis
    // As variáveis desafiante e desafiado são as características de uma corrida
    public Corrida(Carro desafiante, Carro desafiado) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
    }

    // Validando se a corrida pode ser marcada ou não, a corrida só será marcada
    // quando
    // Os dois competidores forem diferentes
    public boolean marcarCorrida() {
        if (desafiante != desafiado) {
            System.out.println("Corrida marcada entre " + desafiante.nomeCarro + " e " + desafiado.nomeCarro);
            return true;
        } else {
            System.out.println("Corrida não pode ser marcada, pois os competidores são iguais.");
            return false;
        }
    }

    // Aqui é onde começa a corrida
    public void correr() {
        // Iremos utilizar o Random() de aleatórios par asortear o ganhador
        Random rand = new Random();
        // Estamos sorteando um número de 0 a 2
        int resultado = rand.nextInt(3);

        // Validando qual foi o número sorteado
        // Iremos sortear0 para empate, 1 para desafiante ganhar, 2 para desafiado
        // ganhar
        if (resultado == 0) {
            desafiante.empatarRace();
            desafiado.empatarRace();
        } else if (resultado == 1) {
            desafiante.ganharRace();
            desafiado.perderRace();
        } else {
            desafiante.perderRace();
            desafiado.ganharRace();
        }
    }
}

// Classe rincipal
public class CorridadeRua {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Carro1", "Modelo1", 200, "Motor1", 2020, "Piloto1");
        Carro carro2 = new Carro("Carro2", "Modelo2", 250, "Motor2", 2019, "Piloto2");

        carro1.apresentar();
        carro2.apresentar();

        Corrida corrida1 = new Corrida(carro1, carro2);
        Corrida corrida2 = new Corrida(carro1, carro1);

        if (corrida1.marcarCorrida()) {
            corrida1.correr();
        }

        if (corrida2.marcarCorrida()) {
            corrida2.correr();
        }
    }
}