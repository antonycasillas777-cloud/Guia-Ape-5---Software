import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2RegistroProductosAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // true = modo append (agrega sin borrar lo anterior)
            FileWriter fw = new FileWriter("productos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();
            
            System.out.print("Ingrese el precio: ");
            double precio = sc.nextDouble();
            
            System.out.print("Ingrese la cantidad disponible: ");
            int cantidad = sc.nextInt();
            
            double valorTotal = precio * cantidad;
            
            // Guardar los datos
            bw.write("Producto: " + nombre);
            bw.newLine();
            bw.write("Precio: " + precio);
            bw.newLine();
            bw.write("Cantidad: " + cantidad);
            bw.newLine();
            bw.write("Valor total: " + valorTotal);
            bw.newLine();
            bw.write("------------------------");
            bw.newLine();
            
            bw.close();
            System.out.println("Producto registrado correctamente en productos.txt");
            System.out.println("Valor total del producto: " + valorTotal);
            
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
