package com.caculate.leednode;

public class JewlesInStones {

    public int numJewelsInStones(String J, String S) {

        char[] jArray= J.toCharArray();
        char[] sArray=S.toCharArray();
        int i=0;

        for(char ch:jArray){
            String charStr=String.valueOf(ch);
            for(char chStone:sArray){
                String charStone=String.valueOf(chStone);
                if(charStr.equals(charStone)){
                    i++;
                }
            }
        }


        return i;
    }
}
