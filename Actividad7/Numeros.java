import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        // 1) Mostrar los números del 1 al 100 con while
        System.out.println("1) Números del 1 al 100 (while):");
        mostrarConWhile();
        
        // 2) Mostrar los números del 1 al 100 con for
        System.out.println("\n2) Números del 1 al 100 (for):");
        mostrarConFor();

        // 3) Módulo que muestre números del 1 al 100 divisibles entre 2 y 3
        System.out.println("\n3) Números del 1 al 100 divisibles entre 2 y 3:");
        mostrarDivisibles2y3();

        // 4) Módulo que lea un número por teclado y compruebe que es >= 0 (do-while)
        System.out.println("\n4) Leer número >= 0 (do-while):");
        pedirNumeroNoNegativo();
    }
    
    // --- Métodos ---

    // (1) Mostrar con while
    public static void mostrarConWhile() {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();  // Salto de línea al final
    }

    // (2) Mostrar con for
    public static void mostrarConFor() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  // Salto de línea al final
    }

    // (3) Mostrar números del 1 al 100 divisibles entre 2 y 3
    public static void mostrarDivisibles2y3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                // Imprime el número que cumpla ambas condiciones
                System.out.print(i + " ");
            }
        }
        System.out.println();  // Salto de línea al final
    }

    // (4) Leer un número >= 0 (do-while)
    public static void pedirNumeroNoNegativo() {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            do {
                System.out.print("Introduce un número mayor o igual a 0: ");
                numero = sc.nextInt();
            } while (numero < 0);
            System.out.println("Número ingresado: " + numero);
            // Cerramos el Scanner
        }
    }
}
