/*13. Crea un programa que permita al usuario convertir temperaturas de Celsius a Fahrenheit o de
Fahrenheit a Celsius. Pide al usuario que elija la dirección de la conversión y luego el valor a
convertir.
Fahrenheit a Celsius: C=(F−32)×5/9
Celsius a Fahrenheit: F=C×9/5+32

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
        double celsius, fahrenheit;

        System.out.println("Elija que tipo de conversion realizar:\n");
        System.out.print("1-Celsius a Fahrenheit\t");
        System.out.print("2-Fahrenheit a Celsius\n \n");
        
        System.out.print("Opcion: ");
        
        Scanner scanner=new Scanner(System.in);
        op=scanner.nextInt();

        switch(op) {
        
        case 1:
        	
            System.out.println("Ingrese la temperatura en Celsius:");
            
            celsius=scanner.nextDouble();
            fahrenheit=celsius* 9/5+32; //Calculo de C° a F°
            
            System.out.println("Equivale a " + fahrenheit + " grados Fahrenheit");
            
            break;
            
        case 2:
            System.out.println("Ingrese la temperatura en Fahrenheit:");
            
            fahrenheit = scanner.nextDouble();
            celsius=(fahrenheit - 32)*5/9; //Calculo de F° a C°
            
            System.out.println("Equivale a " + celsius + " grados Celsius");
            
            break;
        
        default: //El default se usa en casos de que el valor ingresado no coincida con los case
            System.out.println("Opcion invalida");
            break;
        }
		scanner.close();
	}

}
