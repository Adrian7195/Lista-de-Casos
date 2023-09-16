public class Main {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        
        if (y != 0) {
            System.out.println("División: " + ((double) x / y)); 
        } else {
            System.out.println("División por cero no es posible.");
        }
        
        System.out.println("Multiplicación: " + (x * y));
    }
}
