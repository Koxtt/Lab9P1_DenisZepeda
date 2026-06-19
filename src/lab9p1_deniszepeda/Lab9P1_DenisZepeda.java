/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_deniszepeda;

import java.util.Scanner;

/**
 *
 * @author MARY
 */
public class Lab9P1_DenisZepeda {

    /**
     * @param args the command line arguments
     */
    public static Scanner entry = new Scanner (System.in);
    public static void main(String[] args) {  
        menu();
    }//fin main
    
    public static void menu(){
        System.out.println("--- MENU PRINCPIAL ---");
        System.out.println("1. Factorial");
        System.out.println("2. Decimal a Binario a Hexadecimal");
        System.out.println("3. Contador de Ceros");
        System.out.println("4. Salir");
        System.out.println(" ");
        System.out.println("Elige una opcion");
        int opc=entry.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Ejercicio 1");
                menu();
                break;
            case 2:
                System.out.println("Ejercicio 2");
                menu();
                break;
            case 3:
                System.out.println("Ejercicio 3");
                menu();
                break;
            case 4:
                System.out.println("Saliendo del Codigo");
                break;
            default:
                System.out.println("Error, ingrese un numero que este dentro del rango ");
                break;
        }
    }
    
}
