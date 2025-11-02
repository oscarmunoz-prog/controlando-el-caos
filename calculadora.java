public class Calculadora {
    public static void main(String[] args) {
        System.out.println("=== Calculadora Básica ===");
        int a = 10;
        int b = 5;
        double numero = 16; // Para calcular raíces

        // Operaciones básicas
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        
        // Raíces cuadradas
        System.out.println("Raíz cuadrada de " + numero + ": " + Math.sqrt(numero));
        System.out.println("Raíz cuadrada de " + a + ": " + Math.sqrt(a));
        
        // Raíz cúbica
        System.out.println("Raíz cúbica de " + numero + ": " + Math.cbrt(numero));
        
        // Raíz n-ésima (usando potencias)
        double n = 4; // índice de la raíz
        System.out.println("Raíz " + n + " de " + numero + ": " + Math.pow(numero, 1/n));
    }
}
