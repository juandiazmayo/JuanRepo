//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
package guia.estructuradecontrol;

import java.util.Scanner;

public class GuiaEstructuradecontrol {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese el sugundo numero entero: ");
        int num2 = leer.nextInt();

        if ((num1 > 25) && (num2 > 25)) {
            System.out.println("ambos numeros son mayores a 25.");
        } else if ((num1 > 25) || (num2 > 25)) {
            System.out.println("alguno de ellos es mayor a 25.");

        } else {
            System.out.println("ninguno es mayor a 25.");
        }

    }

}
