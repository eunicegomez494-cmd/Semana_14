package Ejercicios_Practicos;

public class Ej7Mal {
    public static void main(String[] args) {
        try {
            Class.forName("Habitacion");
            int n = Integer.parseInt("x");
        } catch (RuntimeException e) {
            System.out.println("En ejecucion");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}