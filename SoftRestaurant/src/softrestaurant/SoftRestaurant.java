/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softrestaurant;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * 1. Conocer las diferentes tipos de ciclos de repeticion.
 * 2. Anlizar los componentes de todo ciclo de repeticion.
 * 3. Contruir un algoritmo con un ciclo de repeticion.
 * 
 * Desarrollar un algoritmo que simule la cuenta de un restaurante que se tiene que pagar entre un grupo de amigos (7)
 * dividido en partes iguales.
 * 
 * Ciclos de repeticion
 *  1. While
 *  2. Do - While
 *  3. For
 *  //Valido para otros lenguajes
 *  4. Foreach
 * 
 * Componentes de ciclos de repeticion
 *  1. Variable de control -> Valor de inicio 
 *  2. Condicion           -> Limite de repeticion
 *      Todo ciclo de repetición se ejecuta y repite siempre y cuando la condición se mantenga verdadera.
 *  3. Modificador de la variable de control
 * 
 * 
 *      //Opcion 1
        //numeropersona +=1; //Incrementa de 1 en 1 la cuenta de la variable de control.
        //Opción 2
        //numeropersona++; Incrementounitacio (post Incremento)
 */
public class SoftRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SCANNER HERE!!!
        Scanner sc = new Scanner (System.in);
        // VARIABLES HERE !!!
        double promediopago = 0;
        int Gastoindividual = 0;
        int numeropersona = 1;
        int gastoacumulado = 0;
        
        while (numeropersona<=7){ //Variable de control compara con el limite
        System.out.printf("(Persona %d). Cuanto consumiste: ",numeropersona);
        Gastoindividual = sc.nextInt();
        System.out.println("");
        numeropersona++; //Estructura para incrementar el contador +1
        gastoacumulado += Gastoindividual; // Ojo al +=
        System.out.printf("P: %d\tGasto Individual: %d\tGasto Acumulado: %d ", numeropersona,Gastoindividual,gastoacumulado);
        System.out.println("");

        } //Fin de While
        numeropersona--; //Post Decremento de -1
        promediopago = gastoacumulado / numeropersona;
        System.out.printf("\nTotal Personas: %d", numeropersona);
        System.out.println("");
        System.out.printf("\nEl promedio por persona es: %.2f", promediopago);
        System.out.println("");
    } // Fin de Main
    
} //Fin Public Class
