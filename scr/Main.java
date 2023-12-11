import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\n---------------------------");//Separadores de cada operacion de 2 numeros.
            System.out.print("\nIngrese el primer número: ");
            if (!scanner.hasNextFloat()) {
                System.out.println("El primer número no es válido, ingresa numeros validos");
                System.exit(0);
            }
            float num1 = scanner.nextFloat();

            System.out.print("Ingrese el segundo número: ");
            if (!scanner.hasNextFloat()) {
                System.out.println("El segundo número no es válido, ingresa numeros validos");
                System.exit(0);
            }
            float num2 = scanner.nextFloat();

        
            System.out.println("### CALCULADORA BÁSICA ###");
            System.out.println("Seleccione la operación:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.print("Escribe el número de la operación a realizar: ");
            int operacion = scanner.nextInt(); //Seleccion de Operacion

            float resultado = 0;

            //Switch de las operaciones que se realizaran
            switch (operacion) {
                case 1:
                    resultado = Operaciones.sumar(num1, num2);
                    break;
                case 2:
                    resultado = Operaciones.restar(num1, num2);
                    break;
                case 3:
                    resultado = Operaciones.multiplicar(num1, num2);
                    break;
                case 4:
                    if (num2 != 0) {
                            resultado = Operaciones.dividir(num1, num2);
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
                    break;
                default:
                    System.out.println("Operación no válida");
                    System.exit(0);
            }
            System.out.println("\nResultado: [" + resultado + "]");

            System.out.println("\n---------------------------");//Separadores de cada operacion de 2 numeros.

            System.out.println("\n¿Quieres realizar otra operación?");//Continuidaad de Bucle
            System.out.println("Si = [1]");
            System.out.println("No = [0]");
            int sn = scanner.nextInt();
            if (sn == 0) {
                break; // Sale del bucle si la respuesta es 0
            }
        }while ( true);
        
    }
}