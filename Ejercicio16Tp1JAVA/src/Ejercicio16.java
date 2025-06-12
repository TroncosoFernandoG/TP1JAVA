/*16. • Clasificación de un Triángulo: Pide al usuario las longitudes de los tres lados de un
triángulo. Determina y muestra si el triángulo es equilátero (todos los lados iguales), isósceles
(dos lados iguales) o escaleno (todos los lados diferentes).
 
 Troncoso Fernando G 5°1
 */

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Ingrese la longitud del 1er lado: ");
		a=scanner.nextInt();
		
		System.out.println("Ingrese la longitud del 2do lado");
		b=scanner.nextInt();
		
		System.out.println("Ingrese la longitud del 3er lado");
		c=scanner.nextInt();
		
		if(a==b && a==c) {
			
			System.out.println("El triangulo es equilatero");
			
		}else if((a==b && a!=c) || (a!=b && a==c) || (b!=a || c!=a && b==c) ) {
			
			System.out.println("El triangulo es isosceles");
			
		}else {
			
			System.out.println("El triangulo es escaleno");
			
		}
		

		scanner.close();
	}

}
