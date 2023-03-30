/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 * @author Artyom
 */

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        
        String nombre = leer.next();
        
        System.out.println("Hola " + nombre + ", !Bienvenido a NetBeans!");        
        
    }
}
