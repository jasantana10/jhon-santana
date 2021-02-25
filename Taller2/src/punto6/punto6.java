/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

/**
 *
 * @author lenovo
 */
public class punto6
{
    public static void main(String[] args) 
    {
        System.out.println("INDICE DE MASA CORPORAL BMI\n");
        double peso = 68, altura = 1.65, indice;
        indice = peso / Math.pow(altura, 2);
        System.out.printf("el indice de masa corporal es %.2f\n\n", indice);
    }
}
