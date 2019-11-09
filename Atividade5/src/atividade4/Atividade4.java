/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

import java.util.Scanner;

/**
 *
 * @author Aluno05
 */
public class Atividade4 {
    //public String valor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
// TODO code application logic here
        System.out.println("------------------------------------");
        System.out.println("por favor senhor Usuario digite o valor para ser amazenado na variavel:");
        String valor;
        valor = retornoScanner();
        System.out.println("o seu valor digitado é::"+valor);
    }
    
    static String retornoScanner(){
           String a="";
           Scanner read =new Scanner(System.in);
           a=read.nextLine();
           return a;
    }
}
