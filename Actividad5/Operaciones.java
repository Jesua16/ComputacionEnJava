public class Operaciones {
    public static void main(String[] args) {

        // 1. Definición de las cuatro variables de tipo float
        float Op1, Op2, Op3, Op4;

        // 2. Definición de tres variables adicionales para los valores a operar
        float valor1 = 10.0f;
        float valor2 = 5.0f;
        float valor3 = 2.0f;

        // 3. Realizar las operaciones:

        // Operación 1:
        // Sumar (valor1 + valor2) y restar el valor3
        // => (10.0 + 5.0) - 2.0 = 15.0 - 2.0 = 13.0
        Op1 = valor1 + valor2 - valor3;

        // Operación 2:
        // Restar (valor2 - valor3) y multiplicar por valor1
        // => (5.0 - 2.0) * 10.0 = 3.0 * 10.0 = 30.0
        Op2 = (valor2 - valor3) * valor1;

        // Operación 3:
        // Multiplicar valor1 * valor2 y luego por valor3
        // => (10.0 * 5.0) * 2.0 = 50.0 * 2.0 = 100.0
        Op3 = valor1 * valor2 * valor3;

        // Operación 4:
        // Dividir valor3 entre valor1 y al resultado sumarle valor2
        // => (2.0 / 10.0) + 5.0 = 0.2 + 5.0 = 5.2
        Op4 = (valor3 / valor1) + valor2;

        // 4. Imprimir los resultados
        System.out.println("Primer valor = " + valor1);
        System.out.println("Segundo valor = " + valor2);
        System.out.println("Tercer valor = " + valor3);

        System.out.println("Primera operación: " + Op1);
        System.out.println("Segunda operación: " + Op2);
        System.out.println("Tercera operación: " + Op3);
        System.out.println("Cuarta operación: " + Op4);
    }
}
