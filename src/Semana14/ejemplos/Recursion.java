package Semana14.ejemplos;

public class Recursion {
    static int contar(int n) {
        return contar(n + 1);
    }

    public static void main(String[] args) {
        try {
            contar(0);
        } catch (StackOverflowError e) {
            System.out.println("Error grave: " + e.getClass().getSimpleName());
            System.out.println("Este Error se atrapo solo como demostracion");
        }
    }
}