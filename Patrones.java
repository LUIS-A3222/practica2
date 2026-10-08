
import java.util.Scanner;

public class Patrones{
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


System.out.println("--------------");
System.out.println("CUADRADO");

    for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 4; j++){        
            System.out.print("*");    
            }
        System.out.println();
    }


System.out.println("--------------");
System.out.println("TRIANGULO DELIMITADO");
                
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 6 - i; j++) {
         System.out.print(" ");
        }
            if (i == 1) {
            System.out.print("1");
    }           else {
                    for (int j = 1; j <= i + 1; j++) {
                         if (j == 1 || j == i + 1) {
                            System.out.print("1 ");
                         }     
                                else { System.out.print("* ");
            }
        }
    }

    System.out.println();        
        }

System.out.println("--------------");
System.out.println("PIRAMIDE DE ASTERISCOS");

    for(int i = 1; i <= 5; i++){
        for (int j = 1; j <= 5-i; j++) {
         System.out.print(" ");
        }
          for (int j = 1; j <= i; j++){            
         System.out.print("* ");
            }
            
            System.out.println(" ");

        }   
        System.out.println("--------------");
        System.out.println("ROMBO DE ASTERISCOS");
        for(int i = 1; i <= 5; i++){
        for (int j = 1; j <= 5-i; j++) {
         System.out.print(" ");
        }
          for (int j = 1; j <= i; j++){            
         System.out.print("* ");
            }
            
            System.out.println(" ");

        }

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= 5 - i; j++) {
            System.out.print(" ");
    }

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
    }

            System.out.println(" ");
        }  
            System.out.println("--------------");
            System.out.println("PIRAMIDE NUMERICA SIMETRICA");
            for(int i = 1; i <= 5; i++){
                
        for (int j = 1; j <= 5-i; j++) {
         System.out.print(" ");
        }
        
          for (int j = 1; j <= i; j++){            
         System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
    System.out.print(j);
}
            System.out.println(" ");

        }
    }
}
