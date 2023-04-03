
package guiaestructurascontrol1;
import java.util.Scanner;


public class GuiaEstructurasControl1 {
public static Scanner rd = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println ("ingrese el primer numero entero: ");
        int num1 = rd.nextInt();
        System.out.println("ingrese el segundo y ultimo numero entero: ");
        int num2 = rd.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("ambos numeros son mayores a 25");
        }else if (num1 > 25 || num2 > 25){
            System.out.println("alguno de los numeros es mayor a 25");
        }else 
            System.out.println("Ningun numero es mayor a 25");
        
       
    }
    
}
