package arrays.ejercicio6;

import java.util.Scanner;

public class ArraysEjercicio6 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] cubo = new int[3][3];
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo.length; j++) {
                int num;
                do {
                    System.out.println("Ingrese un numero dentro del rango 1 y 9 para la posicion: [" + i + "] [" + j + "]");
                    num = leer.nextInt();
                    if (num < 1 || num > 9) {
                        System.out.println("El numero ingresado se encuentra fuera del rango esperado (1 y 9)");

                    }
                } while (num < 1 || num > 9);
                cubo[i][j] = num;
            }

        }
        int sumaFila1 = cubo[0][0] + cubo[0][1] + cubo[0][2];
        boolean magico = true;
        for (int i = 0; i < cubo.length; i++) {

            int sumaFila = cubo[i][0] + cubo[i][1] + cubo[i][2];
            if (sumaFila != sumaFila1) {
                magico = false;
                break;

            }
            if (magico) {
                for (int j = 0; j < cubo.length; j++) {
                    int sumaColumna = cubo[0][j] + cubo[1][j] + cubo[2][j];
                    if (sumaColumna != sumaFila1) {
                        magico = false;
                        break;

                    }
                }

            }
            if (magico) {
                int sumaDiagonal1 = cubo[0][0] + cubo[1][1] + cubo[2][2];
                if (sumaDiagonal1 != sumaFila1) {
                    magico = false;
                    break;

                }

            }
            if (magico) {
                int sumaDiagonal2 = cubo[0][2] + cubo[1][1] + cubo[2][0];
                if (sumaDiagonal2 != sumaFila1) {
                    magico = false;
                    break;

                }
            }

        }
        if (magico) {
            System.out.println("El cubo es magico!");
           
            
        }else   System.out.println("El cubo no es magico!");

    }
}
