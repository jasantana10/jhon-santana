/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class punto2
{
    public static void main(String[] args) 
    {
        int suma, producto, diferencia;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite Primer Numero");
        int numb1 = in.nextInt();
        System.out.println("Digite Segundo Numero");
        int numb2 = in.nextInt();
        suma = numb1 + numb2;
        producto = numb1 * numb2;
        diferencia = numb1 - numb2;
        System.out.printf("la suma es %d\n", suma);
        System.out.printf("el produto es %d\n", producto);
        System.out.printf("la diferencia es %d\n", diferencia);
    }
}
