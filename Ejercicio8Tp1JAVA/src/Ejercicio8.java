/*8. Adivina el Número: Genera un número aleatorio entre 1 y 100 (inclusive). Pide al usuario
que adivine el número. Dale pistas como &quot;El número es mayor&quot; o &quot;El número es menor&quot;
hasta que adivine correctamente. Cuenta cuántos intentos le tomó.

Troncoso Fernando Gabriel 5°1°
*/

import java.util.Random; // Importa la clase Random para poder generar números aleatorios.
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); // Crea un nuevo objeto Random para generar números aleatorios.
		Scanner scanner=new Scanner(System.in);

		// Genera un número entero aleatorio entre 0 (inclusive) y 101 (exclusive).
		// Esto significa que generará números desde 0 hasta 100.
		// El resultado se guarda en una variable 'numero' de tipo int.
		int numero = random.nextInt(101);
		
		int n;
		int ContIntentos=0;

		/* Inicia un bucle 'do-while'. Esto asegura que se le pida al usuario que adivine
		 al menos una vez, y el bucle continuará mientras el número adivinado ('n') no sea igual al número secreto ('numero').*/
		do {
			System.out.println("ingrese un numero entre el 1 al 100");
			n=scanner.nextInt();
			ContIntentos++;
			if(n>numero) {
				System.out.println("El numero es menor");
			}else if(n<numero){
				System.out.println("El numero es mayor");
			}
			
		}while(n!=numero);
		
		System.out.println("!ENCONTRASTE EL NUMERO "+n+"!");
		System.out.println("Te tomo "+ContIntentos+" intentos");
	}

}
