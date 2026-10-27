package Ejercicios_Practicos;

public class Orden {
    public static void main(String[] args) {
        try {
            int noches = 4 / 0;
        } catch (Exception e) {
            System.out.println("General");
        }
    }
}