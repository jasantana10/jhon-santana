/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class punto3
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double suma1, promedio,producto1, cociente, modulo;
        System.out.println("Digite Primer Numero");
        double n1 = in.nextDouble();
        System.out.println("Digite Segundo Numero");
        double n2 = in.nextDouble();
        System.out.println("Digite Tercer Numero");
        double n3 = in.nextDouble();
        suma1 = n1 + n2 + n3;
        promedio = n1 + n2 + n3 / 3;
        producto1 = n1 * n2 * n3;
        cociente = n1 / n2 / n3;
        modulo = n1 % n2 % n3;
        System.out.printf("la suma es %.2f\n", suma1);
        System.out.printf("el promedio es %.2f\n", promedio);
        System.out.printf("el produto es %.2f\n", producto1);
        System.out.printf("el cociente es %.2f\n", cociente);
        System.out.printf("el modulo es %.2f\n", modulo);
    }
}
