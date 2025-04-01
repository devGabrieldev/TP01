/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex15;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
 */
public class TP01Ex15 {
  public static void main (String args[]){
Scanner scan= new Scanner(System.in);
System.out.println("Digite a cotação do dólar: ");
double cot= scan.nextDouble();
System.out.println("Digite a quantia em dólares: ");
double valor= scan.nextDouble();
double valor_real = cot * valor;
System.out.println("O valor em reais é: R$" + valor_real);
scan.close();
}
}
