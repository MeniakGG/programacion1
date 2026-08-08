/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generartoken;

import java.util.Random;
import java.util.Scanner;




/**
 *
 * @author kevin.estrada
 */
public class Generartoken {
Random RD = new Random();
    /**
     * @param args the command line arguments
     * * Objetivos 
 *   1. Utilizar el ciclo de repeticion DO - WHILE
 *   2. Uso de Nuevas Librerias
 *      a. Random
 *    3. Uso de Otras Funciones de String
 *     Desarrollar un algoritmo que me permita registrar
     * un dispositivo y generar un token para su sesion
     * de validacion mientras se esta navegando con dicho dispositivo.
     * 
     * Contexto del problema:
       Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
        
       Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
     */

    public static void main(String[] args) {
        // SCANNER HERE!!!
        Scanner sc = new Scanner (System.in);
        // Random Aqui
        Random RD = new Random();
        // Variables
        String nombreequip = "mm";
        boolean longitudcorrecta = true;
        boolean prefijocorrecto = true;
        boolean validacioncorrecta = true;
        int tipocaracter = 0;
        int numerotoken = 0;
        char letratoken = 'a';
        String token = "S";
        int valor = RD.nextInt();
        
        //Print y recolección de dato
        do{ // El Do While es un ciclo que sirve para estructuras de validación, ejecula la sección del DO, aunque sea una sola vez.
        System.out.println("Vamos a registrar un equipo");
        System.out.println("Por favor ingrese el nombre del equipo");
        nombreequip = sc.nextLine().toUpperCase(); // Captura de datos!
        
        // Operaciones aquí
        longitudcorrecta = nombreequip.length()==8; //COmparacion, operacion ternaria, devuelve un true o false!!!
        prefijocorrecto = nombreequip.startsWith("RT") || nombreequip.startsWith("SW");
        validacioncorrecta = longitudcorrecta && prefijocorrecto;
        
        }while(!validacioncorrecta);
        // Print Resultado
        System.out.println("Registro Correcto");
        
        while(token.length()<12){
            tipocaracter = RD.nextInt(2);
            if (tipocaracter == 0){
                numerotoken = RD.nextInt(10);
                token = token + numerotoken;
            }
            else{
                letratoken = (char)(RD.nextInt(26)+65);
                token = token + letratoken;
            }
        }
        System.out.printf("Token es : %s\n",token);
    } // Fin de main
}// Fin de Public Class
