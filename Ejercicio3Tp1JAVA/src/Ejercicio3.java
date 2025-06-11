/*3-Pedir números por pantalla hasta que alguno sea mayor a 100 y además sea un numero primo
 
Troncoso Fernando Gabriel 5°1°
 */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int ConTD=0;
		do {
			
			ConTD=0;
			
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Ingrese Un Numero mayor a 100 y que ademas sea primo: ");
		
		n=scanner.nextInt();
		
		for(int i=1;i<n+1;i++) {
			if(n%i==0) {
				ConTD++;
			}
		}
		
		}while(n<=100 || ConTD>=3);
		
		System.out.println("\n El numero es: "+n);
		
	}

}
