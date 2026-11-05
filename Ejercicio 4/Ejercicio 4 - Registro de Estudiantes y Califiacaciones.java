import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4Registro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // FileWriter en modo sobrescritura (crea o reemplaza el archivo)
            FileWriter fw = new FileWriter("estudiantes.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese el nombre del estudiante " + i + ": ");
                String nombre = sc.nextLine();
                
                System.out.print("Ingrese la calificación de " + nombre + ": ");
                String calificacion = sc.nextLine();
                
                // Cada estudiante ocupa dos líneas
                bw.write(nombre);
                bw.newLine();
                bw.write(calificacion);
                bw.newLine();
            }
            
            bw.close(); // Cierra correctamente el archivo
            System.out.println("Datos de los 3 estudiantes guardados correctamente en estudiantes.txt");
            
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
