package Ejercicios_Practicos;

public class Ej2 {
    static void caso(int i) {
        try {
            if (i == 1) {
                Object o = "suite";
                Integer n = (Integer) o;
            } else if (i == 2) {
                int[] pisos = new int[2];
                pisos[2] = 7;
            } else {
                Class.forName("Spa");
            }
            System.out.println(i + ": sin problema");
        } catch (ClassCastException e) {
            System.out.println(i + ": A");
        } catch (RuntimeException e) {
            System.out.println(i + ": B");
        } catch (Exception e) {
            System.out.println(i + ": C");
        }
    }

    public static void main(String[] args) {
        caso(1);
        caso(2);
        caso(3);
    }
}