import java.util.Scanner;

class Cajero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int saldo_inicial = 500;
        int numero=4;
        while (numero!=0){
            System.out.println("Indique el numero de la operacion que desea realizar: ");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("0. Salir");
            numero = in.nextInt();
            switch (numero){
                case 1:
                    System.out.println("Indique la cantidad de dinero que desea ingresar: ");
                    int ingreso = in.nextInt();
                    saldo_inicial += ingreso;
                    System.out.println("Su saldo actual es: " + saldo_inicial);
                    break;
                case 2:
                    System.out.println("Indique la cantidad de dinero que desea retirar: ");
                    int retiro = in.nextInt();
                    if (retiro>saldo_inicial){
                        System.out.println("No tiene suficiente saldo para realizar esta operacion.");
                    }else{
                        saldo_inicial -= retiro;
                        System.out.println("Su saldo actual es: " + saldo_inicial);
                    }
                    break;
                case 3:
                    System.out.println("Su saldo actual es: " + saldo_inicial);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro cajero.");
                    break;
                default:
                    System.out.println("Operacion no valida.");
            }
        }

    }
}
