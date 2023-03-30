/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 * @author Artyom
 */
/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una Frase");
        
        String frase = leer.next();
        
        System.out.println("En Mayúscula: " + frase.toUpperCase());
        
        System.out.println("En Minúscula: " + frase.toLowerCase());
    }
}
