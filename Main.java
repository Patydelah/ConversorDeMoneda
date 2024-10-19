import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Convertidor convierteMoneda = new Convertidor();
        String entrada = " ";
        String salida = " ";
        double cantidadAConvertir = 0;
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\nEscriba la opcion deseada:");
            System.out.println("1 - Dolar ==> Peso argentino");
            System.out.println("2 - Peso argentino ==> Dolar");
            System.out.println("3 - Dolar ==> Real brasileño");
            System.out.println("4.- Real brasileño ==> Dolar");
            System.out.println("5.- Dolar ==> Peso colombiano");
            System.out.println("6.- Peso colombiano ==> Dolar");
            System.out.println("7 - Salir");
            opcion = teclado.nextInt();
            if (opcion != 7){
                System.out.println("¿cantidad a convertir?");
                cantidadAConvertir = teclado.nextDouble();}

            switch (opcion) {

                case 1:
                    entrada = "USD";
                    salida = "ARS";
                    break;

                case 2:
                    entrada = "ARS";
                    salida = "USD";
                    break;

                case 3:
                    entrada = "USD";
                    salida = "BRL";
                    break;

                case 4:
                    entrada = "BRL";
                    salida = "USD";
                    break;

                case 5:
                    entrada = "USD";
                    salida = "COP";
                    break;

                case 6:
                    entrada = "COP";
                    salida = "USD";
                    break;

                case 7:
                    System.out.println("gracias por utilizar nuestros servicios");
                    entrada = "no";
                    break;

                default:
                    System.out.println("opcion NO valida");
                    entrada = "no";
                    break;
            }

            if (entrada != "no") {
                Moneda convertidor = convierteMoneda.tipoDeMoneda(entrada, salida, cantidadAConvertir);
                System.out.println("Los " + cantidadAConvertir + " " + entrada + " equivalen a " + convertidor.conversion_result() + salida);
            }
        }
    }
}