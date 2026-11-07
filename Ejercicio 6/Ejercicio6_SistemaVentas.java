import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6_SistemaVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalAcumulado = 0;
        
        try {
            // true = modo append
            FileWriter fw = new FileWriter("ventas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while (true) {
                System.out.print("Ingrese el nombre del producto (o 'fin' para terminar): ");
                String nombre = sc.nextLine();
                
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }
                
                System.out.print("Ingrese el precio: ");
                double precio = sc.nextDouble();
                
                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                
                double subtotal = precio * cantidad;
                double totalPagar = subtotal;
                
                // Aplicar descuento del 10% si el subtotal es >= 100
                if (subtotal >= 100) {
                    totalPagar = subtotal * 0.90; // 10% de descuento
                    System.out.println("Se aplicó un descuento del 10%");
                }
                
                System.out.println("Total a pagar por este producto: $" + totalPagar);
                
                // Guardar la venta en el archivo
                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write("Precio unitario: " + precio);
                bw.newLine();
                bw.write("Cantidad: " + cantidad);
                bw.newLine();
                bw.write("Subtotal: " + subtotal);
                bw.newLine();
                bw.write("Total a pagar: " + totalPagar);
                bw.newLine();
                bw.write("------------------------");
                bw.newLine();
                
                totalAcumulado += totalPagar;
            }
            
            // Guardar el total acumulado al finalizar
            bw.write("TOTAL ACUMULADO DE VENTAS: $" + totalAcumulado);
            bw.newLine();
            bw.write("========================================");
            bw.newLine();
            
            bw.close();
            System.out.println("\nRegistro de ventas finalizado.");
            System.out.println("Total acumulado de todas las ventas: $" + totalAcumulado);
            System.out.println("Datos guardados en ventas.txt");
            
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
