/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Artyom
 */

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de Grados Centígrados: ");
        
        int celcius = leer.nextInt();
        
        double fahr = 32 + (9 * celcius / 5);
        
        System.out.println("Los [" + celcius + "] Grados Celcius equivalen a: [" + fahr + "] Grados Fahrenheit");
    }
}
