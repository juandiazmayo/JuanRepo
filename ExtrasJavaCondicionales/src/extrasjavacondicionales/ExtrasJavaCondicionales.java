package extrasjavacondicionales;
import java.util.Scanner;


public class ExtrasJavaCondicionales {
public static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
      System.out.println("Califique con una nota el encuentro del 1 al 5");
    int num = rd.nextInt();
      if (num >= 1 && num <= 5){
        switch (num){
            case 1: 
                  System.out.println("Lamentamos que no te haya gustado, "
                          + "podes solicitar el reintegro del dinero si asi "
                          + "lo deseas");
                  break;
            case 2:
                  System.out.println("Lamentamos que no te haya gustado, "
                          + "podrias dejarnos algun comentario sobre lo que "
                          + "no te gusto para mejorar los proximos encuentros?");
                  break;
            case 3: 
                  System.out.println("Nos alegra que te haya gustado, haremos "
                          + "nuestro mayor esfuerzo para poder mejorar en los "
                          + "siguientes encuentros!");
                  break;
            case 4:
                  System.out.println("Genial! nos ayuda mucho recibir tu "
                          + "feedback para poder mejorar en proximos "
                          + "encuentros");
                  break;
            case 5:
                  System.out.println("Nos encanta poder haberte ayudado y que "
                          + "te haya sido de utilidad el encuentro!");
                  break;
        
                 
          }
      }else if (num==0){
                  System.out.println("el 0 no es una calificacion valida");
                  }
          else if (num<=0){
              System.out.println("tannnn malo fue el encuentro? andate a la "
                      + "concha de tu vieja");
          }
          else {
              System.out.println("se te fue la mano flaco, aguantate la "
                      + "emocion");
          }
    }
    
}
