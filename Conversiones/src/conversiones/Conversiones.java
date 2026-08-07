/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner; //importa librería para utilizar Scanner

/**
 *
 * @author kevin.estrada
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    /**Conversiones:
    * Pulgadas a centimetros
    * Kilometros a Millas
    * Grados Farenheit a grados Celsius
 **/  
    
    
    public static void main(String[] args) {
        //Variables de los 3 ejercicios.
        //E1
        int pulgadas = 0;
        double resultadocm = 0;
        //E2
        double farenheit = 0;
        double celsius = 0;
        //E3
        double kilometros = 0; 
        double millas = 0;
        Scanner teclado = new Scanner (System.in);
       
    /**En Java, la expresión %.2f es un especificador de formato 
    * que se usa para mostrar números decimales (float o double)
    * limitados a exactamente dos decimales y aplicando redondeo
    * automático. Se emplea principalmente dentro de métodos como
    * System.out.printf() o String.format().
    **/
         
        //Ejercicio 1
        pulgadas = 10; // Los datos van de derecha a izquierda.
        resultadocm = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm", pulgadas, resultadocm);
        pulgadas = 35;
        resultadocm = pulgadas * 2.54;
        System.out.printf("\n %d pulgadas es igual a %.2f cm", pulgadas, resultadocm);
        System.out.println("");

        //Ejercicio 2
        System.out.println("");
        System.out.println("Cuantos Kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble(); //Captura de datos en teclado.
        millas = kilometros /1.6; //Operacion matematica
        System.out.printf("\n %.2f km es igual a %.2f millas", kilometros,millas);
        System.out.println("");
        System.out.printf(kilometros + " Km es igual a " + millas + " millas");
        System.out.println("");;
            
        // Ejercicio 3
        System.out.printf("\n Ingrese la temperatura en farenheit?");
        farenheit = teclado.nextDouble(); //Captura de datos en teclado.
        celsius =  (farenheit -32) * 5/9; //Operacion matematica
        System.out.printf("%.2f Farenheit equivale a %.2f grados celsius",farenheit,celsius);
        System.out.println("");
        System.out.println("");
    }
}
