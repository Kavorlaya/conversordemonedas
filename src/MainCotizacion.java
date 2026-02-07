import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCotizacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        double monto = 0;

        do {
            try {
                mostrarMenu();
                try {
                    opcion = teclado.nextInt();
                    if (opcion < 1 || opcion > 9) {
                        System.out.println("Error: " + "\'" + opcion + "\'" + " no es una opción válida: ");
                        continue;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Error: En el menú sólo puede ingresar números");
                    teclado.nextLine();
                    continue;
                }
                if (opcion != 9){
                    System.out.println("Escriba el monto que desea convertir");
                    try{
                        monto = teclado.nextDouble();
                        double montoConvertido = consulta.calcularConversion(opcion, monto);
                        System.out.println("El monto convertido es: " + montoConvertido + "\n");

                    } catch (InputMismatchException e){
                        System.out.println("Error: El monto debe ser un valor numérico");
                        teclado.nextLine();


                    }
                }

            } catch(Exception e) {
                System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
                teclado.nextLine();
            }
        } while (opcion != 9);


        System.out.println("Gracias por usar el conversor, hasta luego!");
    }


    public static void mostrarMenu() {
        System.out.println(

                "************************************************\n" +
                        "Bienvenido al conversor de monedas.\n\n" +
                        "Elija una de las siguientes opciones: \n\n" +
                        "[1] - Dólar ==> Peso argentino.\n" +
                        "[2] - Peso argentino ==> Dólar.\n" +
                        "[3] - Dólar ==> Euro.\n" +
                        "[4] - Euro  ==> Dólar.\n" +
                        "[5] - Dólar ==> Libra Esterlina.\n" +
                        "[6] - Libra esterlina ==> Dólar.\n" +
                        "[7] - Euro ==> Libra esterlina.\n" +
                        "[8] - Libra esterlina ==> Euro.\n" +
                        "[9] - Salir del programa.\n" +
                        "************************************************\n" +
                        "Su opción: "

        );


    }


}
