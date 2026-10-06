import java.util.Scanner;

class Ejercicio_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el numero a dividendo");
        int dividendo = in.nextInt();
        System.out.println("Indique el numero divisor");
        int divisor= in.nextInt();
        int repeticiones = 0;
        int resultado = dividendo;
        while (resultado>=divisor){
            repeticiones++;
            resultado -= divisor;
        }
        System.out.println("El resultado de la division es: " + repeticiones + " y se ha realizado en " + repeticiones + " repeticiones.");
    }
}
