/* EJERCICIO 1 */
package Lab_Ch4;

import java.util.Scanner;

public class OrdenandoPorApellido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("Introduce los datos de la 1ra persona: ");
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();

        // Prueba
        System.out.println(nombre);
        scan.close();

    }

}
