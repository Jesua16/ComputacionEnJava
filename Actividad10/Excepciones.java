package Actividad10;

public class Excepciones {
    /**
 * Clase principal donde se realiza la lectura de datos, 
 * la selección de la operación aritmética y el manejo de excepciones.
 */
public class Main {

    /**
     * Método principal (punto de entrada) de la aplicación.
     */
    public static void main(String[] args) {
        
        // [Punto A: Declaración de variables y creación del Scanner]
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int numero1, numero2;
        String operacion;
        // [Fin de Punto A]

        // [Punto B: Bloque try]
        try {
            // Solicitar los dos números al usuario
            System.out.print("Introduce el primer número: ");
            numero1 = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            numero2 = sc.nextInt();

            // Solicitar la operación a realizar (+, -, *, /)
            System.out.print("Introduce la operación aritmética (+, -, *, /): ");
            operacion = sc.next();

            // [Punto B.1: Estructura switch]
            switch (operacion) {
                case "+":
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case "/":
                    // Verificamos si el segundo número es cero para evitar la división por cero
                    if (numero2 == 0) {
                        throw new ArithmeticException("Error: División por cero.");
                    }
                    System.out.println("Resultado: " + (numero1 / numero2));
                    break;
                default:
                    // Si la operación no es ninguna de las anteriores, lanzamos excepción
                    throw new IllegalArgumentException("Operación aritmética inválida: " + operacion);
            }
            // [Fin de Punto B.1]

        }
        // [Fin de Bloque try]

        // [Punto C: Bloque catch]
        catch (Exception e) {
            // Captura y muestra cualquier excepción que ocurra en el bloque try
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
        // [Fin de Bloque catch]

        // [Punto D: Bloque finally]
        finally {
            // Aseguramos el cierre del Scanner para liberar recursos
            sc.close();
            System.out.println("El objeto Scanner se ha cerrado correctamente.");
        }
        // [Fin de Bloque finally]
    }
}

}
