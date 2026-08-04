/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 */
public class TiempoRelax {

    /**
     * @param args the command line arguments
     * 
     * Objetivos
     * 1 Selección Multiple
     *      Estructuras
     *      Tipoes de Condición
     * 2 Formateo de Strings (PrintF)
     */
    public static void main(String[] args) {
       /** Desarrollar algoritmo que me permita escoger un pais a visitar
        * Posterior a ello, debemos nosotros escoger las posibles ciudades
        * a recorrer, sin embargo, solo se puede una cuidad.
        */
    
        // SCANNER HERE!!!
        Scanner sc = new Scanner (System.in);
        // VARIABLES HERE !!!
        int smenu = 0;
        char ssubmenu = 'm';
        
        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n","Taniha's Travel","Buen Viaje");
        System.out.println("------------------------------------");
        System.out.println("1.Japon ");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta:");
        smenu = sc.nextInt();
        
        //Switch (Evaluación por casos
        switch (smenu){
            case 1:
                System.out.println("Bienvenido a Japon");
                System.out.println(":D");
                System.out.println("---------------------");
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                sc.nextLine(); // Limpieza de Bufer
                ssubmenu = sc.nextLine().toUpperCase().charAt(0);
                switch (ssubmenu){
                    case 'A':
                        System.out.println("Super nintendo World Tour");
                        break;
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                    case 'C':
                        System.out.println("Pabellon Dorado y japoneses :D");
                        break;
                    default:
                        System.out.println("Sección Random para ver japonesas");
                        System.out.println("Para los casos no definidos");
                        System.out.println("se le asignara la llave de un Gundam :D");
                        break;
                }
                break; // Fin Caso 1
            case 2:
                System.out.println("Bienvenue en France");
                System.out.println(":D");
                System.out.println("---------------------");
                System.out.println("1. Paris ");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.print("Respuesta:");
                sc.nextLine();
                ssubmenu = sc.nextLine().charAt(0);
                // Swich a continuacion.....
                    switch (ssubmenu){
                        case '1':
                            System.out.println("Torre Eiffel");
                            break;
                        case '2':
                            System.out.println("Palacio de Marsella");
                            break;
                        case '3':
                            System.out.println("El estadio");
                            break;
                        default:
                            System.out.println("Se le asignara un tour con Remy y Anton Ego :D");
                            break;
                    }
                
                
                break; // Fin Caso 2
            case 3:
                System.out.println("Welcome to New Zealand.");
                System.out.println(":D");
                System.out.println("---------------------");
                System.out.println("A. Sky Tower ");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford Sound");
                System.out.print("Respuesta:");
                sc.nextLine();
                ssubmenu = sc.nextLine().toUpperCase().charAt(0);
                // Aquí se viene un IF
            if(ssubmenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[36m","\u001B[0m");
                    
                }else if(ssubmenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(ssubmenu =='C'){
                    System.out.printf("%s Mildford Sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
                break; // Fin Caso 3
                
                /**
                 * Resetear estilo: \u001B[0m
                    Negro: \u001B[30m
                    Rojo: \u001B[31m
                    Verde: \u001B[32m
                    Amarillo: \u001B[33m
                    Azul: \u001B[34m
                    Morado: \u001B[35m
                    Cian: \u001B[36m
                    Blanco: \u001B[37m
                 */
                        
            case 4:
                System.out.println("Bienvenue au Canada");
                System.out.println(":D");
                System.out.println("---------------------");
                System.out.println("A. ");
                System.out.println("B. ");
                System.out.println("C. ");
                break; // Fin Caso 4
           
        }// Fin Switch
        
        
        
    } // Final de MAIN
    
} // Final Public Class
