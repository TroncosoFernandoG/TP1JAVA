/*21. Crea un arreglo (array) de 10 números enteros. Pide al usuario que ingrese un número X.
Utiliza un bucle for-each para recorrer el arreglo y contar cuántos elementos son mayores que
X. Muestra el resultado por consola.

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);

        
        int[] numeros = {87, 12, 5, 93, 45, 71, 29, 60, 38, 99};

        
        System.out.println("Ingrese un número:");
        int n1 = scanner.nextInt();

        int cantMayores=0;

     /*La variable 'n' toma cada valor del arreglo 'numeros', 
    y no modifica valores del inicio.*/
        
        for (int n2:numeros) { 
            if (n2>n1) {
                cantMayores++;
            }
        }
        
        System.out.println("Cantidad de números mayores que " + n1 + ": " + cantMayores);
        scanner.close();
		
	}

}
