package com.caculate.leednode;

public class HamerDistance {

    public static int hammingDistance(int x, int y) {
        int abc=x^y;
        int j=0;
        while(abc>1){
            j=j+abc%2;
            abc=abc/2;
        }
        return j;
    }


    public static void main(String[] args){
       int abc=hammingDistance(5,6);

    }
}
