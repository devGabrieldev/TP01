/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex13;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
 */
public class TP01Ex13 {
  public static void main (String args[]){ 
Scanner scan= new Scanner(System.in);
System.out.println("Digite a velocidade inicial (m/s): ");
double vi= scan.nextDouble();
System.out.println("Digite a aceleração (m/s2): ");
double a= scan.nextDouble();
System.out.println("Digite o tempo de percurso (s): ");
double t = scan.nextDouble();
double vf_ms = vi+(a*t);
double vf_km = (vf_ms * 3.6);
System.out.println("A velocidade final do automóvel é: " + vf_km + " km/h");
scan.close();
  } 
}
