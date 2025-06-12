/*19. Crea un programa que simule el lanzamiento de dos dados. Genera dos números aleatorios
entre 1 y 6 (inclusive) para representar el resultado de cada dado. Muestra el valor de cada
dado y la suma total.

Troncoso Fernando G 5°1
*/

import java.util.Random;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random=new Random();
		
		int dado1=random.nextInt(6)+1; // Se le suma 1 porque arranca desde 0.
		
		int dado2=random.nextInt(6)+1;
		
		int suma=dado1 + dado2;
		
		System.out.println("Lanzamiento de los 2 dados: ");
		
		System.out.println("Dado 1: " + dado1);
		
		System.out.println("Dado 2: " + dado2);
		
		System.out.println("Suma de ambos dados: " + suma);

		
	}

}
