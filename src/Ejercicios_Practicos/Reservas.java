package Ejercicios_Practicos;

public class Reservas {
    static int[] tarifas = { 40, 65, 120 };

    static int cotizar(int tipo, String nochesTxt, int personas) {
        int noches = Integer.parseInt(nochesTxt);
        int total = tarifas[tipo] * noches;
        return total / personas;
    }

    public static void main(String[] args) {
        int[] tipos = { 1, 0, 2, 5, 1 };
        String[] noches = { "2", "tres", "1", "2", "4" };
        int[] personas = { 2, 1, 0, 1, 2 };

        try {
            for (int i = 0; i < tipos.length; i++) {
                int c = cotizar(tipos[i], noches[i], personas[i]);
                Thread.sleep(10); // simula la confirmacion
                System.out.println("Reserva " + (i + 1) + ": $" + c + " por persona");
            }
        } catch (NumberFormatException e) {
            System.out.println("Reserva: noches invalidas");
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Datos inconsistentes (" + e.getClass().getSimpleName() + ")");
        } catch (InterruptedException e) {
            System.out.println("Confirmacion interrumpida");
        }
    }
}