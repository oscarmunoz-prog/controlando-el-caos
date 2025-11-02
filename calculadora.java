public class Calculadora {
    public static void main(String[] args) {
        System.out.println("=== Calculadora Mejorada ===");
        int a = 10;
        int b = 5;
        
        // Operaciones básicas
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        
        // Potencias añadidas como ordenó
        System.out.println("Potencia " + a + "^" + b + ": " + potencia(a, b));
        System.out.println("Cuadrado de " + a + ": " + cuadrado(a));
        System.out.println("Cubo de " + b + ": " + cubo(b));
    }
    
    // Método para calcular cualquier potencia
    public static double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
    
    // Método específico para cuadrado
    public static int cuadrado(int numero) {
        return numero * numero;
    }
    
    // Método específico para cubo
    public static int cubo(int numero) {
        return numero * numero * numero;
    }
}
