
package extras.java.pkgswitch;
import java.util.Scanner;

public class ExtrasJavaSwitch {
public static Scanner num = new Scanner(System.in);
    public static void main(String[] args) {
        int num3= 0;
        System.out.println("ingrese el 1er numero: ");
        int num1 =  num.nextInt();
        System.out.println("ingrese el 2do numero: ");
        int num2 = num.nextInt();
      
        System.out.println ("Ingrese: ");
        System.out.println ("1) para obtener la suma");
        System.out.println ("2) para obtener la resta");
        System.out.println ("3) para obtener la multiplicacion");
        System.out.println ("4) para obtener la division");
        int n = num.nextInt();
        
        switch (n){
            case 1: System.out.println ("el resultado de la suma es: " +(num1+num2));
            break;
            case 2: System.out.println ("el resultado de la resta es: " +(num1-num2));
            break;
            case 3: System.out.println ("el resultado de la multiplicacion es: " +(num1*num2));
            break;
            case 4: System.out.println ("el resultado de la division es: " +(num1/num2));
            break;
            
           
        }
    }
    
}
