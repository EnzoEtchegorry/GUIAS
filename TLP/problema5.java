/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etchegorrylascanomachado;

import java.util.Scanner;

/**
 *
 * @author PC 03 GPB
 */
public class problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);      
        System.out.print("Ingresa el valor de N: ");
        int N = scanner.nextInt();    
        int suma = 0;        
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);

    }
    
}
