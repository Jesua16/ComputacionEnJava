package Actividad8;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1 = 0f;
        float num2 = 0f;
        boolean inputValido = false;

        // --- Solicitar primer número ---
        do {
            System.out.print("Ingresa el primer número: ");
            try {
                num1 = Float.parseFloat(sc.nextLine());
                inputValido = true; // Si parsea bien, salimos del bucle
            } catch (NumberFormatException e) {
                System.out.println("Dato no válido. Por favor, ingresa un número.");
            }
        } while (!inputValido);

        // --- Solicitar segundo número ---
        inputValido = false;
        do {
            System.out.print("Ingresa el segundo número: ");
            try {
                num2 = Float.parseFloat(sc.nextLine());
                inputValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Dato no válido. Por favor, ingresa un número.");
            }
        } while (!inputValido);

        // --- Menú de opciones ---
        System.out.println("\n¿Qué operación deseas realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar ambos números al cuadrado");
        System.out.print("Opción: ");

        int opcion = 0;
        float resultado = 0f;

        // Validamos que la opción sea entera
        try {
            opcion = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Opción no válida, cerrando el programa...");
            sc.close();
            return;
        }

        // --- Switch para ejecutar la operación ---
        switch (opcion) {
            case 1 -> {
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
            }

            case 2 -> {
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
            }

            case 3 -> {
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }

            case 4 -> {
                if (num2 == 0) {
                    System.out.println("No es posible dividir entre cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado de la división: " + resultado);
                }
            }

            case 5 -> {
                // Elevar al cuadrado ambos números
                float cuadrado1 = num1 * num1;
                float cuadrado2 = num2 * num2;
                System.out.println("Primer número al cuadrado = " + cuadrado1);
                System.out.println("Segundo número al cuadrado = " + cuadrado2);
            }

            default -> System.out.println("Opción inválida. Saliendo del programa...");
        }

        sc.close();
    }
}
