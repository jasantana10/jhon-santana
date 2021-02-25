/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class punto11
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite un numero entre 0 - 1000");
        int numero = in.nextInt();
        int unidades, decenas, centenas;
        unidades = numero%10;
        numero = numero/10;
        decenas = numero%10;
        centenas = numero/10;
        System.out.println("unidades:"+unidades);
        System.out.println("decenas:"+decenas);
        System.out.println("centenas:"+centenas);
    }
}
