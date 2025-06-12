/*20. Pide al usuario la longitud deseada para una contraseña. Genera una contraseña aleatoria que
contenga una mezcla de letras minúsculas, mayúsculas y números, de la longitud
especificada. Por ejemplo, si el usuario pide una longitud de 8, la contraseña podría ser
'aB7cD2eF'.

Troncoso Fernando G 5°1
*/

import java.util.*;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner=new Scanner(System.in);
	        
	        Random random=new Random();
	        
	        int longitud;
	        
	        String mayusculas="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	        String minusculas="abcdefghijklmnñopqrstuvwxyz";
	        String numeros="1234567890";

	        // Unimos todas las cadenas para formar la lista total de caracteres posibles
	        String caracteres=mayusculas+minusculas+numeros;

	        String contrasena = "";

	        System.out.println("Ingrese la longitud de la contraseña:");
	        longitud=scanner.nextInt();

	        for (int i = 0; i < longitud; i++) {
	            // Elegimos un número aleatorio dentro del rango de la longitud de la cadena de caracteres
	            int indice=random.nextInt(caracteres.length());
	            
	            contrasena+=caracteres.charAt(indice); 
	        }//charAt se utiliza para obtener un carácter individual 
	        //de una cadena, en una posición específica.

	        
	        System.out.println("Contraseña generada: " + contrasena);
		
	        scanner.close();
	}

}
