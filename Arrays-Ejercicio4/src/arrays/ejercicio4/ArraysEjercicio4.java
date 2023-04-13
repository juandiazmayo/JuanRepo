package arrays.ejercicio4;
import java.util.Random;

public class ArraysEjercicio4 {
    public static void main(String[] args) {
        int M [][]= new int [4][4];
        Random n = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               M [i][j] = n.nextInt(100);
               
                
            }
            
        }
        System.out.println("matriz original ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("M [" + i + "][" + j + "]=" + M[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("M [" + i + "][" + j + "]=" + M[j][i]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
  
    }
    
}
