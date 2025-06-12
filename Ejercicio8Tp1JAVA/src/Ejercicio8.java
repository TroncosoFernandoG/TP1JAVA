/*8. Adivina el Número: Genera un número aleatorio entre 1 y 100 (inclusive). Pide al usuario
que adivine el número. Dale pistas como &quot;El número es mayor&quot; o &quot;El número es menor&quot;
hasta que adivine correctamente. Cuenta cuántos intentos le tomó.

Troncoso Fernando Gabriel 5°1°
*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner scanner=new Scanner(System.in);
		
		double numero = random.nextInt(101);
		
		int n;
		int ContIntentos=0;
		
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
