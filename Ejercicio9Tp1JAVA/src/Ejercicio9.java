/*9- Pide al usuario que ingrese tres números enteros. Determina y muestra cuál de los tres es el
mayor.

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese Un Numero del 1 al 10 para ver su tabla");
		
		
		
		
		
		System.out.println("Ingrese tres numeros enteros: \n");
		System.out.print("1er Numero= ");
		n1=scanner.nextInt();
		System.out.print("\n2do Numero= ");
		n2=scanner.nextInt();
		System.out.print("\n3er Numero= ");
		n3=scanner.nextInt();
		scanner.close();
		
		int n4= Math.max(n1,n2);
		int n5= Math.max(n4,n3);
		
		System.out.println("\nEl numero mas grande entre los tres numeros ingresados es: "+n5 );
		
	}

}
