package com.caculate.leednode;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        int len=nums1.length>nums2.length?nums1.length:nums2.length;
        int[] resultTemp=new int[len];
        int z=0;
        boolean isZero=false;
        for(int x=0;x<nums2.length;x++){
            for(int y=0;y<nums1.length;y++){
                if(nums2[x]==nums1[y]){
                    if(nums2[x]==0 && !isZero){
                        isZero=true;
                        resultTemp[z]=nums2[x];
                        z++;
                        break;
                    }
                    boolean rep=false;
                    for(int repeat :resultTemp){
                        if(nums2[x]==repeat){
                            rep=true;
                        }
                    }
                    if(rep){
                        break;
                    }


                    resultTemp[z]=nums2[x];
                    z++;
                    break;
                }

            }
        }
        int[] result=new int[z];
        for(int x=0;x<z;x++){
            result[x]=resultTemp[x];
        }
        return result;
    }


    public static void main(String[] args){
        Intersection intersection=new Intersection();
        int[] nums1=new int[]{1,2,3,4,6,3,9,3};
        int[] nums2=new int[]{2,4,4,6,6,3,1,7,8};
        int[] result=intersection.intersection(nums1,nums2);
        for(int y=0;y<result.length;y++){
            System.out.println(result[y]);
        }
    }
}
