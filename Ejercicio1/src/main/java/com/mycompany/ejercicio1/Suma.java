/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Artyom
 */

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
public class Suma {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        
        int num1 = input.nextInt();

        System.out.print("Introduce el segundo número: ");
       
        int num2 = input.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        
    }
}
