package arraysifood;

/*
 * Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0-9
 */

import java.util.Random;

 public class Ex4_ArrayMultidimensional {
    public static void main(String[] args){
        Random random = new Random;

        int[][] M = new int[4][4];

        for(int i = 0 ; i < M.lenght ; i++){
            for(int j = 0; j< M[i].lenght; j++){
                M[i][j] = random.nextInt(bound: 9);
            }
        }
        
        System.out.prinln("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha ){
                System.out.println(coluna + " ");
            }
            System.out.println();
        }

    }
}