import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
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

        System.out.println("###CALCULADORA BASICA###");
        System.out.println("Seleccione la operación: \n1- sumar \n2- restar \n3- multiplicar \n4- dividir");
        System.out.print("Escribe el numero de la operación a realizar: ");
        int operacion = scanner.nextInt();

        float resultado = 0;

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
                resultado = Operaciones.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida");
                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);
    }
}