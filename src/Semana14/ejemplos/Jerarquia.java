package Semana14.ejemplos;

public class Jerarquia {
    static void cadena(Class<?> c) {
        String s = c.getSimpleName();
        Class<?> p = c.getSuperclass();
        while (p != null) {
            s += " -> " + p.getSimpleName();
            p = p.getSuperclass();
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        cadena(ArithmeticException.class);
        cadena(NumberFormatException.class);
        cadena(ClassNotFoundException.class);
        cadena(InterruptedException.class);
        cadena(StackOverflowError.class);
        cadena(ArrayIndexOutOfBoundsException.class);
        cadena(NullPointerException.class);
        cadena(ClassCastException.class);
        cadena(java.io.FileNotFoundException.class);
        cadena(OutOfMemoryError.class);
    }
}