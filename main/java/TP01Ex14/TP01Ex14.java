/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex14;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
 */
public class TP01Ex14 {
    public static void main (String args[]){ 
Scanner scan= new Scanner(System.in);
System.out.println("Digite o raio da esfera: ");
double raio= scan.nextDouble();
System.out.println("Digite a aresta do cubo: ");
double aresta= scan.nextDouble();
double pi = Math.PI;
double vol_esf = ((4.0/3.0*pi) * Math.pow(raio,3));
double vol_quad = Math.pow(aresta, 3);
double vol_liv= (vol_quad - vol_esf);
System.out.println("O volume livre do ambiente com uma esfera circunscrita em um cubo é: " + vol_liv + " m³");
scan.close();
}
}    
