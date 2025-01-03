package Lab_Ch4;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        //int j = 0;
        // Bucle FOR
		// for (int i = 3; i < 100; i = i + 5) {
		// 	System.out.println(">>>>>>> i=" + i);
		// 	for (j = 1; j < i/j; j += 4) {
		// 		System.out.println("> i+j=" + i + "+" + j + "=" + i + j);
		// 	}
		// }
        // Bucle WHILE
        int i = 3;
        while (i < 100) {
            System.out.println(">>>>>>> i=" + i);
            int j = 1; // Reiniciar j en cada iteración de i
            while (j < i/j) {
                System.out.println("> i+j=" + i + "+" + j + "=" + i + j);
                j += 4; // Incrementar j
            }
            i = i + 5; // Incrementar i
        }

    }
}


