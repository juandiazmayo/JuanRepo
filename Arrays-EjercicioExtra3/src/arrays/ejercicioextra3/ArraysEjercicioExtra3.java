//Crear una función rellene un vector con números aleatorios, 
//pasándole un arreglo por parámetro. Después haremos 
//otra función o procedimiento que imprima el vector.
package arrays.ejercicioextra3;

import java.util.Random;

public class ArraysEjercicioExtra3 {

    public static void main(String[] args) {
        Random n = new Random();
        int vector[] = new int[5];
        rellenarVector(vector, n);
        System.out.println("los valores del vector son: ");
        imprimirVector(vector);

    }

    public static void rellenarVector(int[] vector, Random n) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = n.nextInt(10);
        }

    }

    public static void imprimirVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {

            System.out.print("[" + i + "]:" + vector[i] + "  ");
        }
    }

}
