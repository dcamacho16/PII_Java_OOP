/* EJERCICIO 1 */
package Lab_Ch4;

import java.util.Scanner;

public class OrdenandoPorApellido {
    public static void main(String[] args) {
        // Nos aseguramos que usa la codificación UTF-8 
        // para representar correctamente los carateres especiales
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Introducir datos para la primera persona
        System.out.println("==============================================");
        System.out.println("Introduce los datos de la 1ª persona: ");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine().trim();
        System.out.print("1er Apellido: ");
        String apellido11 = scanner.nextLine().trim();
        System.out.print("2º Apellido: ");
        String apellido21 = scanner.nextLine().trim();
        System.out.print("Asignatura 1: ");
        String asignatura11 = scanner.nextLine().trim();
        System.out.print("Asignatura 2: ");
        String asignatura12 = scanner.nextLine().trim();
        System.out.print("Asignatura 3: ");
        String asignatura13 = scanner.nextLine().trim();

        // Introducir datos para la segunda persona
        System.out.println("==============================================");
        System.out.println("Introduce los datos de la 2ª persona:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine().trim();
        System.out.print("1er Apellido: ");
        String apellido12 = scanner.nextLine().trim();
        System.out.print("2º Apellido: ");
        String apellido22 = scanner.nextLine().trim();
        System.out.print("Asignatura 1: ");
        String asignatura21 = scanner.nextLine().trim();
        System.out.print("Asignatura 2: ");
        String asignatura22 = scanner.nextLine().trim();
        System.out.print("Asignatura 3: ");
        String asignatura23 = scanner.nextLine().trim();

        // Introducir datos para la tercera persona
        System.out.println("==============================================");
        System.out.println("Introduce los datos de la 3ª persona:");
        System.out.print("Nombre: ");
        String nombre3 = scanner.nextLine().trim();
        System.out.print("1er Apellido: ");
        String apellido13 = scanner.nextLine().trim();
        System.out.print("2º Apellido: ");
        String apellido23 = scanner.nextLine().trim();
        System.out.print("Asignatura 1: ");
        String asignatura31 = scanner.nextLine().trim();
        System.out.print("Asignatura 2: ");
        String asignatura32 = scanner.nextLine().trim();
        System.out.print("Asignatura 3: ");
        String asignatura33 = scanner.nextLine().trim();
        
        scanner.close();

        // Ordenar información manualmente
        String tempNombre, tempApellido1, tempApellido2, tempAsig1, tempAsig2, tempAsig3;

         // Comparar primera y segunda persona
         if (apellido11.compareToIgnoreCase(apellido12) > 0 || 
         (apellido11.compareToIgnoreCase(apellido12) == 0 && apellido21.compareToIgnoreCase(apellido22) > 0)) {
         tempNombre = nombre1;
         tempApellido1 = apellido11;
         tempApellido2 = apellido21;
         tempAsig1 = asignatura11;
         tempAsig2 = asignatura12;
         tempAsig3 = asignatura13;

         nombre1 = nombre2;
         apellido11 = apellido12;
         apellido21 = apellido22;
         asignatura11 = asignatura21;
         asignatura12 = asignatura22;
         asignatura13 = asignatura23;

         nombre2 = tempNombre;
         apellido12 = tempApellido1;
         apellido22 = tempApellido2;
         asignatura21 = tempAsig1;
         asignatura22 = tempAsig2;
         asignatura23 = tempAsig3;
     }

     // Comparar segunda y tercera persona
     if (apellido12.compareToIgnoreCase(apellido13) > 0 || 
         (apellido12.compareToIgnoreCase(apellido13) == 0 && apellido22.compareToIgnoreCase(apellido23) > 0)) {
         tempNombre = nombre2;
         tempApellido1 = apellido12;
         tempApellido2 = apellido22;
         tempAsig1 = asignatura21;
         tempAsig2 = asignatura22;
         tempAsig3 = asignatura23;

         nombre2 = nombre3;
         apellido12 = apellido13;
         apellido22 = apellido23;
         asignatura21 = asignatura31;
         asignatura22 = asignatura32;
         asignatura23 = asignatura33;

         nombre3 = tempNombre;
         apellido13 = tempApellido1;
         apellido23 = tempApellido2;
         asignatura31 = tempAsig1;
         asignatura32 = tempAsig2;
         asignatura33 = tempAsig3;
     }

     // Comparar primera y segunda persona nuevamente
     if (apellido11.compareToIgnoreCase(apellido12) > 0 || 
         (apellido11.compareToIgnoreCase(apellido12) == 0 && apellido21.compareToIgnoreCase(apellido22) > 0)) {
         tempNombre = nombre1;
         tempApellido1 = apellido11;
         tempApellido2 = apellido21;
         tempAsig1 = asignatura11;
         tempAsig2 = asignatura12;
         tempAsig3 = asignatura13;

         nombre1 = nombre2;
         apellido11 = apellido12;
         apellido21 = apellido22;
         asignatura11 = asignatura21;
         asignatura12 = asignatura22;
         asignatura13 = asignatura23;

         nombre2 = tempNombre;
         apellido12 = tempApellido1;
         apellido22 = tempApellido2;
         asignatura21 = tempAsig1;
         asignatura22 = tempAsig2;
         asignatura23 = tempAsig3;
     }
     // Imprimir los datos ordenados
     System.out.println("\nLos nombres ordenados son:");
     System.out.println(nombre1 + " " + apellido11 + (apellido21.isEmpty() ? "" : " " + apellido21) + ":");
     if (!asignatura11.isEmpty()) System.out.println(">>> " + asignatura11);
     if (!asignatura12.isEmpty()) System.out.println(">>> " + asignatura12);
     if (!asignatura13.isEmpty()) System.out.println(">>> " + asignatura13);

     System.out.println(nombre2 + " " + apellido12 + (apellido22.isEmpty() ? "" : " " + apellido22) + ":");
     if (!asignatura21.isEmpty()) System.out.println(">>> " + asignatura21);
     if (!asignatura22.isEmpty()) System.out.println(">>> " + asignatura22);
     if (!asignatura23.isEmpty()) System.out.println(">>> " + asignatura23);

     System.out.println(nombre3 + " " + apellido13 + (apellido23.isEmpty() ? "" : " " + apellido23) + ":");
     if (!asignatura31.isEmpty()) System.out.println(">>> " + asignatura31);
     if (!asignatura32.isEmpty()) System.out.println(">>> " + asignatura32);
     if (!asignatura33.isEmpty()) System.out.println(">>> " + asignatura33);
    }
}
