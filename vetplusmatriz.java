/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

/**
 *
 * @author samuelrsouza
 */
public class vetplusmatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]= new int[10];
        for (int i = 0; i<vet.length;i++){
            vet[i]=i+10;
            System.out.println(vet[i]);
        }
        
        
   
        int mat[][]=new int[4][4];
        for(int i=0; i<mat.length; i++){
           for(int j=0; j<mat[0].length;j++){
            mat[i][j]=i*j;
            System.out.print(mat[i][j]+"|");
        }
            System.out.println();
        }
    }
    
}
