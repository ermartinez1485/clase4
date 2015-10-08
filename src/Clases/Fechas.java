/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Estudiante
 */
public class Fechas {
    
    public static void main(String[] args) {
        
        Date fecha = new Date();
        System.out.println(fecha);
        
        Calendar cal = Calendar.getInstance();
        
        //pasarle la fecha al calendario
        cal.setTime(fecha);
                
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, 3-1);
        cal.set(Calendar.YEAR, 2015);
        cal.set(Calendar.HOUR, 17);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
                
        fecha = cal.getTime();
        
        System.out.println("La fecha es " + fecha);
        
    }
    
}
