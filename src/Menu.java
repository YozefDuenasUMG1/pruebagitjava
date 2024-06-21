import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Calculadora básica (suma y resta)");
            System.out.println("2. Verificar si un número es primo");
            System.out.println("3. Crear tabla de multiplicar");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadoraBasica(scanner);
                    break;
                case 2:
                    verificarNumeroPrimo(scanner);
                    break;
                case 3:
                    crearTablaMultiplicar(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 4.");
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }

    // Método para la opción 1: Calculadora básica
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

    // Método para la opción 2: Verificar si un número es primo
    private static void verificarNumeroPrimo(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para la opción 3: Crear tabla de multiplicar
    private static void crearTablaMultiplicar(Scanner scanner) {
        System.out.print("Ingrese un número para crear su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
