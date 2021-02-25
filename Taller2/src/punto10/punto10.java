/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class punto10
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double gramos, libras, toneladas;
        System.out.println("Digite peso del objeto en kilogramos");
        double peso1 = in.nextDouble();
        gramos = (peso1 * 1000) / 1; 
        System.out.printf("peso en gramos; %.2fg\n", gramos);
        libras = (gramos * 1) / 500;
        System.out.printf("peso en libras; %.2fLb\n", libras);
        toneladas = (peso1 * 1) / 1000;
        System.out.printf("peso en toneladas; %.2fTn\n\n", toneladas);
    }
}
