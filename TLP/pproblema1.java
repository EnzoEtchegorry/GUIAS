/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etchegorrylascanomachado;

/**
 *
 * @author PC 03 GPB
 */
public class pproblema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectángulo:");
        int base = scanner.nextInt();
        
        System.out.println("Ingrese la altura del rectángulo:");
        int altura = scanner.nextInt();
        
        int area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }   
}
