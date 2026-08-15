/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kevin.estrada
 * * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
     * 
     * 1 comprender el problema que se está abordando
     *  a que datos de entrada necesito
     *  b transpormación/calculos necesarios
     *  c Que resultados se presentan?
     * 
     * 2 Visualizacion / diseño de la solucion
     *  a diagrama flujo
     *  b pseudocodigo
     * 
     * 3 programacion incremental
     *  a listado de tareas a cumplir
     *      i Declarancion de variables
     *      ii Estructuras de seleccion
     *      iii Ciclo de repeticion
     *      iV Validaciones de datos
     * 
     * 4 Prueba de escritorio
     *  a casos
     *  b escenarios
     *  c resultados / Patrones
     * 
     * Entradas:
     *  Nombre de Usaurio
     *  Numero de Lecturas
     *  Ingreso de tempraturas (Random)
     * 
     * Calculos / Transformaciones
     *  Formula de Celsius a Farenheit
     *  Definicion de sobrecalentamiento
     *  Validacion Lecturas (0 > lectura menor 50)
     *  Contabilizar el numeto de calentamiento
     *  Promediar el monitoreo
     *  - Validacion Temperatura
     * 
     * Salida
     *  Resumen estadistico
     *  Alerta de Sobrecalentamiento
     * 
     * Tareas
     * 1 Capturar el nombre del usuario
     *  a Definicion de librería/ Instancia
     *  b Declaracion de Variable para el usuario
     * 2 Captura de Numero de lecturas
     *  a Declaracion de Variable para numero de lectura
     * 3 Generacion de temperatura
     *  A definicion de librería RANDOM
     *  b Declaracion de Variable
     *  c Mostrar el numero Generado Temporalmente
     *  d rango de temp 200 - 400
     * 4 Formula: F = (C * 9/5) + 32
     * 5 Limite de sobrecalentamiento 350C (662 F)
     * 6 Validacion de lecturas (Do While) Entre 0 y 50
     * 7 Sumar los numero de Sobrecalentaminto
     * 8 Calcular el promedio
     * 9 Mostrar el resumen
     *   - Promedio
     *   - Numero de sobrecalentamientos
 */
public class SistemaMonitoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner y Random HERE 
        Scanner sc = new Scanner (System.in);
        Random rd = new Random ();
        
        // Variables aqui
        String nomusuario = "mm";
        int lecturas = 0;
        int temperaturas = 0;
        int ciclo = 0;
        double TempF = 0;
        double TempC = 0;
        int SobrecanL =0;
        double acumTem = 0;
        double promedio = 0;
                
        // Print y captura de datos
        System.out.print("Nombre de operario: ");
        nomusuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura %s\n", nomusuario);
        
        do{
        System.out.print("Numero de Lectura: ");
        lecturas = sc.nextInt();
        System.out.printf("Validacion Captura: %d\n", lecturas);
        if (lecturas <0 || lecturas > 50){
            System.out.println("Valor no Valido");
        }
        }while(lecturas < 0 || lecturas > 50);
        
        
        //TempC = rd.nextDouble();
        TempC = rd.nextDouble(200,500);
        //TempC = (Math.random()*400)-200 + 200;
        System.out.printf("Validacion Random %.2f\n", TempC);
        
        // While Here
        while (ciclo < lecturas){
             TempC = rd.nextDouble(200,500);
             TempF = (TempC*9/5) + 32;
        //TempC = (Math.random()*400)-200 + 200;
            System.out.printf("Num Lec: %d\ttemp C: %.2f\n",ciclo+1,TempC);
            System.out.printf("Temp F: %.2f\n", TempF);
            ciclo ++;
            if (TempF>662){
                System.out.println("Alerta!!! Sobrecalentamiento");
                SobrecanL++;
            }else
                acumTem += TempF;
            
        } //Fin While
        promedio = acumTem / lecturas;
        System.out.println("------------------------------------");
        System.out.println("          RESUMEN                   ");
        System.out.printf("Promedio de TEMP: %.2f\n", promedio);
        System.out.printf("# sobrecalentamientos: %d\n",SobrecanL);

    } // Fin Main
} // Fin Public Class
