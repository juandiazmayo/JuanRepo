package arrays.ejercioextra4;

import java.util.Scanner;

public class ArraysEjercicioExtra4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[3][4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            System.out.print("Primer trabajo práctico evaluativo: ");
            notas[i][0] = sc.nextDouble();
            System.out.print("Segundo trabajo práctico evaluativo: ");
            notas[i][1] = sc.nextDouble();
            System.out.print("Primer Integrador: ");
            notas[i][2] = sc.nextDouble();
            System.out.print("Segundo integrador: ");
            notas[i][3] = sc.nextDouble();
        }

        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            double promedio = (notas[i][0] * 0.1) + (notas[i][1] * 0.15) + (notas[i][2] * 0.25) + (notas[i][3] * 0.5);

            if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
<<<<<<< HEAD
        System.out.println("cheeeee ");
=======
        System.out.println("Este mensaje se lo mando al gorro de lana: kaaaaaaaaaaaaaa");
>>>>>>> d74789cba6ed924df96e8144dd2f5da19dfce478
    }
}
