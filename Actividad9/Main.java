package Actividad9;
import java.util.Scanner;


class Estudiante {
    private String nombre;
    private int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes que desea almacenar: ");
        int cantidadEstudiantes = sc.nextInt();
        sc.nextLine();  // Consumir el salto de línea pendiente

        // Crear un arreglo de objetos Estudiante
        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        // Bucle para llenar el arreglo con los datos de cada estudiante
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingresando datos del estudiante #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea

            // Crear objeto Estudiante y almacenarlo en el arreglo
            estudiantes[i] = new Estudiante(nombre, edad);
        }

        // Bucle para mostrar los atributos de los estudiantes
        System.out.println("\nDetalles de los estudiantes ingresados:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Estudiante #" + (i + 1) + ":");
            System.out.println("  Nombre: " + estudiantes[i].getNombre());
            System.out.println("  Edad: " + estudiantes[i].getEdad());
        }

        sc.close();
    }
}
