package main.java101.Arrays;

public class ForEach {
    public static void main(String[] args) {
      int[][] matris = {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9},
              {10, 11, 12},
        };

      for(int[] row:matris){
          for(int col:row){
              System.out.print(col+ " ");
          }
          System.out.println();
      }
        /*
      for(int i=0; i<matris.length; i++){
          for(int k=0; k<matris[i].length; k++){
              System.out.print(matris[i][k]+ " ");
          }
          System.out.println();


      }

         */


    }
}
