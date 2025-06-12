/*7- Contador de Vocales y Consonantes: Solicita al usuario una cadena de texto. Cuenta y
muestra el número de vocales (a, e, i, o, u, ignorando mayúsculas/minúsculas) y el número de
consonantes en la cadena.

Troncoso Fernando Gabriel 5°1°
*/

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ContVocales=0;
		int ContConsonantes=0;
		
		System.out.println("Ingrese una palabra o frase");
		
		Scanner scanner=new Scanner(System.in);
		
		String cadena=scanner.nextLine();

		/*Inicia un bucle 'for' que itera a través de cada carácter de la 'cadena'.
		'i' va desde 0 (el primer carácter) hasta la longitud de la cadena(cadena.lenght()) - 1 (el último carácter).
		*/
		for(int i=0;i<cadena.length();i++) {
			// Comprueba si el carácter actual es una vocal o una consonante (minúscula o mayúscula).
			// 'cadena.charAt(i)' obtiene el carácter en la posición 'i'.
			if(cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'||
			cadena.charAt(i)=='A'||cadena.charAt(i)=='E'||cadena.charAt(i)=='I'||cadena.charAt(i)=='O'||cadena.charAt(i)=='U') {
				ContVocales++;
			}else if(cadena.charAt(i)==' '){
			
			}else {
				ContConsonantes++;
			}
			
		}
		
		System.out.println("El numero de vocales en la cadena es: "+ContVocales);
		System.out.println("El numero de consonantes en la cadena es: "+ContConsonantes);
	}

}
