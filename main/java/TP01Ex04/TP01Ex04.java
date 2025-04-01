/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex04;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.    
 */
public class TP01Ex04 { 

    public static void main(String args[]){
  Scanner scan= new Scanner(System.in);
  System.out.println("Digite a base do triangulo: ");
double base= scan.nextDouble();
System.out.println("Digite a altrua do triangulo: ");
double alt= scan.nextDouble();
double area = (base * alt)/2;
System.out.println("A area do triangulo é : " + area);
}
}

