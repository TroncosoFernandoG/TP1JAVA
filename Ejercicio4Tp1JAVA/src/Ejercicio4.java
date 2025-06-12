/*4-Suma de Números Pares e Impares: Pide al usuario un número entero positivo N. Luego,
calcula y muestra la suma de todos los números pares desde 1 hasta N, y la suma de todos los
números impares desde 1 hasta N.

Troncoso Fernando Gabriel 5°1°
*/

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int SumPares=0;
		int SumImpares=0;
		
		
		do {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese Un Numero entero positivo");
		
		n=scanner.nextInt();
		
		}while(n<0);
		
		for(int i=1;i<n+1;i++) {
			if(i%2==0) {
				SumPares+=i;
			}else {
				SumImpares+=i;
			}
		}
		System.out.println("La suma total de pares es "+ SumPares);
		System.out.println("La suma total de impares es "+SumImpares);
	}

}
