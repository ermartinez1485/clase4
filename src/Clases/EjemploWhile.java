/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class EjemploWhile {
    
    public static void main(String[] args) {
        
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite los numeros que quiere imprimir");
        numero = teclado.nextInt();
        int inicio=0;
        /*
        while (inicio < numero) {
            System.out.println(inicio);
            inicio++;           
        }
                */
        
        //dowhile
        
        /*do {
            
           System.out.println(inicio);
           
        } while (inicio < numero);
        
        */
        
        for (int i = 0; i < numero; i++) {
            System.out.println(i);
     
        }
        
        
    }
    
}
