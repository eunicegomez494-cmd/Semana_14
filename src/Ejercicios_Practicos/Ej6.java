package Ejercicios_Practicos;

public class Ej6 {
    static void probar(String dato) {
        try {
            int pisos = Integer.parseInt(dato);
            int[] ascensores = new int[pisos];
            System.out.println("Ascensores: " + ascensores.length + ", primero: " + ascensores[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento invalido: " + e.getClass().getSimpleName());
        } catch (RuntimeException e) {
            System.out.println("Otro problema: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        probar("3");
        probar("piso");
        probar("1");
        probar("-2");
    }
}