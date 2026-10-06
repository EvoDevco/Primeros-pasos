package Ampliacion;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        System.out.println("Indique si el codigo es de 8 con true o de 13 con false");
        boolean largaria = in.nextBoolean();
        System.out.println("Indique el codigo a comprobar");
        int numero = in.nextInt();
        if (largaria) {
            array[0] = Integer.parseInt(String.valueOf(numero).substring(0, 1));
            array[1] = Integer.parseInt(String.valueOf(numero).substring(1, 2));
            array[2] = Integer.parseInt(String.valueOf(numero).substring(2, 3));
            array[3] = Integer.parseInt(String.valueOf(numero).substring(3, 4));
            array[4] = Integer.parseInt(String.valueOf(numero).substring(4, 5));
            array[5] = Integer.parseInt(String.valueOf(numero).substring(5, 6));
            array[6] = Integer.parseInt(String.valueOf(numero).substring(6, 7));
            for (int posicion = 0; posicion > array.length + 1; posicion++) {
                if (array[posicion] % 2 != 0) {
                    array[posicion] = array[posicion] * 3;
                    break;
                } else {
                    break;
                }
            }
            int suma = 0;
            for (int sumas = 0; sumas > array.length + 1; sumas++) {
                suma += array[sumas];
            }
            int faltante = suma % 10;
            int codigo = array[0] * 10000000 + array[1] * 1000000 + array[2] * 100000 + array[3] * 10000 + array[4] * 1000 + array[5] * 100 + array[6] * 10 + faltante;
            if (codigo == numero) {
                System.out.println("El codigo es correcto");
            } else {
                System.out.println("El codigo no es correcto.");
            }
        } else {
            array[0] = Integer.parseInt(String.valueOf(numero).substring(0, 1));
            array[1] = Integer.parseInt(String.valueOf(numero).substring(1, 2));
            array[2] = Integer.parseInt(String.valueOf(numero).substring(2, 3));
            array[3] = Integer.parseInt(String.valueOf(numero).substring(3, 4));
            array[4] = Integer.parseInt(String.valueOf(numero).substring(4, 5));
            array[5] = Integer.parseInt(String.valueOf(numero).substring(5, 6));
            array[6] = Integer.parseInt(String.valueOf(numero).substring(6, 7));
            array[7] = Integer.parseInt(String.valueOf(numero).substring(7, 8));
            array[8] = Integer.parseInt(String.valueOf(numero).substring(8, 9));
            array[9] = Integer.parseInt(String.valueOf(numero).substring(9, 10));
            array[10] = Integer.parseInt(String.valueOf(numero).substring(10, 11));
            array[11] = Integer.parseInt(String.valueOf(numero).substring(11, 12));
            for (int posicion = 0; posicion > array.length + 1; posicion++) {
                if (array[posicion] % 2 != 0) {
                    array[posicion] = array[posicion] * 3;
                    break;
                } else {
                    break;
                }
            }
            int suma = 0;
            for (int sumas = 0; sumas > array.length + 1; sumas++) {
                suma += array[sumas];
            }
            int faltante = suma % 10;
            long codigo = array[0] * 10000000000000L + array[1] * 1000000000000L + array[2] * 100000000000L + array[3] * 1000000000L + array[4] * 100000000L + array[5] * 10000000L + array[6] * 1000000L + array[7] * 100000L + array[8] * 10000L + array[9] * 1000L + array[10] * 100L + array[11] * 10L + faltante;
            if (codigo == numero) {
                System.out.println("El codigo es correcto");
            } else {
                System.out.println("El codigo no es correcto.");
            }
        }
    }
}
