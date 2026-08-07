/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author kevin.estrada
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     * 
     * 1. Cálculo con dos variables Escribir un programa que solicite al usuario
     * la base y la altura de un rectángulo. Utilice estas dos variables para 
     * calcular el área del rectángulo (Base X Altura) y el perímetro (suma de todos sus lados).
     * Imprimir ambos resultados en pantalla.
     */
    
    public static void main(String[] args) {
        // SCANNER HERE!!!
        Scanner sc = new Scanner (System.in);
        // VARIABLES HERE !!!
        int basetri = 0;
        int alttri  = 0;
        double  areatri = 0;
        double perimetro = 0;
        double hipotenusa = 0;
        
        //Print y captura de datos
        System.out.println("Bienvenido");
        System.out.println("A continuación ingrese la Base del triangulo:");
        basetri = sc.nextInt();
        System.out.println("A continuación ingrese la Altura del triangulo:");
        alttri = sc.nextInt();
        
        //Operaciones aquí:
        areatri = (basetri * alttri) / 2;  // Calculo de área
        hipotenusa = Math.hypot(basetri, alttri); //Calculo Hipotenusa
        perimetro = basetri + alttri + hipotenusa; //Calculo Perimetro
        
        //resultados
        System.out.printf("Datos del triangulo: Altura: %d  Base: %d Hipotenusa: %.2f",alttri,basetri,hipotenusa);
        System.out.printf("\nArea: %.2f",areatri);
        System.out.printf("\nPerimetro: %.2f",perimetro);
        System.out.println("");
    }//Fin Main
}// Fin Public Class
