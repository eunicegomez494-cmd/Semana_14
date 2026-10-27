package Semana14.ejemplos;

public class Hotel {
    static void reservar(int caso) {
        int[] habitaciones = { 101, 102, 103 };
        String huesped = null;
        if (caso == 1) {
            System.out.println(habitaciones[5]);
        } else if (caso == 2) {
            System.out.println(huesped.length());
        } else {
            System.out.println(Integer.parseInt("dos"));
        }
    }

    public static void main(String[] args) {
        for (int caso = 1; caso <= 3; caso++) {
            try {
                reservar(caso);
            } catch (RuntimeException e) {
                System.out.println("Caso " + caso + ": " + e.getClass().getSimpleName());
            }
        }
    }
}