package Ejercicios_Practicos;

public class Multi {
    public static void main(String[] args) {
        String[] noches = { "2", "x", null };
        for (String n : noches) {
            try {
                System.out.println("Noches: " + Integer.parseInt(n.trim()));
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Dato invalido: " + e.getClass().getSimpleName());
            }
        }
    }
}