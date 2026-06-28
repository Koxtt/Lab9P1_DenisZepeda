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
    public static String acumHexadecimal= "";
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
                System.out.println("Factorial");
                
                System.out.println("Ingrese un valor para calcular su factorial: ");
                int numero = entry.nextInt();
                while (numero<=0||numero>12) {                    
                    System.out.println("Ingrese un numero valido dentro del rango de [0-12]");
                    numero=entry.nextInt();
                }
                System.out.println("Numero: "+factorial(numero));
                menu();
                break;

            case 2:
                System.out.println("Ejercicio 2");
                System.out.println("Decimal a Binario a Hexadecimal");
                decimalHex();
                menu();
                break;
            case 3:
                System.out.println("Ejercicio 3");
                System.out.println("Contador de Ceros");                   
                System.out.println("Ingrese los numero binarios al codigo que desea contar");
                int num = entry.nextInt();
                System.out.println("Numero: "+contadorceros(num));
                menu();
                break;

            case 4:
                System.out.println("Saliendo del Codigo");
                break;
            default:
                System.out.println("Error, ingrese un numero que este dentro del rango ");
                break;
        }//fin switch 
        
    }//fin de menu 
    
    public static int factorial (int numero){
        if (numero ==1 ||numero==0) {
            return 1;
        }else{
            return numero * factorial(numero-1);
        }
    }
    
    public static void decimalHex(){
        System.out.println("Ingrese un numero decimal");
        int num= entry.nextInt();
        acumHexadecimal="";
        String resultado = convertirAHexadecimal(num);
        System.out.println("Numero decimal "+ num + "converido a hexadecimal "+ resultado);
        
    }
    
    public static String convertirAHexadecimal(int num){
        if (num==0) {
            if (acumHexadecimal.isEmpty()) {
                return "0";
            }
            return acumHexadecimal;
        }else{
            int numerodecimal = 1;
            int residuo = numerodecimal%16;
            char residuoHex;
            if (residuo>=10) {
                residuoHex = (char) ('A' + (residuo-10));
            }else{
                residuoHex = (char) ('0' + (residuo));
            }
            acumHexadecimal = residuoHex+acumHexadecimal;
            
            return convertirAHexadecimal(numerodecimal/16);
        }
        
    }

    public static int contadorceros(int num){
        if (num==0) {
            return 0;
        }
        if (num%10==1) {
            return 1+contadorceros(num/10);
        }
        
        return contadorceros(num/10);
    }
    
    
    
    
        
    
}
