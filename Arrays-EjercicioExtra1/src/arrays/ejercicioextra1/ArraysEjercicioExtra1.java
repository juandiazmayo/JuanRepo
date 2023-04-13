//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
//con los valores ingresados por el usuario.
package arrays.ejercicioextra1;

import java.util.Scanner;

public class ArraysEjercicioExtra1 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int suma = 0;
        int N;
        System.out.println("ingrese el tamaño del vector:");
        N = leer.nextInt();

        int vector[] = new int[N];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para la posicion: [" + i + "]");
            vector[i] = leer.nextInt();
            suma +=vector[i];
            

        }
        System.out.println("la suma de los valores del vector es: "+suma);
    }

}
