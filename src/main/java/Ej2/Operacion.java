package Ej2;

public class Operacion {
    public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a + b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
             throw new DesbordaCapacidadExcepcion();
        }
     return (int) resultado;
    }
    public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a - b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }
    public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a * b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }
    public static int dividir(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a / b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }
    public static int dividirConResto(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a % b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

}
