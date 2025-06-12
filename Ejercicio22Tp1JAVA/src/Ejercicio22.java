/*22. Declara un arreglo de tipo double para almacenar 5 calificaciones. Pide al usuario que ingrese
estas calificaciones. Utiliza un bucle for-each para calcular el promedio de las calificaciones
y luego muestra el resultado.

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double[] calificaciones=new double[5];  // Declaramos un arreglo de tipo double para guardar 5 calificaciones
        double suma=0;

        System.out.println("Ingrese 5 calificaciones:");

        
        for (int i=0; i<5; i++) {
            calificaciones[i]=scanner.nextDouble();
        }

        
        for (double nota:calificaciones) {
            suma+=nota;
        }

        double promedio=suma/5;  // calculamos el promedio

        System.out.println("El promedio es: " + promedio);
		
        scanner.close();
	}

}
