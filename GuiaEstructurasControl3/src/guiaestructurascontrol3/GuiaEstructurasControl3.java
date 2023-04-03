
package guiaestructurascontrol3;
import java.util.Scanner;

public class GuiaEstructurasControl3 {
public static Scanner rd = new Scanner(System.in);
   
    public static void main(String[] args) {
        double num=0, suma=0;
        double num1;
        do {
            System.out.println("ingrese 20 numeros: "); 
            num1 = rd.nextDouble();
            num = num+1;
            if  (num1>0){
                suma=suma+num1;
            }
            else if (num1==0){
                System.out.println("Se capturó el numero 0.");
            } else {break;}
        } while (num<20 && num1!=0);
        System.out.println("La suma de los numeros ingresados es: "+suma);
        
     
    }
    
}
