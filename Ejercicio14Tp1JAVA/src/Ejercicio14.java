/*14. • Secuencia Fibonacci: Pide al usuario un número N. Genera y muestra los primeros N
términos de la secuencia de Fibonacci. (La secuencia comienza con 0 y 1, y cada término
subsiguiente es la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, ...).
 
 Troncoso Fernando G 5°1
 */

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);

		int n, i;
        int a=0, b=1, c; // 'a' y 'b' Inicializa el primer y segundo término de Fibonacci.

        System.out.println("Ingrese un Numero para iniciar la secuencia Fibonacci:");
        n=scanner.nextInt();

        if (n<=0) {
            System.out.println("Ingrese un numero mayor a 0.");
        } else {
            System.out.println("Los primeros " + n + " terminos son:");

            for (i=0; i<n; i++) {
                System.out.print(a + " "); // Imprime el término actual de la secuencia, seguido de un espacio.
                c = a+b;  // Calcula el siguiente término sumando los dos anteriores (a + b).
                a = b;  // Actualiza 'a' al valor de 'b' para el siguiente bucle.
                b = c;  // Actualiza 'b' al valor de 'c' (el recién calculado) para el siguiente bucle.
            }
        }
		
        scanner.close();
	}

}
