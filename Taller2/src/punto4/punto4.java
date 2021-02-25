/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class punto4
{
   public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double area, longitud;
        System.out.println("Digite Radio de una Circunferencia");
        double radio = in.nextDouble();
        area = Math.PI * Math.pow(radio,2);
        longitud = 2 * Math.PI * radio;
        System.out.printf("el area es %.2f\n", area);
        System.out.printf("la longitud es %.2f\n", longitud);
        
    } 
}
