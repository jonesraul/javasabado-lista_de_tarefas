/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2_atividade3;

import java.util.Scanner;

/**
 *
 * @author Aluno05
 */
public class Lista2_atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("digite uma mensagem:::");
        a=read.nextLine();
        Usuario.mostraValor(a);
    }
    
}
