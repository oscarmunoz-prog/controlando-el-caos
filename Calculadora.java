import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan_l = new Scanner(System.in);
        Scanner scan_n = new Scanner(System.in);
        String operacion;
        int numero1, numero2;
        double resultado;
        String continuar = "";

        while (!continuar.equals("n")) {
            System.out.println("Operaciones disponibles: ");
            System.out.println("suma \"+\"");
            System.out.println("resta \"-\"");
            System.out.println("Yepa \"*\"");
            System.out.println("dividir \"/\"");
            System.out.println("potencia \"^\"");
            System.out.println("porcentaje \"%\"");
            System.out.println("raíz cuadrada \"sqrt\"");
            System.out.println("raíz n-ésima \"root\"");
            System.out.println("También se pueden usar raíces con los comandos 'sqrt' y 'root'");
            System.out.println("salir \"exit\"");

            System.out.println("Que operacion quieres?");
            operacion = scan_l.nextLine();

            if (!operacion.equals("exit")) {
                if (operacion.equals("sqrt")) {
                    System.out.println("Ingresa el número para calcular la raíz cuadrada:");
                    numero1 = scan_n.nextInt();
                    
                    if (numero1 >= 0) {
                        resultado = Math.sqrt(numero1);
                        System.out.println("La raíz cuadrada de " + numero1 + " es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
                    }
                    
                } else if (operacion.equals("root")) {
                    System.out.println("Ingresa el índice de la raíz (ej: 2 para raíz cuadrada, 3 para cúbica):");
                    numero1 = scan_n.nextInt();
                    System.out.println("Ingresa el radicando (número al que se le calculará la raíz):");
                    numero2 = scan_n.nextInt();
                    
                    if (numero1 == 0) {
                        System.out.println("Error: El índice no puede ser cero");
                    } else if (numero2 < 0 && numero1 % 2 == 0) {
                        System.out.println("Error: No se puede calcular raíz par de un número negativo");
                    } else {
                        resultado = Math.pow(numero2, 1.0 / numero1);
                        System.out.println("La raíz " + numero1 + "-ésima de " + numero2 + " es: " + resultado);
                    }
                    
                } else {
                    System.out.println("Que numeros quieres?");
                    numero1 = scan_n.nextInt();
                    numero2 = scan_n.nextInt();

                    if (operacion.equals("+")) {
                        resultado = numero1 + numero2;
                        System.out.println("El resultado de la suma es: " + resultado);
                    } else if (operacion.equals("-")) {
                        resultado = numero1 - numero2;
                        System.out.println("El resultado de la resta es: " + resultado);
                    } else if (operacion.equals("*")) {
                        resultado = numero1 * numero2;
                        System.out.println("El resultado de la multiplicación es: " + resultado);
                    } else if (operacion.equals("/")) {
                        if (numero2 != 0) {
                            resultado = (double) numero1 / numero2;
                            System.out.println("El resultado de la división es: " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir por cero");
                        }
                    } else if (operacion.equals("^")) {
                        resultado = Math.pow(numero1, numero2);
                        System.out.println("El resultado de la potencia es: " + resultado);
                    } else if (operacion.equals("%")) {
                        resultado = (double) numero1 * numero2 / 100;
                        System.out.println(numero1 + "% de " + numero2 + " = " + resultado);
                    }
                }
            }

            System.out.println("¿Quieres continuar? (s/n)");
            continuar = scan_l.nextLine();
        }

        scan_l.close();
        scan_n.close();
    }
}