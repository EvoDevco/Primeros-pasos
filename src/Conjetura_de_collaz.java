import java.util.Scanner;

class Conjetura_de_collaz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el numero");
        int numero  = in.nextInt();
        int repeticiones=0;
        while (numero != 1){
            if (numero%2==0){
                numero=numero/2;
            }else{
                numero=(numero*3)+1;}
            repeticiones++;
        }
        System.out.println("El numero de repeticiones es: " + repeticiones);
    }
}
