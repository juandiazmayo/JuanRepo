package arrays.ejercicio5;

import java.util.Random;

public class ArraysEjercicio5 {

    public static void main(String[] args) {
        int M[][] = new int[3][3];
        Random n = new Random();
        boolean b = false;
        int minimo=5;
        int maximo=10;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = n.nextInt(maximo-minimo+1)+minimo;

            }

        }
      System.out.println("matriz original ");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("M [" + i + "][" + j + "]=" + M[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("matriz transpuesta");

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] != -(M[j][i])) {
                    b = true;
                }
                System.out.print("M [" + i + "][" + j + "]=" + M[j][i]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        if (b == false) {
            System.out.println("la matriz es antisimetrica");
        } else {
            System.out.println("la matriz no es antisimetrica");
        }
    }
}
