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
public class problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        int suma = 0;
        for (int i = 1, numero = 2; i <= N; i++, numero += 2) {
            suma += numero;
        }
        System.out.println("La suma de los primeros " + N + " números pares es: " + suma);
    }
}
    
    

