/*6- Se Ie pide al usuario que ingrese una palabra o frase. Luego, muestra por consola la misma
palabra o frase pero invertida. Por ejemplo, si ingresa 'hola' debe mostrar 'aloh'

Troncoso Fernando Gabriel 5°1°
*/

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese una palabra o frase que desee invertir:");
		
		Scanner scanner=new Scanner(System.in);
		/* Lee la línea completa de texto que el usuario ingresa (incluyendo espacios)
		 y la guarda en la variable 'palabra' de tipo String.*/
		String palabra=scanner.nextLine();
		/* Crea un nuevo objeto StringBuilder a partir de la 'palabra' ingresada.
		StringBuilder es una clase que permite modificar cadenas de texto de forma eficiente.*/
		StringBuilder stringBuilder = new StringBuilder(palabra);
		/*Usa el método 'reverse()' de StringBuilder para invertir la secuencia de caracteres.
		Luego, convierte el StringBuilder invertido de nuevo a un String y lo guarda en 'invert'.*/
		String invert = stringBuilder.reverse().toString();
		
		System.out.println(palabra); // Imprime la palabra o frase original ingresada por el usuario.
		System.out.println(invert);

		scanner.close(); // Cerrar el objeto Scanner para liberar los recursos del sistema.
		
	}

}
