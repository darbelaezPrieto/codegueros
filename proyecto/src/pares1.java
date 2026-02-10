import java.util.Scanner;

public class pares1{

    public static void main(String  []args){

        int cantidad=ingresarEntero("ingrese la cantidad de numeros : ");

        int pares=numerosPares(cantidad);

        String mensaje=generarMensaje(pares);

        mostrarMensaje(mensaje);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int valorEntero=scanner.nextInt();
        return valorEntero;
    }

    public static int numerosPares(int cantidad){

        int conta=0;

        for(int i=1;i<=cantidad;i++){

            int numero=ingresarEntero("ingrese el numero" + (i) + "de"+cantidad);

            if(numero%2==0){
                conta++;
            }

        }
        return conta;
    }

    public static String generarMensaje(int pares){

        String mensaje="";

        mensaje="Hay " +pares+" numeros pares";
        return mensaje;
    }
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}