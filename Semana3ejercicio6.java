/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3ejercicio6;

/**
 *
 * @author John Paul
 */
public class Semana3ejercicio6 {
    public static void main(String[] args) {
        double notaTotal = 0;
        double notaMayor = 0;
        double notaMenor = 100;
        int estudiantesAprobados = 0;
        int contadorEstudiantes = 0;
        
        System.out.println("Ingrese las notas de los estudiantes (Ingrese una nota negativa para finalizar):");
        
        while (true) {
            double nota = obtenerNota();
            
            if (nota < 0) {
                break;
            }
            
            notaTotal += nota;
            contadorEstudiantes++;
            
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            
            if (nota < notaMenor) {
                notaMenor = nota;
            }
            
            if (nota >= 70) {
                estudiantesAprobados++;
            }
        }
        
        double notaPromedio = notaTotal / contadorEstudiantes;
        
        System.out.println("Nota promedio: " + notaPromedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Cantidad de estudiantes aprobados: " + estudiantesAprobados);
    }
    
    public static double obtenerNota() {
        // Aquí puedes implementar la lógica para obtener la nota desde alguna fuente (por ejemplo, un archivo, una base de datos, etc.)
        // En este caso, puedes simplemente retornar un valor fijo para propósitos de demostración.
        return 0;  // Reemplaza este valor con la lógica adecuada para obtener la nota
    }
}
