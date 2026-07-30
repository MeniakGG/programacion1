/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleciondevehiculo;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * Decisiones!!!!!!
 * Estructuras de selección
 *      -Palabras clave (IF , Else)
 *      -Bloques
 *      -Terminaciones
 *      -Condiciones
 * Tipos de selección
 *      -simple
 *      -doble
 * Condiciones  
 *      -Tipos de Condiciones
 *         - > mayor
 *         - < Menor
 *         - >= Mayor o Igual
 *         - >= menor o Igual
 *         - == Igual (Dos signos seguidos)
 *      -Tipos de Comparaciones
 */
public class SelecionDeVehiculo {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita determinar los siguientes elementos:
     *  -Si el tamaño del tanque de combustible agarra más de 30 litros (dato numerico)
     *  -El tipo de combustible si es o no Diesel (dato)
     *  -Si es energeticamente eficiente y renobable su combustible (cadena)
     */
    public static void main(String[] args) {
        //SCANNER HERE!!!
        Scanner entrada = new Scanner (System.in);
        // VARIABLES!!!!!
        int cantidadlitros = 0;
        char respuestatipo = 'a';
        String respuestacadena;
        
        //EJ 1
        System.out.println("Me dijeron que eres dueño de un vehiculo \"Verde\"");
        System.out.println("Tienes que echarle biodisel");
        System.out.println("Cuantos litros agarra?");
        cantidadlitros = entrada.nextInt ();
        if(cantidadlitros>30){   //Desicion HEREE!!!!!!!
            // Condicion VERDADERO
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta!!!");
    }    //Fin IF
        
        // EJ 2
        System.out.println("");
        entrada.nextLine(); //Limpiar el Buffer De Numerico a Caracter es necesrio limpiar el Buffer
        System.out.println("Tu Vehiculo es Diesel Verde? (x = Si, y = No)");
        respuestatipo = entrada.nextLine().charAt(0); // El numero en el CharAt infica el caracter a tomar en la respuesta
        
       if (respuestatipo == 'x')
        { // Condición si es verdadero
           System.out.println("Si es diesel verde!!");
           System.out.println("Diesel combinado con Ethanol");
           System.out.println("Se saca del maiz");
        } // Fin If
       else
        {   // Condición si es falso
            System.out.println("!!Uyy... eres anticlimatico");
            System.out.println("Calentamiento Global!!!");
        } // Fin Else
            
    
    
    } //Main fin  
    }//Public class fin
    

