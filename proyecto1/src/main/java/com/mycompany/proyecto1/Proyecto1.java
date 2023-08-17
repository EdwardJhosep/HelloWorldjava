/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;
//importamos java.scanner
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Proyecto1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
System.out.println("Hello World!");
        
        int p = 0;
        int a = 0;
        int b = 0;
        int rs =0;
        //agregamos un menu en donde vamos a elegir la suma o resta 
        System.out.println("que operacion deseas realizar");
        System.out.println("1...suma");
        System.out.println("2...resta");
        System.out.println("digite el numero a realizar");
        
        p = reader.nextInt();
        
        
        //pedimos los numeros 
        System.out.println("ingrese el primer numero");
        a = reader.nextInt();
        System.out.println("ingresa el segundo numero");
        b = reader.nextInt();
        
    }
}
