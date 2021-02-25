/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9;

/**
 *
 * @author lenovo
 */
public class punto9
{
    public static void main(String[] args) 
    {
        int Diasviaje = 4, Kilomxdia = 50, ValorlitroG = 15000;
        int ValorestacD = 5000, Valorpeajexdia = 7500, Cantidadlitros = 7;
        double Promediokilom;
        int Totalviaje, temp;
        System.out.printf("Dias de viaje:%d  \n", Diasviaje);
        System.out.printf("Kilometros por dia: %dKm\n", Kilomxdia);
        System.out.printf("Valor del litro de gasolina: $%d\n", ValorlitroG);
        Promediokilom = Kilomxdia / Cantidadlitros;
        System.out.printf("Promedio de kilometro por litro de gasolina: %.2fKm\n", Promediokilom);
        System.out.printf("Valor estacionamineto por dia: %d\n", ValorestacD);
        System.out.printf("Valor peaje por dia: %d\n", Valorpeajexdia);
        temp = Kilomxdia * Diasviaje;
        Totalviaje = temp / (int)Promediokilom * ValorlitroG + (ValorestacD*Diasviaje)+(Valorpeajexdia*Diasviaje);
        System.out.printf("Costo total del viaje es: %d\n\n", Totalviaje);
    }
}
