/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

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
        
        
        
    }
    
}
