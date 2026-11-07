import java.io.File;
import java.io.IOException;

public class Ejercicio7_ExplorarArchivo {
    private static final String RUTA = "datos/prueba.txt";

    public static void main(String[] args) {
        File archivo = new File(RUTA);

        // La carpeta "datos" debe existir; si no, createNewFile() lanza IOException
        File carpeta = archivo.getParentFile();
        if (carpeta != null && !carpeta.exists()) {
            carpeta.mkdirs();
        }

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("[OK] El archivo no existia y fue creado.");
            } catch (IOException ex) {
                System.out.println("[ERROR] No fue posible crear el archivo: " + ex.getMessage());
            }
        } else {
            System.out.println("[AVISO] El archivo ya existia.");
        }

        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta:   " + archivo.getPath());
    }
}
