/*24. Pensar y desarrollar un ejemplo donde se vea el uso del for-each y comentarlo
pertinentemente

Ejemplo:Pedirle al usuario que ingrese 5 numeros en un arreglo y contar la cantidad de numeros que este contiene

Troncoso Fernando G 5°1
*/

import java.util.*;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros=new int[5];

		Scanner scanner=new Scanner(System.in);
        
        int ContPrimos=0;
        int contD=0;
        
        System.out.println("Ingrese 5 numeros para el arreglo");
        
        for(int i=0; i<5; i++) {
        	numeros[i]=scanner.nextInt();
        }
        
        /* Usamos un bucle for-each para recorrer todos los números del arreglo
         En cada vuelta, la variable num toma el valor del siguiente número en el arreglo*/
        
        for (int num : numeros) {
            
        	// Verificar si el número es primo
          for(int i=1; i<num+1; i++) {
        	
        	  if(num%i==0) {
        		  contD++;
        	  }
          }
          
          if(contD==2) {
        	  ContPrimos++;
          }
          contD=0;
        }

        
        System.out.println("Cantidad de números primos: " + ContPrimos);
		
        scanner.close();
	}

}
