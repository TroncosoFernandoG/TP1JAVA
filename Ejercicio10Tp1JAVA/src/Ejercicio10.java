/*10. Solicita al usuario un n�mero entero no negativo. Calcula y muestra el factorial de ese
n�mero
 
 Troncoso Fernando G 5�1
*/

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n;
		
		
		do {
			
			System.out.println("Ingrese un numero entero no negativo");
			n=scanner.nextInt();
			
		}while(n<0);
		
		int facto=n;
		
		scanner.close();
		
		if(n==0) {
			System.out.println(n+"!= 1");
		}else {
			
			
			for(int i=n-1;i>0;i--) {
				facto*=i;
			}
			System.out.println(n+"!= "+facto);
		}
		
		
	}

}
