import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9_AgregarMaterias {
    private static final String RUTA = "materias.txt";

    public static void main(String[] args) {
        BufferedWriter salida = null;
        try {
            // El segundo parametro (true) activa el modo "append"
            salida = new BufferedWriter(new FileWriter(RUTA, true));
            salida.write("Ingles Tecnico");
            salida.newLine();
            salida.write("Ingenieria de Software");
            salida.newLine();
            System.out.println("[OK] Se anadieron 2 asignaturas al final de " + RUTA);
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
