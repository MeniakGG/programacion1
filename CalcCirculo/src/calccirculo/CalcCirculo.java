/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calccirculo;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * Desarrolle un programa que pida al usuario el radio de un círculo.
    Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
    el área y circunferencia de dicho círculo y muestre el resultado al usuario.

 * 
 */
public class CalcCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner HERE!!!!!
        Scanner sc = new Scanner(System.in);
        //VARIABLES !!!!!!
        int radiocir = 0;
        double areacir = 0;
        double circunfec = 0;
        
        //Print & Captura de datos:
        System.out.println("Bienvenido");
        System.out.println("A continuacion ingrese el Radio del circulo: ");
        radiocir = sc.nextInt();
        
        //Operaciones aquí:
        areacir = Math.PI * Math.pow(radiocir, 2); // Calculo del área
        circunfec = 2 * Math.PI * radiocir; // Calculo de Circunferencia
        
        //Print Resultados
        System.out.printf("El área del circulo es: %.2f",areacir);
        System.out.printf("La Circunferencia es: %.2f:",circunfec);
        System.out.println("");
    }//Fin Main
}//Fin Public Class
