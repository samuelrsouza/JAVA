/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

/**
 *
 * @author CC44040337883
 */
public class JavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]= new int[10];
        for (int i = 0; i<vet.length;i++){
            vet[i]=i+10;
            System.out.print(vet[i]+ "|");
        }
        System.out.println();
        
    }
    
}
