/*15. • Cajero Automático Básico: Simula un cajero automático muy simple. El usuario inicia con
un saldo inicial (por ejemplo, $1000). Permítele realizar operaciones de depósito, retiro y
consulta de saldo. Valida que no se pueda retirar más dinero del que hay disponible.

Troncoso Fernando G 5°1
*/

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner=new Scanner(System.in);
		
        double saldo=1000;
        int opcion;
        double monto;

        do {
            System.out.println("\n\tCAJERO AUTOMATICO \n");
            System.out.print("1-Consultar saldo\t");
            System.out.println("2-Depositar dinero\n");
            System.out.print("3-Retirar dinero\t");
            System.out.println("4-Salir\n");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	
                    System.out.println("Tu saldo actual es: $" + saldo);
                    
                    break;
                case 2:
                	
                    System.out.print("Ingrese el monto a depositar: ");
                    monto = scanner.nextDouble();
                    if (monto>0) {
                        saldo+=monto;
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;
                    
                case 3:
                	
                    System.out.print("Ingrese el monto a retirar: ");
                    monto = scanner.nextDouble();
                    if (monto>saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else if (monto<=0) {
                        System.out.println("Monto invalido.");
                    } else {
                        saldo-=monto;
                        System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
                    }
                    break;
                    
                case 4:
                	
                    System.out.println("¡Saliendo del CAJERO, Gracias por utilizarnos!");
                    
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion!=4);
        
        scanner.close();
		
	}

}
