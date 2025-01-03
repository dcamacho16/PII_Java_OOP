package Lab_Ch4;

import java.util.Scanner;

public class SumaProgGeom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alfa = 0;
        int m = 0;
        boolean entradaValida = false;

        // Validar alfa (|α| < 1)
        while (!entradaValida) {
            System.out.print("Introduce el valor de α: ");
            try {
                alfa = Double.parseDouble(scanner.nextLine());
                if (Math.abs(alfa) < 1) {
                    entradaValida = true;
                } else {
                    System.out.println("El valor de α debe estar en el rango |α| < 1. Por favor, inténtalo de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("El valor de alfa introducido no cumple |alfa|<1. Introduce un nuevo valor de alfa.");
            }
        }

        // Validar m (entero)
        entradaValida = false; // Reiniciamos la variable para validar `m`
        while (!entradaValida) {
            System.out.print("Introduce el valor de m: ");
            try {
                m = Integer.parseInt(scanner.nextLine());
                entradaValida = true; // Si es un entero, la entrada es válida
            } catch (Exception e) {
                System.out.println("Error: Introduce un número entero válido para m.");
            }
        }

        // Configuración inicial para el cálculo
        double suma = 0;
        double sumaAnterior = 0;
        double TOL = 1e-10; // Tolerancia
        int n = m;

        System.out.println("Calculamos la suma de forma iterativa:");

        // Cálculo iterativo
        while (true) {
            suma += Math.pow(alfa, n); // Calculamos el siguiente término
            double error = Math.abs(suma - sumaAnterior); // Calculamos el error
            System.out.printf("Suma = %.12f\t Error = %.5e%n", suma, error);

            if (error < TOL) { // Comprobamos si el error es menor que la tolerancia
                break;
            }

            sumaAnterior = suma; // Actualizamos el valor anterior
            n++; // Aumentamos n para el siguiente término
        }

        // Cálculo directo
        double sumaDirecta = Math.pow(alfa, m) / (1 - alfa);
        System.out.println("Calculamos la suma de forma directa:");
        System.out.printf("Suma = %.12f%n", sumaDirecta);

        // Comparación
        double diferencia = sumaDirecta - suma;
        System.out.printf("La diferencia entre ambos métodos es: %.5e%n", diferencia);

        scanner.close(); // Cerramos el escáner
    }
}

