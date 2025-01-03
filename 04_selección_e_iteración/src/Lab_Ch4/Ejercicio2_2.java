package Lab_Ch4;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        float n = 105.4896f;
        int roundedN = Math.round(n);

        char codigo;
        if (roundedN < -100) {
            codigo = 'a';
        } else if (roundedN < 0) {
            codigo = 'b';
        } else if (roundedN < 100) {
            codigo = 'c';
        } else {
            codigo = 'd';
        }

        switch (codigo) {
            case 'a':
                System.out.println("n < -100");
                break;
            case 'b':
                System.out.println("-100 <= n < 0");
                break;
            case 'c':
                System.out.println("0 <= n < 100");
                break;
            case 'd':
                System.out.println("100 <= n");
                break;
            default:
                System.out.println("Error: Código no válido");
        }
    }
}
