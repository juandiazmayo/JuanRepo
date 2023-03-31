
package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        
        System.out.print("ingrese la temperatura en grados celsius:");
        double cel = sum.nextDouble();
        double far = 32 + (9 * cel / 5);
        
    System.out.println(cel + " grados Celsius equivalen a " + far + " grados Fahrenheit.");
    }
    
}
