//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package arrays.ejercicio3;

import java.util.Random;

public class ArraysEjercicio3 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, aux;

        Random n1 = new Random();

        for (int i = 0; i < 100; i++) {
            vector[i] = n1.nextInt(100000);
        }
        for (int i = 0; i < 100; i++) {
            aux = cantidad(vector[i]);
            switch (aux) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;

            }
        }
        System.out.println("la cantidad de numeros con 1 digito son: "+d1);
        System.out.println("la cantidad de numeros con 2 digito son: "+d2);
        System.out.println("la cantidad de numeros con 3 digito son: "+d3);
        System.out.println("la cantidad de numeros con 4 digito son: "+d4);
        System.out.println("la cantidad de numeros con 5 digito son: "+d5);
    }

    public static int cantidad(int n) {
        int contador = 0;

        while (n != 0) {
            n = n / 10;
            contador++;

        }

        return contador;
    }

}
