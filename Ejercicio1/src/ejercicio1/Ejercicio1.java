package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
    }
