import java.util.Scanner;

public class conversorDeUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Converter temperatura (Celsius para Fahrenheit)");
            System.out.println("2. Converter comprimento (metros para pés)");
            System.out.println("3. Converter peso (quilogramas para libras)");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Digite o comprimento em metros: ");
                    double metros = scanner.nextDouble();
                    double pes = metrosToPes(metros);
                    System.out.println("Comprimento em pés: " + pes);
                    break;
                case 3:
                    System.out.print("Digite o peso em quilogramas: ");
                    double quilogramas = scanner.nextDouble();
                    double libras = quilogramasToLibras(quilogramas);
                    System.out.println("Peso em libras: " + libras);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double metrosToPes(double metros) {
        return metros * 3.28084;
    }

    public static double quilogramasToLibras(double quilogramas) {
        return quilogramas * 2.20462;
    }
}