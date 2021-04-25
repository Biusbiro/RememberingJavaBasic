/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bismarck
 */
public class JavaBasicMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("O que deseja fazer?");
        System.out.println("1: Imprimir matriz");
        System.out.println("2: Dividir");
        System.out.println("3: Metodos da Math");
        System.out.println("4: Arredondamento");
        System.out.println("5: Imprimir vetor");
        var option = scan.nextInt();
        var result = 0f;
        switch(option){
            case 1 -> PrintMatrix();
            case 2 -> Divider();
            case 3 -> UsingMath();
            case 4 -> Rounders();
            case 5 -> PrintVector();
        }
    }
    
    static void PrintMatrix(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho da matriz");
        var size = scan.nextInt();
        for (int i = 0 ; i <= size ; i++){
            for (int j = 0 ; j <= size ; j++){
                System.out.print("○");
            }
            System.out.print("\n");
        }
    }
    
    static void Divider(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        var n1 = scan.nextDouble();
        System.out.println("Digite o numero 2:");
        var n2 = scan.nextDouble();
        
        var total = n1 / n2;
        var res = n1 % n2;
        System.out.format("O Resultado é: %.2f", total);
        System.out.format("O resto da divisão é: %.2f", res);
    }
    
    static void UsingMath(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        var num = scan.nextFloat();
        System.out.println("O que deseja fazer?");
        System.out.println("1: raiz quadrada");
        System.out.println("2: raiz cubica");
        System.out.println("3: eponenciação");
        var option = scan.nextInt();
        var result = 0f;
        switch(option){
            case 1 -> result = (float) Math.sqrt(num);
            case 2 -> result = (float) Math.cbrt(num);
            case 3 -> {
                System.out.println("digite o valor?");
                var value = scan.nextFloat();
                result = (float) Math.pow(num, value);
            }
        }
        System.out.format("O resultado é: " + (option == 3 ? "%.0f" : "%.2f"), result);
    }
    
    static void Rounders(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero para arredondar:");
        var num = scan.nextFloat();
        
        System.out.println("Como arredondar?");
        System.out.println("1: para cima");
        System.out.println("2: para baixo");
        System.out.println("3: mais próximo");
        var option = scan.nextInt();
        float result = 0f;
        switch(option){
            case 1 -> result = (float) Math.ceil(num);
            case 2 -> result = (float) Math.floor(num);
            case 3 -> result =  Math.round(num);
        }
        System.out.format("O resultado é %.2f", result);
    }
    
    static void PrintVector(){
        int values[] = {8, 9, 4, 6, 3, 1, 2, 7, 5, 0};
        Arrays.sort(values);
        for(int value: values){
            System.out.println(value);
        }
    }
}
