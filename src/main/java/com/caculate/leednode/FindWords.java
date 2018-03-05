package com.caculate.leednode;

import java.util.List;

public class FindWords {

    public List<String> findWords(char[][] board, String[] words) {

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                for(String word:words){
                    
                }

            }
        }




        return null;


    }

    public static void main(String args[]){
        char[][] abc=new char[][]{{'a','b','f'},{'c','d'}};

        System.out.println(abc.length);
        System.out.println(abc[0].length);

        for(int i=0;i<abc.length;i++){
            for(int j=0;j<abc[i].length;j++){
                System.out.println(abc[i][j]);
            }
        }
    }
}
