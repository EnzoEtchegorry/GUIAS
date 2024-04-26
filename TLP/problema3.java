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
public class problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}
    
    

