package com.caculate.leednode;

import java.lang.reflect.Array;

/**
 * Created by Tommy on 2018/7/26.
 */
public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] A) {
               for(int x=0;x<A.length;x++){
                   int length=A[x].length;
                   int[] array=new int[A[x].length];
                   for (int y=0;y<A[x].length;y++){
                       array[y]=A[x][length-y-1];
                   }
                   A[x]=array;
               }

               for(int x=0;x<A.length;x++){
                   for(int y=0;y<A.length;y++){
                       A[x][y]=A[x][y]^1;
                   }
               }

               return A;
    }

    public static void main(String[] args) {
          int[][] intArray=flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});


    }
}
