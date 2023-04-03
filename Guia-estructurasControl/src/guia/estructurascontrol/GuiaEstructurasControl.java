
package guia.estructurascontrol;
import java.util.Scanner;

public class GuiaEstructurasControl {
public static Scanner rd = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese tipo de motor: 1,2,3 o 4. ");
        int tipoMotor = rd.nextInt();
        
        switch(tipoMotor){
            case 1: System.out.println("La bomba es una bomba de agua.");
            break;
            case 2: System.out.println("La bomba es una bomba de gasolina.");
            break;
            case 3: System.out.println("La bomba es una bomba de hormigón.");
            break;
            case 4: System.out.println("La bomba es una bomba de pasta "
                    + "alimenticia.");
            default: System.out.println("No existe un valor válido para "
                    + "tipo de bomba.");
            
        }
        
    }
    
}
