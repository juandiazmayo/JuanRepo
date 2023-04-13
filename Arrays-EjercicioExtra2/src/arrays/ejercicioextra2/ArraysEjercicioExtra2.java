//Escriba un programa que averigüe si dos vectores de N enteros son iguales
//(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
package arrays.ejercicioextra2;

import java.util.Scanner;

public class ArraysEjercicioExtra2 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        System.out.println("ingrese el tamaño del vector:");
        N = leer.nextInt();

        int vector1[] = new int[N];
        int vector2[] = new int[N];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese un valor para la posicion: [" + i + "]");
            vector1[i] = leer.nextInt();
        }

        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese un valor para la posicion: [" + i + "]");
            vector2[i] = leer.nextInt();
        }

        boolean igual = true;

        while (igual) {
            for (int i = 0; i < N - 1; i++) {

                if (vector1[i] != vector2[i]) {
                    System.out.println("Se detecto una diferencia en la posicion: [" + i + "]");
                    igual = false;

                }

            }

        }
    }
}
