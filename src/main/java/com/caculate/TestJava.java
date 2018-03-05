package com.caculate;

public class TestJava {

    public static int reverse(int x) {
        String origin=String.valueOf(x);
        if(x<0){
            origin=origin.substring(1,origin.length());
        }
        System.out.println(origin);
        char[] abc=origin.toCharArray();
        char[] val=new char[abc.length];
        int i=0;

        for(int y=(abc.length-1);y>-1;y--){
            val[i]=abc[y];
            System.out.println("i = "+i+"   y="+y);
            System.out.println(Character.toString(val[i]));
            i++;
        }

        String reverseStr=String.copyValueOf(val);
        if(Long.valueOf(reverseStr)>Integer.MAX_VALUE){
            return 0;
        }

        int result=Integer.parseInt(reverseStr);
        if(x<0){
            result=result*-1;
        }

        return result;
    }

    public static void main(String[] args ) {
      int result =reverse(1534236469);
      System.out.println(result);
    }

}
