//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
package guiaestructuradecontrol8;

import java.util.Scanner;

public class GuiaEstructuradecontrol8 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la nota");
        double nota = leer.nextDouble();
        while ((nota < 0) || (nota > 10)) {
            System.out.println("Ingrese la nota nuevamente");
            nota = leer.nextDouble();
        }
    }

}
