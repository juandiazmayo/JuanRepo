//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
//le pida al usuario un número a buscar en el vector.
//El programa mostrará dónde se encuentra el numero y si se encuentra repetido

package arrays.ejercicio2;
import java.util.Random;
import java.util.Scanner;


public class ArraysEjercicio2 {
public static Scanner leer = new Scanner(System.in);
   
    public static void main(String[] args) {
    int [] vector = new int [100];
    Random n1= new Random();
    
        for (int i = 0; i < 100; i++) {
        vector [i]= n1.nextInt(100)+1;
        
        
                
            
        }
    int n,cont=0;
        System.out.println("Ingrese un numero a buscar en el vector:");
        n=leer.nextInt();
        for (int i = 0; i < 100; i++) {
            if (vector[i]==n) {
            cont++;
                System.out.println("se ha encontrado el valor ingresado en la posicion:"+i);
                
            }
        
        
        }
        System.out.println("se ha encontrado "+cont+" veces.");
    
        
    }
    
}
