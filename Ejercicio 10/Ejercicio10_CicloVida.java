import java.io.File;
import java.io.IOException;

public class Ejercicio10_CicloVida {
    private static final String RUTA = "datos/temporal.txt";

    public static void main(String[] args) {
        File archivo = new File(RUTA);

        File carpeta = archivo.getParentFile();
        if (carpeta != null && !carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Consulta del estado y creacion segura
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("[OK] Archivo creado: " + archivo.getPath());
            } catch (IOException ex) {
                System.out.println("[ERROR] No fue posible crear el archivo: " + ex.getMessage());
            }
        } else {
            System.out.println("[AVISO] El archivo ya existe: " + archivo.getPath());
        }

        // Simula la confirmacion del usuario antes de borrar
        boolean confirmarBorrado = true;

        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de delete(): " + eliminado);
        } else {
            System.out.println("[AVISO] Borrado cancelado por el usuario.");
        }
    }
}
