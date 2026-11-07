import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8_EscribirMaterias {
    private static final String RUTA = "materias.txt";

    public static void main(String[] args) {
        String[] materias = {
            "Programacion Orientada a Objetos",
            "Bases de Datos",
            "Estructuras de Datos",
            "Redes de Computadoras",
            "Sistemas Operativos"
        };

        BufferedWriter salida = null;
        try {
            salida = new BufferedWriter(new FileWriter(RUTA));
            for (String materia : materias) {
                salida.write(materia);
                salida.newLine();
            }
            System.out.println("[OK] Se escribieron " + materias.length
                    + " asignaturas en " + RUTA);
        } catch (IOException ex) {
            System.out.println("[ERROR] No se pudo escribir en el archivo: " + ex.getMessage());
        } finally {
            try {
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException ex) {
                System.out.println("[ERROR] No se pudo cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
