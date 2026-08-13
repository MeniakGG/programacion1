/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprovaciondemateria;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * 
 * Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las 
 * calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el 
 * promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el 
 * estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado". 
 * Requisito estricto: Solo puedes usar una estructura if/else simple. 
 * 
 */
public class AprovacionDeMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner Here
        Scanner SC = new Scanner (System.in);
        // Variables
        String NomAlumno = "mm";
        double notauno = 0;
        double notados = 0;
        double notaprom = 0; 
        
        // Entrada captura de datos
        System.out.println("Matematicas");
        System.out.println("Profesor acontinuacion ingrese las todas del alumno en ambos parciales");
        System.out.print("Primer parcial: ");
        notauno = SC.nextDouble();
        System.out.print("\nSegundo Parcial: ");
        notados = SC.nextDouble();
        
        // Calculos
        notaprom = (notauno + notados) / 2;
        
        // Print y resultados
        
        if (notaprom >=65){
            System.out.println("");
            System.out.printf("El promedio es: %.2f", notaprom);
            System.out.println("El alumno esta APROVADO");
        }else{
            System.out.println("");
            System.out.printf("El promedio es: %.2f", notaprom);
            System.out.println("El alumno esta REPROVADO");
        } // Fin IF
        
        
    } // Fin de Main
    
} // Fin de Publicc Class
