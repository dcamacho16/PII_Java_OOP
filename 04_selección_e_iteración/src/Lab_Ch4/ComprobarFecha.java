package Lab_Ch4;

import java.util.Scanner;

public class ComprobarFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la fecha al usuario
        System.out.print("Introduce una fecha en formato DD-MMMMMMMM-AAAA: ");
        String fecha = scanner.nextLine().trim();

        // Separar los componentes de la fecha
        int primerGuion = fecha.indexOf("-");
        int segundoGuion = fecha.lastIndexOf("-");
        if (primerGuion == -1 || segundoGuion == -1 || primerGuion == segundoGuion) {
            System.out.println("Error: El formato de la fecha no es válido.");
            return;
        }

        String diaStr = fecha.substring(0, primerGuion);
        String mes = fecha.substring(primerGuion + 1, segundoGuion);
        String anioStr = fecha.substring(segundoGuion + 1);

        // Convertir día y año a enteros
        int dia;
        int anio;
        try {
            dia = Integer.parseInt(diaStr);
            anio = Integer.parseInt(anioStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Día o año no son números válidos.");
            return;
        }

        // Verificar el mes
        boolean mesValido = mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") ||
                            mes.equalsIgnoreCase("Marzo") || mes.equalsIgnoreCase("Abril") ||
                            mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio") ||
                            mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") ||
                            mes.equalsIgnoreCase("Septiembre") || mes.equalsIgnoreCase("Octubre") ||
                            mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre");

        if (!mesValido) {
            System.out.println("Error: El mes no es válido.");
            return;
        }

        // Verificar el día según el mes
        boolean diaValido = false;

        if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Marzo") || 
            mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Julio") || 
            mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Octubre") || 
            mes.equalsIgnoreCase("Diciembre")) {
            if (dia >= 1 && dia <= 31) {
                diaValido = true;
            }
        } else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Junio") || 
                   mes.equalsIgnoreCase("Septiembre") || mes.equalsIgnoreCase("Noviembre")) {
            if (dia >= 1 && dia <= 30) {
                diaValido = true;
            }
        } else if (mes.equalsIgnoreCase("Febrero")) {
            boolean bisiesto = (anio > 1584) && ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0));
            if (bisiesto && dia >= 1 && dia <= 29) {
                diaValido = true;
            } else if (!bisiesto && dia >= 1 && dia <= 28) {
                diaValido = true;
            }
        }

        if (!diaValido) {
            System.out.println("Error: El día no es válido para el mes y año proporcionados.");
            return;
        }

        // Si todo está correcto
        System.out.println("La fecha introducida es correcta.");
    }
}
