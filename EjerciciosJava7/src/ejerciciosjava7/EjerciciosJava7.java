package ejerciciosjava7;

import java.util.Scanner;

public class EjerciciosJava7 {

    public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        String frase = "";
        int correctCount = 0;
        int incorrectCount = 0;

        while (!frase.equals("&&&&&")) {
            frase = rd.nextLine();

            if (frase.length() == 5 && frase.charAt(0) == 'X' && frase.charAt(4) == 'O') {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        System.out.println("Lecturas correctas: " + correctCount);
        System.out.println("Lecturas incorrectas: " + incorrectCount);
    }
}
