/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * Objetivos
 * 1. Implementar ciclo de repeticion FOR
 * 2. Uso de CONSTANTES
 * 
 * Elementos de una estructura de repeticion
 * Variable de control
 * Condicion
 * Modificador
 * 
 * 
 * 
 * 
 */
public class CicloRepeticionFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i<10; i++){
            System.out.printf("Valor; %d\n", i);
        }
        //segundo ejemplo 
        System.out.println("");
        System.out.println("Segundo ciclo For");
        for (int i = 2; i<10; i +=2){
            System.out.printf("Valor; %d\n", i);
        }
        
        //Ejercicio 
        //Variables
        Scanner sc = new Scanner (System.in);
        final int TOTAL = 10;
        int nomVarones = 0;
        int numMujeres = 0;
        char seleccion = 'a';
        double porcentaje = 0;
        
        for(int i = 0; i < TOTAL; i++){
            System.out.println("Quien viene x minuta");
            System.out.println("V Varon | M Mujer");
            System.out.println("Respuesta:");
            seleccion = sc.next().toUpperCase().charAt(0);
            switch (seleccion){
               case 'V':
                    System.out.println("Varon comiendo minutas");
                    nomVarones++;
               break;
               case 'M':
                   System.out.println("Mujer comindo minuta");
                   numMujeres++;
               break;
               default:
                   System.out.println("Seleccion no valida");
               break;
            }    
    }
        System.out.println("Porcentaje de Varones\n");
        porcentaje = nomVarones / TOTAL;
        System.out.printf("Porcentaje %.2f\n",porcentaje);
        
        System.out.println("Porcentaje de Mujeres\n");
        porcentaje = numMujeres / TOTAL;
        System.out.printf("Porcentaje %.2f\n",porcentaje);
    }
    
}
