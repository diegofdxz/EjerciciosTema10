package Ej1;/*
Ejercicios
1. El cálculo de la raíz cuadrada
Sea la función raizCuadrada() que calcula la raíz cuadrada del número que se pasa como argumento. Esta función lanza una excepción si su argumento es negativo. No se le pide que escriba esta función, se asume que ya existe.

Escribir un algoritmo que calcule la raíz cuadrada de un número introducido por el usuario.

Visualización y entrada (ejecución normal):

Introducir un valor: 25

√25 = 5



Visualización y entrada (ejecución no normal):

Introducir un valor: -3

La raíz cuadrada no está definida para un número negativo.


 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej1 {
    int num;

    public void raizCuadrada(int num){
        System.out.println("√" + num + " = " + Math.sqrt(num));
    }
    public void Menu() throws InputMismatchException {
        while (true) {
            System.out.println("1. Calcular raíz cuadrada");
            System.out.println("2. Salir");
            System.out.println("Introduzca una opción: ");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Introducir un valor: ");
                    try {
                        num = sc.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Introduzca un número entero");
                        break;
                    }


                    try{
                        raizCuadrada(num);
                    }catch(IllegalArgumentException e){
                        System.out.println("La raíz cuadrada no está definida para un número negativo.");
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }


    }
    public static void main(String[] args) {
        Ej1 e = new Ej1();
        e.Menu();
    }

}
