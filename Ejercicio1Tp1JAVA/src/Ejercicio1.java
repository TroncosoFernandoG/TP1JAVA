/*1. Escribir por consola los números de del 1 al 100 de la siguiente forma
si el número es par, escribir par sino escribir el mismo número

Troncoso Fernando Gabriel 5°1°
*/


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*El método 'main' es el punto de entrada de nuestro programa.
		Todo lo que el programa hace, empieza aquí.*/

		
		// Iniciamos un ciclo 'for' que va desde el número 1 hasta el 100.
		for(int i=1;i<101;i++) {

			// Usamos una condición 'if' para verificar si el número actual 'i' es par o impar.
			if(i%2==0) {
				System.out.println("PAR"); // Si el número es par, imprimimos la palabra "PAR" en la consola.
			}else {
				System.out.println(""+ i); // Si el número no es par (es decir, es impar), imprimimos el número mismo.
			}
			
		}
		
	}

}
