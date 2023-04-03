package ejerciciosjava2;
import java.util.Scanner;

public class EjerciciosJava2 {
public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese una frase: ");
        String frase = rd.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
