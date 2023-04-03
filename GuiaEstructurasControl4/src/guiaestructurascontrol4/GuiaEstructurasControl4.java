
package guiaestructurascontrol4;
import java.util.Scanner;

public class GuiaEstructurasControl4 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = rd.nextInt();
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.print("Número inválido. Ingrese un número entre 1 y 20: ");
                numeros[i] = rd.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
