
package ejerciciosjava3;
import java.util.Scanner;

public class EjerciciosJava3 {
public static Scanner rd = new Scanner(System.in);
 
     public static void main(String[] args) {

        System.out.println("Ingrese una frase o palabra de 8 caracteres: ");
        String frase = rd.nextLine();

        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
