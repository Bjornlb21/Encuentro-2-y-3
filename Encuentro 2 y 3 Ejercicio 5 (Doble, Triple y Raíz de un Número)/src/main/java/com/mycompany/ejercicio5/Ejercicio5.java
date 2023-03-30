/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Artyom
 */

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un Número Entero:");
        
        int num = leer.nextInt();
        
        int doble = num * 2;
        
        int triple = num * 3;
        
        double raiz = Math.sqrt(num);
        
        System.out.println("El Doble de [" + num + "] es: [" + doble + "], el Triple: [" + triple + "] y la Raíz Cuadrada: [" + raiz + "]" );
    }
}
