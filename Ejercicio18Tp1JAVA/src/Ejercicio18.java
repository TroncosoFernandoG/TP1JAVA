/*18. • Patrón de Asteriscos: Pide al usuario un número N. Genera y muestra un patrón de
asteriscos en forma de triángulo (o pirámide) de N filas. Por ejemplo, si N es 4:
*
**
***
****

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner=new Scanner(System.in);
		
		int n, i, j;
		
		System.out.println("Ingrese el numero que desee para generar un patron: ");
		n=scanner.nextInt();
		
		
		//Usar dos ciclos para generar el patron
		
		for(i=1;i<=n;i++) {
			
			for(j=0;j<i;j++) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
