package ejerciciosjava6;
import java.util.Scanner;

public class EjerciciosJava6 {
public static Scanner rd= new Scanner (System.in);


    public static void main(String[] args) {
    
System.out.println("Ingrese el primer numero entero: ");
    int num1 = rd.nextInt();
    System.out.println("ingrese el segundo numero entero: ");
    int num2 = rd.nextInt();
    System.out.println ("Ingrese: ");
    int num3,x;
    char salir;
    
    do{
    
        System.out.println ("MENU");
        System.out.println ("1. Sumar");
        System.out.println ("2. Restar");
        System.out.println ("3. Multiplicar");
        System.out.println ("4. Dividir");
        System.out.println ("5. Salir");
        System.out.println ("Elija opción: ");
        x = rd.nextInt();
    switch (x){
        case 1:
            System.out.println("La suma de " +num1+ " y " +num2+ " es: " +(num1+num2));
        break;
        
        case 2:
            System.out.println("La resta de " +num1+ " y " +num2+ " es: " +(num1-num2));
        break;
        
        case 3:
            System.out.println("La multiplicación de " +num1+  " y " +num2+ " es: " +(num1*num2));
        break;
        
        case 4:
            if (num2 == 0){
            System.out.println("No se puede dividir entre 0.");
            }else
            System.out.println("La división de " +num1+ " y " +num2+ " es: " +(num1/num2));
        break;
        
        case 5:
            System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String respuesta=rd.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("¡Hasta luego!");
                        x = 5;
            }
        break;
        default:
            System.out.println("Opcion inválida, intentelo de nuevo.");
    }

            
    }while (x != 5);             

    }
}