package Bloque_II;

public class Espera2 {
    public static void main(String[] args) {
        System.out.println("Procesando reserva...");
        try {
            Thread.sleep(500);
            System.out.println("Listo");
        } catch (InterruptedException e) {
            System.out.println("Espera interrumpida");
        }
        try {
            Class.forName("ReservaPremium");
        } catch (ClassNotFoundException e) {
            System.out.println("No existe la clase: " + e.getMessage());
        }
    }
}