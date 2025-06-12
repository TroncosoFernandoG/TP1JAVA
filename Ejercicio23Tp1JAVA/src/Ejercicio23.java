/*23. Crea un arreglo (array) de 5 cadenas de texto (por ejemplo, nombres de ciudades). Pide al
usuario que ingrese una cadena de texto para buscar. Utiliza un bucle for-each para
determinar si la cadena ingresada se encuentra en el arreglo. Muestra un mensaje indicando si
se encontró o no.

Troncoso Fernando G 5°1
*/

import java.util.*;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner=new Scanner(System.in);

	        
	        String[] ciudades={"Buenos Aires", "Tokio", "Londres", "Nueva York", "Roma"};

	        
	        System.out.println("Ingrese el nombre de la ciudad a buscar:");
	        String ciudadBuscada=scanner.nextLine();

	        boolean encontrada = false;

	       
	        for (String ciudad : ciudades) {
	            // equals compara si el contenido de las dos cadenas es igual
	            if (ciudad.equals(ciudadBuscada)) {
	                encontrada = true;
	                break; 
	            }
	        }

	        
	        if (encontrada) {
	            System.out.println("La ciudad fue encontrada.");
	        } else {
	            System.out.println("La ciudad no fue encontrada.");
	        }
	        
		scanner.close();
	}

}
