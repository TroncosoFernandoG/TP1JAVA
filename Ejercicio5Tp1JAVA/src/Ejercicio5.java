import java.util.Scanner;

/*5- Tabla de Multiplicar: Solicita al usuario un número del 1 al 10. Genera y muestra por consola
la tabla de multiplicar de ese número del 1 al 10.

Troncoso Fernando G 5°1
*/


public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int resultado;
		
		do {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese Un Numero del 1 al 10 para ver su tabla");
		
		n=scanner.nextInt();
		
		scanner.close();

		/*Usa una estructura 'switch' para ejecutar un bloque de código diferente
		 dependiendo del valor del número 'n' ingresado por el usuario.*/
		switch(n) {
		
		case 1: // Si 'n' es 1
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break; // Sale del bloque 'switch' después de ejecutar este caso.

		case 2: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 3: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 4: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 5: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 6: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 7: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 8: 
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 9:
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		
		case 10:
			
			for(int i=1;i<11;i++) {
				resultado= n*i;
				System.out.println(n+"x"+i+"="+resultado);
			}
			
		break;
		}
		
		}while(n<0||n>10);
		/*Condición del bucle 'while': El bucle se repite si 'n' es menor que 0 O 'n' es mayor que 10.
		Esto asegura que el usuario ingrese un número en el rango [1, 10].*/
		
		
	}
	

}
