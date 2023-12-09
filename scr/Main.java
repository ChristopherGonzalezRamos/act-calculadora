import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.print("Seleccione la operación (sumar/restar/multiplicar/dividir): ");
        String operacion = scanner.next();

        float resultado = 0;

        switch (operacion) {
            case "sumar":
                resultado = Operaciones.sumar(num1, num2);
                break;
            case "restar":
                resultado = Operaciones.restar(num1, num2);
                break;
            case "multiplicar":
                resultado = Operaciones.multiplicar(num1, num2);
                break;
            case "dividir":
                resultado = Operaciones.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida");
                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);
    }
}