
public class calculadora {
	    public static void main(String[] args) {
	        System.out.println("=== Calculadora Básica ===");
	        int a = 10;
	        int b = 5;
	 
	        System.out.println("Suma: " + (a + b));
	        System.out.println("Resta: " + (a - b));
	        System.out.println("Multiplicación: " + (a * b));
	        System.out.println("División: " + (a / b));

        System . out . println ( "Suma: " + ( a + b ));
        System . out . println ( "Resta: " + ( a - b ));
        System . out . println ( "Multiplicación: " + ( a * b ));
        System . out . println ( "División: " + ( a / b ));

        System . out . println ( "Potencia " + a + "^" + b + ": " + potencia ( a , b )); 
         System.out.println ( "Cuadrado de " + a + ": " + cuadrado(a));
        System.out.println ( " Cubo de " + b + " : " + cubo ( b ) ) ; 
    }

     
      public static double  potencia  ( int base  , int exponente  ) {
        return  Math.pow ( base , exponente ) ;
    }

    public  static  int  cuadrado ( int  numero ) { 
         return  numero * numero ;
    }

    public  static  int  cubo ( int  numero ) {
        return  numero * numero * numero ;
	    }
	}


