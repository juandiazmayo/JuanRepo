
package ejerciciosjava4;
import java.util.Scanner;

public class EjerciciosJava4 {
    public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese una frase o palabra: ");
    String frase= rd.nextLine();
    if (frase.substring(0,1).equals("a")){
        System.out.println ("CORRECTO!");
    }else
        System.out.println ("INCORRECTO");
    
    }
    
}
