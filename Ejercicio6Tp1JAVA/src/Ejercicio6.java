/*6- Se Ie pide al usuario que ingrese una palabra o frase. Luego, muestra por consola la misma
palabra o frase pero invertida. Por ejemplo, si ingresa 'hola' debe mostrar 'aloh'*/

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese una palabra o frase que desee invertir:");
		
		Scanner scanner=new Scanner(System.in);
		String palabra=scanner.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder(palabra);
		String invert = stringBuilder.reverse().toString();
		
		System.out.println(palabra);
		System.out.println(invert);
	}

}
