/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex02;
import java.util.Scanner;
/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado. 
 */
public class TP01Ex02{
 public static void main(String args[]){ {

Scanner scan= new Scanner(System.in); 
System.out.println("Digite a aresta do quadrado: ");
double aresta= scan.nextDouble();
double area = Math.pow(aresta, 2);
System.out.println("A area do quadrado é : " + area);
}
}
}