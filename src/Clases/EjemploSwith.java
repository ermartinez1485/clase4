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
public class EjemploSwith {

    public static void main(String[] args) {

        int numero = 0;
        String menu = "";
        Scanner teclado = new Scanner(System.in);

        //do {
            System.out.println("Digite Numero, exit para salir");
            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Mes Enero");
                    break;
                case 2:
                    System.out.println("Mes febrero");
                    break;
                case 3:

                    System.out.println("Mes marzo");
                    break;
                case 4:
                    System.out.println("Mes abril");
                    break;
                case 5:
                    System.out.println("Mes mayo");
                    break;
                case 6:
                    System.out.println("Mes junio");
                    break;
                case 7:
                    System.out.println("Mes julio");
                    break;
                case 8:
                    System.out.println("Mes agosto");
                    break;
                case 9:
                    System.out.println("Mes setiembre");
                    break;
                case 10:
                    System.out.println("Mes octubre");
                    break;
                case 11:
                    System.out.println("Mes noviembre");
                    break;
                case 12:
                    System.out.println("Mes diciembre");
                    break;

                default:
                    System.out.println("el numero no coresponde a ningun mes");

            }

        //} while (menu != "exit");

    }

}
