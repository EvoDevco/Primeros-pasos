package Refuerzo;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int ahorro,variacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la el dinero que tienes a principios de mes");
        ahorro= sc.nextInt();
        System.out.println("Ahora indique la variacion.");
        variacion= sc.nextInt();
        if (ahorro+variacion<0){
            System.out.println("NO");
        }else {
            System.out.println("SI");
        }
    }
}
