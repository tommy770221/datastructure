package com.caculate.leednode;

/**
 * Created by Tommy on 2018/7/26.
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
          char[] chrArr=str.toCharArray();
          for(int i=0;i<chrArr.length;i++){
             if(((int) chrArr[i])<=92 && ((int) chrArr[i])>=65){
                 chrArr[i]=(char) ((int) chrArr[i] + 32);
             }
          }
          String result=String.valueOf(chrArr);
          return result;

    }
    public static void main(String[] args) {

    }
}
