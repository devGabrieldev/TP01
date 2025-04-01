/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex12;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 */
public class TP01Ex12 {
    public static void main (String args[]){
Scanner scan= new Scanner(System.in);
System.out.println("Digite a altura do cone: ");
double alt= scan.nextDouble();
System.out.println("Digite o raio do cone: ");
double raio= scan.nextDouble();
double pi = Math.PI;
double vol = (pi*Math.pow(raio, 2)*alt)/3;
System.out.println("O volume do cone é: " + vol);
scan.close();    
}
}
