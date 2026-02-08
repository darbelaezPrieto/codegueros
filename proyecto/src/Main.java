//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[]args){
        double aD = extractor("ingrese su daño de ataque: ");
        double health = extractor("Ingrese su vida máxima: ");
        double kills = extractor("ingrese los asesinatos que ha hecho: ");
        double deaths = extractor("ingrese la cantidad de veces que ha muerto: ");
        double enemyHealth = extractor("Ingrese la vida máxima de su oponente: ");
        double adPlus = daPlus(aD, kills, deaths);
        double healthPlus = Hplus(kills, deaths, health);
        double maxPer = maxP(adPlus);
        double totalDamage = totalD(maxPer, healthPlus);
        String msg = generarMensaje(enemyHealth, maxPer, totalDamage);
        mostrarMensaje(msg);


    }


    public static double extractor(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        double entero = scanner.nextDouble();
        return entero;
    }

    public static double daPlus(double aD, double kills, double deaths){

        double stats = (20 + kills - deaths)/100;
        double newAd = aD * stats + aD;
        return newAd;
    }

    public static double Hplus(double kills, double deaths, double health){

        double stats = (20 + kills - deaths)/100;
        double newHealth = health * stats + health;
        return newHealth;
    }
    public static double maxP(double adPlus){
        double maxP = (0.25 + (adPlus * 0.25)/100);
        return maxP;
    }

    public static double totalD(double maxPer, double healthPlus){

        double fiftyHealth = healthPlus * 0.5;
        double totalDamage = 160 + (fiftyHealth * maxPer);
        return totalDamage;
    }

    public static String generarMensaje(double enemyHealth, double maxPer, double totalDamage){

        String finalMsg = "";

        if(totalDamage>=enemyHealth){
            finalMsg = ("Su daño total de: " + totalDamage + " es Suficiente para acabar con el enemigo y su porcentaje de Determinación es: " + maxPer*100 + "%");

        }else{

            double leftLife = enemyHealth - totalDamage;

            finalMsg = ("Su daño total de: " + totalDamage + " no fue suficiente para acabar con el enemigo y este quedaría con la cantidad de " + leftLife + " puntos de vida.");


        }
        return finalMsg;

    }

    public static void mostrarMensaje(String msg){
        System.out.println(msg);
    }
}