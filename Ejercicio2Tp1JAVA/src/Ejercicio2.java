/*2-Escribir por consola los números del 50 al 100 de la siguiente manera si es un numero primo
escribir primo, sino escribir sus divisores

Troncoso Fernando Gabriel 5°1°
*/


public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int DivCont=0; //Declaro variable 'DivCont' para contar los divisores
		int cont=0;
		int[] divisores=new int[20];  /* Array para almacenar los divisores de cada número.
		 Se inicializa con un tamaño fijo de 20.*/
		
		for(int i=50;i<101;i++) {
			for(int j=1;j<101;j++) {
				
				if(i%j==0) {
					DivCont++; // Incrementa el contador de divisores.
					
					divisores[cont]=j;
					cont++;
				}
				
			}
			
			if(DivCont==2) {
				System.out.println(i +" ES PRIMO\n");
			}else {
				
				System.out.println("Los divisores numero "+i +" son: \n");
				
				for(int k=0;k<cont;k++) {
					System.out.print(" "+divisores[k]); //Imprime los divisores
				}
				
				System.out.println("\n");
			}
				
			DivCont=0;
			cont=0;
			}
			
		}
		
	}


