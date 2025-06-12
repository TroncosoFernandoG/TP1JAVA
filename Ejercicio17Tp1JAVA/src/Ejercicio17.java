/*17. • Contador de Palabras: Solicita al usuario una frase. Cuenta y muestra el número de palabras
en la frase. Considera que las palabras están separadas por espacios.

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		 System.out.println("Ingrese una cadena de palabras: ");
	        String cadena=scanner.nextLine();
	        
	        int cant_palabras=0;
	        
	        // Convertir la cadena a un arreglo de caracteres
	        char[] cadenaArray=cadena.toCharArray();
	        
	        for (int i=0; i<cadenaArray.length; i++) {
	            if (cadenaArray[i]==' ' || cadenaArray[i]=='\n') {
	                cant_palabras++;
	            }
	        }
	        
	        
	        cant_palabras++;
	        

	        System.out.println("La cantidad de palabras es: " + cant_palabras);
		
	        scanner.close();
		
	}

}
