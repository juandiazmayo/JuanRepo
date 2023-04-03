package ejerciciosjava1;
import java.util.Scanner;

public class EjerciciosJava1 {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
       System.out.println("ingrese un numero entero: ");
       int num = rd.nextInt();
       if (num%2==0) {
           System.out.println("el numero ingresado es un numero par.");
       }else 
           System.out.println("el numero ingresado es un numero impar.");
    }
    
}
