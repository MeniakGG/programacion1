/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoprestamo;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * Escriba un programa que calcule el interés simple de un préstamo. El sistema
   debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
   en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.

 * 
 * 
 * 
 */
public class CalculoPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // SCANNER HERE!!!
        Scanner sc = new Scanner (System.in);
        // VARIABLES HERE !!!
        int capitalinic = 0;
        int tasainteres = 0;
        int tiempoa = 0;
        double interesg =0;
        
        //Print y captura de datos
        System.out.println("Bienvenido a BAC Credomatic");
        System.out.println("para cacular su prestamo le brindamos el siguiente formulario:");
        System.out.println("Ingrese el monto del prestamo en Lps:");
        capitalinic = sc.nextInt();
        System.out.println("Ingrese la tasa de interes ");
        tasainteres = sc.nextInt();
        System.out.println("Ingrese el plazo en años:");
        tiempoa = sc.nextInt();
        
        //Operaciones
        interesg = (capitalinic * tasainteres * tiempoa) /100;
        
        // Print y resultados
        System.out.printf("Su prestamo por %d, con intreses de %d porciento, a un plazo de %d años",capitalinic,tasainteres,tiempoa);
        System.out.printf("\nGenera intereses al banco equivalentes a: %.2f Lps",interesg);
        System.out.println("");
    } //Fin de Main
} //Fin de Public Class
