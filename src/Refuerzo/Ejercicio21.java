package Refuerzo;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int papel,edificio,contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el tamaño del papel en micras");
        papel= sc.nextInt();
        System.out.println("Ahora indique el del edificio en metros.");
        edificio= sc.nextInt();
        double tamano_edificio = edificio*1000000;
        for (int medicion = papel;medicion<=tamano_edificio;medicion+=medicion){
            contador+=1;
        }
        System.out.println("El numero de pliegues necesarios para alcanzar el edificio son: "+contador);
    }
}
