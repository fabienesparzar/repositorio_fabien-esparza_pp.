package programa02;

import java.util.Scanner;

public class ProyectoparcialFabien {
    public static void main(String[] args) {
        // Declarar variables
        String nombre;
        int horasTrabajadas;
        double tarifaHora, sueldoBruto, descuento, sueldoNeto;

        // Crear Scanner para entrada de datos
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar nombre del empleado: ");
        nombre = lectura.nextLine();

        System.out.print("Ingresar horas trabajadas: ");
        horasTrabajadas = lectura.nextInt();

        System.out.print("Ingresar tarifa por hora: ");
        tarifaHora = lectura.nextDouble();

        // Proceso
        sueldoBruto = horasTrabajadas * tarifaHora;
        descuento = sueldoBruto * 0.13;
        sueldoNeto = sueldoBruto - descuento;

        // Salida
        System.out.println("\nResumen de Pago para " + nombre + ":");
        System.out.printf("Sueldo Bruto: S/ %.2f%n", sueldoBruto);
        System.out.printf("Descuento ONP (13%%): S/ %.2f%n", descuento);
        System.out.printf("Sueldo Neto: S/ %.2f%n", sueldoNeto);

        // Cerrar Scanner
        lectura.close();
    }
}
