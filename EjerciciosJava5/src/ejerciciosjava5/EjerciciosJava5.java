
package ejerciciosjava5;
import java.util.Scanner;
public class EjerciciosJava5 {
public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese un valor limite positivo:");
        int lim = rd.nextInt();
        int suma=0;
        do {
            System.out.println("ingrese el primer numero a sumar: ");
            int num1 = rd.nextInt();
            System.out.println("ingrese el segundo numero a sumar: ");
            int num2 = rd.nextInt();
            suma = num1+ num2;
        }while (suma<lim);
    }
    
}
