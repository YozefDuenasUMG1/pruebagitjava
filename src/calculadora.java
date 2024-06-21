import java.util.Scanner;// Método para la opción 1: Calculadora básica
private static void calculadoraBasica(Scanner scanner) {
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();

    System.out.print("Elija la operación (+ para suma, - para resta): ");
    char operacion = scanner.next().charAt(0);

    double resultado;
    switch (operacion) {
        case '+':
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
            break;
        case '-':
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
        default:
            System.out.println("Operación no válida. Solo se permiten + o -.");
    }
}