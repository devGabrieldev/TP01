/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex18;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
   valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
   que deverá ser devolvido.
 */
public class TP01Ex18 {
    public static void main(String args []){
 Scanner scan= new Scanner(System.in);
System.out.println("Digite o valor do primeiro produto: ");
double v1= scan.nextDouble();
System.out.println("Digite o valor do segundo produto: ");
double v2= scan.nextDouble();
System.out.println("Digite o valor do terceiro produto: ");
double v3= scan.nextDouble();
System.out.println("Digite o valor do quarto produto: ");
double v4= scan.nextDouble();
System.out.println("Digite o valor do quinto produto: ");
double v5= scan.nextDouble();
double valor_total = (v1+v2+v3+v4+v5);
System.out.println("O valor total é de: " + valor_total);
System.out.println("Digite o valor pago: ");
double valor_pago= scan.nextDouble();
double troco = valor_pago - valor_total; 
if (troco < 0) {
            System.out.println("Valor insuficiente! Faltam R$ " + (-troco));
        } else {
            System.out.println("O troco a ser devolvido é: R$ " + troco);
        }
scan.close();
}
}
  
