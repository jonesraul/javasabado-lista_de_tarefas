/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg5;

import java.util.Scanner;

/**
 *
 * @author Aluno05
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        // TODO code application logic here
         Scanner read = new Scanner(System.in);
       System.out.println("-------------------------------");        
        System.out.println("prezado senhor Usuario,\n voce esta preste a participar das \n operaçoes matematicas ");      
        System.out.println("-------------------------------"); 
        System.out.println("digite o primeiro numero::");  
         x= read.nextInt();
         System.out.println("digite o segundo numero::");
         y= read.nextInt();
        System.out.println("a soma dos dois numerpo é::"+soma(x,y));   
        System.out.println("a subtração dos dois é::"+sub(x,y)); 
        System.out.println("a multiplicação:::"+mult(x,y));
        System.out.println("filnamente a divisão::"+div(x,y));
    }      
   static int soma(int a,int b){
       
       return (a+b);
   } 
   
    static int sub(int a,int b){
            return (a-b);
   } 
     static int mult(int a,int b){
       return (a*b);
   } 
      static  float div(int a,int b){
       return (a/b);  
   } 
}
