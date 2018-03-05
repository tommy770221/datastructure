package com.caculate.leednode;

public class JudgeCircle {

    public boolean judgeCircle(String moves) {

        char[] strArr=moves.toCharArray();

        int i=0;

        for(char str:strArr){

            switch (str){
                case 'D':
                    i=i+1;
                case 'U':
                    i=i-1;
                case 'L':
                    i=i+2;
                case 'R':
                    i=i-2;
            }
            System.out.println(str);
        }

        if(i==0){
            return true;
        }


        return false;
    }
}
