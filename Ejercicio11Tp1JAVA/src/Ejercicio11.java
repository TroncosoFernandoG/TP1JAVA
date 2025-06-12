/*11. Pide al usuario un año. Determina si es un año bisiesto y muestra un mensaje indicándolo.
(Un año es bisiesto si es divisible por 4, excepto si es divisible por 100 pero no por 400).
 
 Troncoso Fernando G 5°1
 */

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n;
		do {
		System.out.println("Ingrese un año apartir de 1000 para saber si es bisiesto o no: ");
		n=scanner.nextInt();
			}while(n<1000);

		//condiciones para que sea un año bisiesto
		if(n%4==0) {
			System.out.println(n+" es un año bisiesto");
		}
		else if(n%100==0 && n%400==0) {
				System.out.println(n+" es un año bisiesto");
			}
		else {
			System.out.println(n+" no es un año bisiesto");
		}
		scanner.close();
	}

}
