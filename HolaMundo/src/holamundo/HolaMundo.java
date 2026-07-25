/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Set;

/**
 *
 * @author kevin.estrada
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
            //Contarios de una sola linea
        /*
        Para comentar un bloque de comentarios.
        */      
    public static void main(String[] args) {
        // TODO code application logic here
        /* 1 Imprimir en pantalla
                a. Salidas formateadas
                b. Caracteres de Escape
           2 Captura de tados
        */
        System.out.println("Hola mi nombre es Kevin");
        System.out.println("Este es mi primer programa");
        System.out.println("Programaaaaa");
        //SOUT + TAB atajo de teclado
        //LN para salto de linea en el Print
        //Print sin LN
        System.out.print("Vamos camino ");
        System.out.print("a la clase");
        System.out.print(" de Progra");
        System.out.println("");
        System.out.printf("Tu apellido es %S", "Estrada");
        System.out.println("");
        System.out.printf("%S Tu apellido es", "Estrada");
        System.out.println("");
        System.out.printf("Tu apellido %S es", "Estrada");
        System.out.println("");
        System.out.printf("Tu apellido %S es", "Estrada");
        System.out.printf("Hola \n este es \n un nuevo \n amanecer");
        System.out.printf("Hola \t este es \t un nuevo \t amanecer");
        System.out.println("");
        //Variables
        int edad; //Tipo Entero
        double peso; //decimal
        char inicial; //Tipo Caracter Letras, digitos, cáracteres especiales.
        String nombre; //Cadena
        boolean estado; //Tipo Estado True or False
        
        edad = 21;
        peso = 60.5;
        nombre = "Kevin";
        inicial = 'K'; //alt 39 la comilla sola '
        
        System.out.printf("Tengo %d anios \n", edad);
        System.out.printf("Mi peso ideal es %f \n", peso);
        System.out.printf("Dime %c por mi inicial", inicial);
        System.out.printf("%s es mi nombre", nombre);
        
        
        
    
       
    }// Fin de Main
    
}
