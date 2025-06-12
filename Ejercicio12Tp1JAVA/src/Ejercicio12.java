/*12. Pide al usuario un número entero. Calcula y muestra la suma de sus dígitos. Por ejemplo, si el
número es 123, la suma de sus dígitos es 1+2+3=6.
 
Troncoso Fernando Gabriel 5°1°*/

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un numero:");
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int sum=0;
		int n2=n;
		
		do {
			
			sum+=n%10;
			n/=10;
			
		}while(n!=0);
		
		System.out.println("El resultado de la suma de los digitos del numero "+n2+" es igual a "+sum);
		scanner.close();
	}

}
