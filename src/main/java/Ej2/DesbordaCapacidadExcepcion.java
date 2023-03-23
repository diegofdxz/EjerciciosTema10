package Ej2;

public class DesbordaCapacidadExcepcion extends Exception {
    public DesbordaCapacidadExcepcion() {
        super("El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo.");
    }

}
