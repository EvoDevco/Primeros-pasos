import java.util.Scanner;
public class Ejercicio_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el numero a multiplicar");
        int numero = in.nextInt();
        System.out.println("Indique el numero multiplicador");
        int multiplicador= in.nextInt();
        int repeticiones = 0;
        int resultado = 0;
        while (repeticiones<multiplicador){
            repeticiones++;
            resultado += numero;
        }
        System.out.println("El resultado de la multiplicacion es: " + resultado + " y se ha realizado en " + repeticiones + " repeticiones.");
    }
}