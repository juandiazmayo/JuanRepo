
package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner fr = new Scanner(System.in);
        System.out.print("Ingrese una frase:");
        String frase = fr.nextLine();
        
        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        
        System.out.println("la frase en mayusculas es:"+ mayusculas);
        System.out.println("la frase en minusculas es:"+ minusculas);

    }
    
}
