package Refuerzo;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 1 numero");
        num2 = sc.nextInt();
        if (num2%2 != 0) {
            num2 += 1;
        }
        for (int repeticiones = 0; repeticiones<5;repeticiones++) {
            num2 += 2;
            System.out.println(num2);

        }
    }
}
