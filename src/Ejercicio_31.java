import java.util.Scanner;
public class Ejercicio_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el numero");
        int numero = in.nextInt();
        int[] array = new int[numero];
        int posicion = 0;
        System.out.println("Los numeros divisores de " + numero + " son: ");
        while (posicion<numero){
            posicion++;
        if (numero%posicion==0){
                array[posicion-1]=posicion;
                System.out.println(posicion);
            }
        }
        System.out.println("Los numeros divisores de " + numero + " son: ");
    }
}
