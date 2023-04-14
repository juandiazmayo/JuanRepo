/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicioextra6;

import java.util.Scanner;


public class SopaDeLetras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String sopa[][] = new String[20][20];

        String palabra;
        System.out.println("Ingrese 5 palabras que se encontraran en la sopa de letras");
        int cont=0;
        for (int i = (int)(Math.random()*10); i < 20; i++) {
            do {
                    System.out.println("Ingrese la palabra: ");
                    palabra = leer.next();
                } while (palabra.length() > 5 || palabra.length() < 3);
            int longi = palabra.length();
            cont++;
            if(cont==5){
                break;
            }
            for (int j = 0; j < palabra.length(); j++) {

                String letra=palabra.substring(j,j);
                sopa[i][j]=letra;
           
                    
                }
            
            }
        }
    
    }



