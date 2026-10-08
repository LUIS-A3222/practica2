import java.util.Scanner;
public class Cadenas{ 
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

        int contador = 0;
        

        System.out.print("Ingresa una cadena: ");

        String cadena = scan.nextLine();

        System.out.println("LONGITUD DE CADENA");
        System.out.println("La longitud es: " + cadena.length());
         System.out.println(" ");

        //////////////////////////////////////////////////////

        System.out.println("CARACTERES");
        System.out.print("Los caracteres de la cadena son: ");
        for (int i = 0; i < cadena.length(); i++) {
        System.out.print( cadena.charAt(i));
        }
        System.out.println(" ");

        ///////////////////////////////////////////////////////
        
        System.out.println("CADENA INVERTIDA");
        System.out.println("La cadena invertida es: ");
        for (int i = cadena.length() - 1; i >= 0; i--) {
        System.out.print(cadena.charAt(i));
        }
         System.out.println(" ");

        ///////////////////////////////////////////////////////

        System.out.println("APARICIONES DE UN CARACTER");
        System.out.print("Ingresa el caracter te gusgtaira contar :D ");
        char caracter = scan.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {

        if (caracter == cadena.charAt(i)) {
        contador++;}
        }
        System.out.println("El caracter seleccionado aparece " + contador + " veces.");
         System.out.println(" ");

        ////////////////////////////////////////////////////////        
        
        System.out.println("SUBCADENA");
        System.out.print("Ingresa una subcadena: ");
        String subcadena = scan.next();
        int posicion = cadena.indexOf(subcadena);
        if (posicion != -1) {
        System.out.println("La subcadena sí se encuentra.");
        } else {
        System.out.println("La subcadena no se encuentra.");
        }
         System.out.println(" ");
        
        ////////////////////////////////////////////////////////
        
         System.out.println("ANAGRAMA");
        System.out.print("Ingresa una segunda cadena para verificar si puede ser un anagrama: ");
        String cadena2 = scan.next();
        if (cadena.length() != cadena2.length()) {
        System.out.println("No son anagramas.");
        } else {
        boolean anagrama = true;
        for (int i = 0; i < cadena.length(); i++) {
        char caracter_2 = cadena.charAt(i);
        int contador1 = 0;
        int contador2 = 0;
        for (int j = 0; j < cadena.length(); j++) {
        if (caracter_2 == cadena.charAt(j)) {
        contador1++;     }
        }
        for (int j = 0; j < cadena2.length(); j++) {
        if (caracter_2 == cadena2.charAt(j)) {
        contador2++;       }
        }
        if (contador1 != contador2) {
        anagrama = false;        }
        }
        if (anagrama) {
        System.out.println("Es un anagrama.");
        } else { System.out.println("No es un anagrama.");            }
        }

    
    }

}