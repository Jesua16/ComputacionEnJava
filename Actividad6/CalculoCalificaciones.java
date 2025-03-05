package Actividad6;


public class CalculoCalificaciones {
    // Atributo tipo String
    private String nombre;
    // Atributo tipo array con 5 valores numéricos
    private double[] calificaciones;

    // Método que calcula el promedio de las cinco calificaciones
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;  // Divide entre 5
    }

    // Método que obtiene la calificación final (carácter) según el promedio
    public char obtenerCalificacionFinal(double promedio) {
        // Según la tabla de rangos:
        // <= 50 = F, 51-60 = E, 61-70 = D, 71-80 = C, 81-90 = B, 91-100 = A
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método que imprime los resultados
    // (recibe como parámetros el nombre, el promedio, la calificación final y el arreglo de calificaciones)
    public void imprimirResultados(String nombre, double promedio, char calificacion, double[] calificaciones) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Creamos un array para las calificaciones
        double[] calificacionesEjemplo = { 100, 70, 80, 60, 90 };
        
        // Creamos un objeto de la clase
        CalculoCalificaciones alumno = new CalculoCalificaciones();
        
        // Asignamos nombre y las calificaciones
        alumno.nombre = "Juan Pérez";
        alumno.calificaciones = calificacionesEjemplo;
        
        // Calculamos el promedio
        double promedio = alumno.calcularPromedio(alumno.calificaciones);
        
        // Obtenemos la calificación final según la tabla
        char calFinal = alumno.obtenerCalificacionFinal(promedio);
        
        // Imprimimos resultados
        alumno.imprimirResultados(alumno.nombre, promedio, calFinal, alumno.calificaciones);
    }
}

