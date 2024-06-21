import java.util.Scanner;// Método para la opción 3: Crear tabla de multiplicar
private static void crearTablaMultiplicar(Scanner scanner) {
    System.out.print("Ingrese un número para crear su tabla de multiplicar: ");
    int numero = scanner.nextInt();

    System.out.println("Tabla de multiplicar del " + numero + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
}