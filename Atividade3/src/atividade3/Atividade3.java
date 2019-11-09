/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author Aluno05
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read= new Scanner(System.in);
          System.out.println("Por favor senhor Usuario, digite alguma coisa para o sistema imprimir::");
      
           String leitura=read.nextLine();
           printlnString(leitura);
           
    }
    
    static void printlnString(String a){
        
        System.out.println(a);
        
    }
}
