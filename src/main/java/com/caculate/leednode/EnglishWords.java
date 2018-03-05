package com.caculate.leednode;

public class EnglishWords {

    public String numberToWords(int num) {
        int numStr=0;
        int[] numbers=new int[]{0,0,0,0};

        String result="";
        String bill= "";
        String mill="";
        String thousand="";

        if(num==0){
            return "Zero";
        }

        do{

            numbers[numStr]=num%1000;
            numStr++;
            num=(num/1000);

        }while (numStr<4);



        if(numbers[3]!=0){
            result=exceedNumToEnglish(numbers[3]) +" Billion";
        }

        if(numbers[2]!=0){
            result=result+exceedNumToEnglish(numbers[2]) +" Million";
        }
        if(numbers[1]!=0){
            result=result+exceedNumToEnglish(numbers[1]) +" Thousand";
        }
        if(numbers[0]!=0){
            result=result+exceedNumToEnglish(numbers[0]);
        }

        return  result.trim();




    }


    public static String numToEnglish(int num){
        switch (num){
            case 1:
                return " One";
            case 2:
                return " Two";
            case 3:
                return " Three";
            case 4:
                return " Four";
            case 5:
                return " Five";
            case 6:
                return " Six";
            case 7:
                return " Seven";
            case 8:
                return " Eight";
            case 9:
                return " Nine";
            case 10:
                return " Ten";
            case 11:
                return " Eleven";
            case 12:
                return " Twelve";
            case 13:
                return " Thirteen";
            case 14:
                return " Fourteen";
            case 15:
                return " Fifteen";
            case 16:
                return " Sixteen";
            case 17:
                return " Seventeen";
            case 18:
                return " Eighteen";
            case 19:
                return " Nineteen";
        }

        return "";

    }

    public static String exceedNumToEnglish(int num){
        if(num>=20 && num<30){
            return " Twenty"+numToEnglish(num%10);
        }else if(num>=30 && num<40){
            return " Thirty"+numToEnglish(num%10);
        }else if(num>=40 && num<50){
            return " Forty"+numToEnglish(num%10);
        }else if(num>=50 && num<60){
            return " Fifty"+numToEnglish(num%10);
        }else if(num>=60 && num<70){
            return " Sixty"+numToEnglish(num%10);
        }else if(num>=70 && num<80){
            return " Seventy"+numToEnglish(num%10);
        }else if(num>=80 && num<90){
            return " Eighty"+numToEnglish(num%10);
        }else if(num>=90 && num<100){
            return " Ninety"+numToEnglish(num%10);
        }else if(num>=100){
            return numToEnglish(num/100)+" Hundred"+exceedNumToEnglish(num%100);
        }else{
            return numToEnglish(num);
        }

    }
}
