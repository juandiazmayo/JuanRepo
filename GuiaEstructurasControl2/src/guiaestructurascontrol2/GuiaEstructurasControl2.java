
package guiaestructurascontrol2;
import java.util.Scanner;

public class GuiaEstructurasControl2 {
public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese una nota: ");
        double nota = rd.nextDouble();
        while (nota<0 || nota>10){
            System.out.println("Nota fuera del rango, ingrese una nota váldia:");
            nota = rd.nextDouble();
            }
        System.out.println("Nota válida.");
        
    }
    
    
}
