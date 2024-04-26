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
public class problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int intentoUsuario;      
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número aleatorio del 1 al 100. ¡Adivina cuál es!");
        do {
            System.out.print("Introduce tu intento: ");
            intentoUsuario = scanner.nextInt();
            intentos++;
            if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número que has introducido es menor que el número aleatorio.");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("El número que has introducido es mayor que el número aleatorio.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (intentoUsuario != numeroAleatorio);

        
    }
    
}
