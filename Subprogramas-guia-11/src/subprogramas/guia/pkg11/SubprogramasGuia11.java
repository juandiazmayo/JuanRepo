package subprogramas.guia.pkg11;

import java.util.Scanner;

public class SubprogramasGuia11 {

    public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese una frase terminada en punto.");
        String frase = rd.nextLine();
        String frase1 = conversion(frase);
        System.out.println("la frase convertida es:" + frase1);

    }

    public static String conversion(String frase) {

        String frase1 = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            switch (letra) {
                case 'a':
                    frase1 = frase1.concat(String.valueOf('@'));
                    break;
                case 'e':
                    frase1 = frase1.concat(String.valueOf('#'));
                    break;
                case 'i':
                    frase1 = frase1.concat(String.valueOf('$'));
                    break;
                case 'o':
                    frase1 = frase1.concat(String.valueOf('%'));
                    break;
                case 'u':
                    frase1 = frase1.concat(String.valueOf('*'));
                    break;
                default:
                    frase1 = frase1.concat(String.valueOf(letra));
                    break;
            }
        }

        return frase1;

    }

}
