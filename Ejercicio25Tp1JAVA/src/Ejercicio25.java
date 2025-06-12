/*25. Realizar una calculadora con operaciones aritméticas simples (+,-,*,/)
 
 Troncoso Fernando G 5°1
 */

import java.util.*;

public class Ejercicio25 {

	static Scanner scanner = new Scanner(System.in); //se utiliza static para indicar que el scanner pertenece a toda la clase
	
	static float leerFloat() {
        float numero;
        while (true) {
            if (scanner.hasNextFloat()) {
                numero=scanner.nextFloat();
                scanner.nextLine(); // limpiar buffer
                return numero;
            } else {
                System.out.println("No ingreso numeros.\nIngrese un numero.");
                scanner.nextLine(); // limpiar buffer inválido
            }
        }
    }

    static void suma() { //contenido de la funcion
        float suma=0;

        System.out.print("Ingrese la cantidad de numeros que desee sumar: ");
        int n1=(int) leerFloat();

        float[] vector1=new float[n1];

        for (int i = 0; i < n1; i++) {
            System.out.print("Ingrese un numero: ");
            vector1[i]=leerFloat();
        }

        for (int i = 0; i < n1; i++) {
            suma+=vector1[i];
        }

        System.out.println("El resultado de la suma de los elementos es: " + suma);
    }

    static void resta() {
        System.out.print("Ingrese la cantidad de numeros que desee restar: ");
        int n2=(int) leerFloat();

        float[] vector2=new float[n2];

        for (int i = 0; i < n2; i++) {
            System.out.print("Ingrese un numero: ");
            vector2[i] = leerFloat();
        }

        float resta = vector2[0];
        for (int i=1; i<n2; i++) {
            resta-=vector2[i];
        }

        System.out.println("El resultado de la resta es: " + resta);
    }

    static void multi() {
        System.out.print("Ingrese la cantidad de numeros que desee multiplicar: ");
        int n5=(int) leerFloat();

        float[] vector5=new float[n5];

        for (int i=0; i<n5; i++) {
            System.out.print("Ingrese un numero: ");
            vector5[i]=leerFloat();
        }

        float multiplicacion = 1;
        for (int i=0; i<n5; i++) {
            multiplicacion *= vector5[i];
        }

        System.out.println("El resultado de la multiplicacion de los elementos es: " + multiplicacion);
    }

    static void div() {
        System.out.print("Ingrese el dividendo: ");
        float n6=leerFloat();

        float divisor;
        do {
            System.out.print("Ingrese el divisor: ");
            divisor=leerFloat();

            if (divisor==0) {
                System.out.println("No se puede dividir entre 0. Ingrese nuevamente un numero distinto a 0.");
            }
        } while (divisor==0);

        float division=n6/divisor;

        System.out.println("El resultado de la division es: " + division);
    }

    public static void main(String[] args) {
        float opc;

        do {
            System.out.println("\n\t\t\t-----CALCULADORA------\n");
            System.out.print("1. Realizar suma de numeros.\t\t");
            System.out.println("2. Realizar resta de numeros.\n");
            System.out.print("3. Realizar multiplicacion de numeros.\t");
            System.out.println("4. Realizar division de numeros.\n");
            System.out.println("5. Salir de la calculadora.\n");

            System.out.print("Ingrese una opcion del menu: ");
            opc = leerFloat();

            switch ((int) opc) //convierte opc de float a int para usarlo en el switch 
            {
                case 1:
                    suma(); //llamado de funcion
                    break;

                case 2:
                    resta();
                    break;

                case 3:
                    multi();
                    break;

                case 4:
                    div();
                    break;

                case 5:
                    System.out.println("Saliendo de la calculadora.");
                    break;

                default:
                    System.out.println("Opcion no valida.\nIngrese nuevamente una opcion:");
                    break;
            }

        } while ((int) opc != 5);
    

	
	

}

}
