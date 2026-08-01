/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacionsangre;

import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 */
/**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     * OPERADORES BOOLEANAS
     * 
     * AND && (y)
     *  V   V = V
     *  F   V = F
     *  V   F = F
     *  F   F = F
     * 
     * OR  || (O)
     *  V   V = V
     *  F   V = F
     *  V   F = F
     *  F   F = F
     * 
     * NOT ! (NEGACION)
     *  V = F
     *  F = V
     * 
     */
public class Donacionsangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SCANEER HERE!!!
        Scanner entrada = new Scanner (System.in);
        // VARIABLES!!!!
        int edad = 0;
        double pesolibras = 0;
        char desayuno = 'a';
        int niveles = 0;
        String genero = "MM";
        //Print en pantalla
        System.out.println("Bienvendido a la Cruz Roja");
        System.out.println("Sistema de control de donación de sangre");
        System.out.println("Por favor, acontinuación ingresa tu edad");
        edad  = entrada.nextInt ();
        entrada.nextLine(); //Limpiar el Buffer De Numerico a Caracter es necesrio limpiar el Buffer
        System.out.println("Ingrese su peso");
        pesolibras = entrada.nextDouble();
         
        // Decision here!
        if (edad>=18 && edad<=65 && pesolibras>=110){
            System.out.println("Si se puede donar");
            System.out.println("Ya desayunó? SI (s)  NO (n)");
            entrada.nextLine(); //Limpiar el Buffer De Numerico a Caracter es necesrio limpiar el Buffer
            desayuno = entrada.nextLine().charAt (0);
                if (desayuno == 's' || desayuno == 'S' ){    // Comienzo de IF aninado
                System.out.println("Perfecto");
                System.out.println("Ahora necesito validar tu genero, eres hombre o mujer?");
                genero = entrada.nextLine().toLowerCase();
                System.out.printf("Ingresa ahora tus niveles de Hemoglobina:");
                niveles = entrada.nextInt();
                    // Tercer IF ANIDADO
                    if ((genero.equals("hombre") && niveles>=14) || (genero.equals("mujer") && niveles>=12))
                    {
                    System.out.println("Perfecto, todo esta listo para donar.");
                    }
                    else
                    {
                    System.out.println("No podrás donar por que tu nivel de hemoglobina está muy bajo.");
                    }
                }
                else // ELSE aninada
                {
                System.out.println("No podra donar hasta que vaya a comer algo!");
                }// Fin IF aninado
                } 
        else
        {
        System.out.println("No se puede donar");
        } // Fin IF
    }// Fin Main
}//Fin public Class
