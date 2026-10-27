package Ejercicios_Practicos;

public class Orden2 {
    static void probar(String dato) {
        try {
            int noches = Integer.parseInt(dato);
            System.out.println("Precio por noche: " + (300 / noches));
        } catch (ArithmeticException e) {
            System.out.println("Aritmetica: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Otra en ejecucion: " + e.getClass().getSimpleName());
        } catch (Exception e) {
            System.out.println("General");
        }
    }

    public static void main(String[] args) {
        probar("3");
        probar("0");
        probar("tres");
    }
}