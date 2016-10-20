/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p8;
import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        double s;
        double h;
        double p;
        //Proceso
        s = pedir("Cateto opuesto");
        h = pedir("Cateto adyacente");
        p = calcular (s,h);
        mostrar(p);
    }
    public static double pedir(String b){
        double a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+b+" del empleado");
        a = teclado.nextDouble();
        return a;
    }
    public static double calcular (double s, double h){
        double p;
        double h2;
        double s2;
        double p2;
        //se saca el cuadrado de los catetos
        h2 = Math.pow(h,2);
        s2 = Math.pow(s,2);
        //se hace la suma y posteriormente se le saca raiz
        p2 = s2 + h2;
        p = Math.pow(p2,0.5);
        return p;
    }
    public static void mostrar (double p){
        System.out.println("El cateto del triangulo sera "+p);
    }
}