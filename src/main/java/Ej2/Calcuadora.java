package Ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcuadora {
    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int resultado = 0;
        String operador = "";
        boolean salir = false;
        boolean numeroposibleA = false;
        while(numeroposibleA == false){
            System.out.println("Introducir un número entero:");
            try {
                a = Integer.parseInt(sc.nextLine());
                numeroposibleA = true;
            }catch (NumberFormatException e){
                System.out.println("El número introducido no es válido. Inténtelo de nuevo.");
            }
        }

        System.out.println("Introducir un operador (+ - * / % o s para salir):");
        try {
            operador = sc.nextLine();
        }catch (InputMismatchException e){
            System.out.println("El operador introducido no es válido. Inténtelo de nuevo.");
        }
        boolean numeroposibleB = false;
        while (numeroposibleB == false){
            System.out.println("Introducir un número entero:");
            try {
                b = Integer.parseInt(sc.nextLine());
                numeroposibleB = true;
            }catch (NumberFormatException e){
                System.out.println("El número introducido no es válido. Inténtelo de nuevo.");
            }
        }

        switch (operador){
            case "+":
                try {
                    resultado = Operacion.sumar(a, b);
                }catch (DesbordaCapacidadExcepcion e){
                    System.out.println("El resultado desborda las capacidades de esta calculadora");
                }
                break;
            case "-":
                try {
                    resultado = Operacion.restar(a, b);
                }catch (DesbordaCapacidadExcepcion e){
                    System.out.println("El resultado desborda las capacidades de esta calculadora");
                }
                break;
            case "*":
                try {
                    resultado = Operacion.multiplicar(a, b);
                }catch (DesbordaCapacidadExcepcion e){
                    System.out.println("El resultado desborda las capacidades de esta calculadora");
                }
                break;
            case "/":
                try {
                    resultado = Operacion.dividir(a, b);
                }catch (DesbordaCapacidadExcepcion e){
                    System.out.println("El resultado desborda las capacidades de esta calculadora");
                }
                break;
            case "%":
                try {
                    resultado = Operacion.dividirConResto(a, b);
                }catch (DesbordaCapacidadExcepcion e){
                    System.out.println("El resultado desborda las capacidades de esta calculadora");
                }
                break;
            case "s":
                salir = true;
                break;
            default:
                System.out.println("El operador introducido no es válido. Inténtelo de nuevo.");
                break;
        }

    }


}
