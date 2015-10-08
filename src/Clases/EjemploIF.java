/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Eric Martinez
 */
public class EjemploIF {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");//sout
        numero1 = teclado.nextInt();

        System.out.println("Digite el primer numero: ");//sout
        numero2 = teclado.nextInt();

        System.out.println("La suma de los numeros es: " + (numero1 + numero2)); // parentesis para que sume las variables
        System.out.println("La resta de los numeros es: " + (numero1 - numero2)); // parentesis para que sume las variables
        System.out.println("La multiplicacion de los numeros es: " + (numero1 * numero2)); // parentesis para que sume las variables
        System.out.println("La division de los numeros es: " + (numero1 / numero2)); // parentesis para que sume las variables
        System.out.println("La mod de los numeros es: " + (numero1 % numero2)); // parentesis para que sume las variables

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);

        } else {
            if (numero1 == numero2) {

                System.out.println(numero2 + " es igual que " + numero1);
            } else {
                System.out.println(numero2 + " es mayor que " + numero1);
            }
        }
        
        

    }
}
