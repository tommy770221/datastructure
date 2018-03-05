package com.caculate.leednode;

public class MaxProfit {

    public static int maxProfit(int k, int[] prices) {

        int[] profit=new int[prices.length];
        int x=0;
        int result=0;
        for(int i=0;i<prices.length-1;i++){
            if((prices[i+1]-prices[i])<=0){
                profit[x]=result;
                x++;
                result=0;
                System.out.println( "x = "+x);
            }else{
                result=result+prices[i+1]-prices[i];
                profit[x]=result;
            }
        }

        if((x-1)<k){
            for(int y=0;y<x;y++){
                result=result+profit[y];
                System.out.println( "result = "+result);
            }
        }else{
            for(int z=0;z<x;z++){
                for(int r=0;r<z;r++){
                    int temp=0;
                    if(profit[z]>profit[r]){
                        temp=profit[z];
                        profit[z]=profit[r];
                        profit[r]=temp;
                    }
                }
            }

            for(int y=0;y<k;y++){
                result=result+profit[y];
            }


        }

      return result;
    }

    public static void main(String[] args){
        int[] array=new int[]{1,5,3};
        System.out.print(maxProfit(2,array));
    }
}
