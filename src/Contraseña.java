import java.util.Scanner;

class Contraseña {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Contraseña = "1234";
        int intentos_restantes = 3;
        while (intentos_restantes!=0){
            System.out.println("Escriba la contraseña: ");
            String contraseña_usuario = in.nextLine();
            if (contraseña_usuario.equals(Contraseña)){
                System.out.println("Contraseña correcta");
                break;
            }else{
                intentos_restantes-- ;
                System.out.println("Contraseña incorrecta. Le quedan " + intentos_restantes + " intentos.");
            }
        }
    }
}
