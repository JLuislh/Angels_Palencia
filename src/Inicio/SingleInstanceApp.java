/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inicio;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JOptionPane;

public class SingleInstanceApp {

    private static final int PORT = 1000; // Puerto único para tu aplicación

    public static void main(String[] args) {
        // Intenta abrir un socket en el puerto único
        try (ServerSocket socket = new ServerSocket(PORT)) {
            System.out.println("Aplicación iniciada. No hay otras instancias en ejecución.");
             iniciarAplicacion();
             
             
             synchronized (SingleInstanceApp.class) {
                try {
                    SingleInstanceApp.class.wait(); // Bloquea el hilo principal
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } 
             
             
        } catch (IOException e) {
            // Si no se puede abrir el socket, significa que ya hay una instancia en ejecución
            System.err.println("Ya hay una instancia de la aplicación en ejecución.");
            System.exit(1); // Salir del programa
        }
    }

    private static void iniciarAplicacion() {
            Ordenes F = new Ordenes();
            F.setVisible(true);
           
        System.out.println("Tu aplicación está en funcionamiento...");
    }
}
