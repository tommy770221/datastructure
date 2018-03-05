package datastructure.practice;

public class CH04_06 {

    static int TRUE=1, FALSE=0, EIGHT=8;
    static int[] queen=new int[EIGHT];
    static int number=0;

    CH04_06(){
        number=0;
    }

    public static void PressEnter(){
        char tChar;
        System.out.println("\n\n");
        System.out.println("...按下Enter鍵繼續...");
        try{
            tChar=(char)System.in.read();
        }catch (Exception e){
             e.printStackTrace();
        }
    }

    public static void decide_position(int value){
        int i=0;
        while(i<EIGHT){
            //是否受到攻擊的判斷式
              if(attack(i,value)!=1){

                  queen[value]=i;
                  if(value==7)
                      print_table();
                  else
                      decide_position(value+1);
              }
              i++;

        }
    }

    public static int attack(int row,int col){
        int i=0,atk=FALSE;
        int offset_row=0,offset_col=0;

        while((atk!=1) && i<col){
           offset_col=Math.abs(i-col);
           offset_row=Math.abs(queen[i]-row);
           if((queen[i] ==row)||(offset_row== offset_col)){
               atk=TRUE;
           }
           i++;
        }
        return atk;
    }

    public static void print_table(){
        int x=0,y=0;
        number+=1;
        System.out.print("\n");
        System.out.print("八皇后問題的第"+number+" 組解\n\t");
        for ( x=0; x<EIGHT;x++){
            for(y=0; y<EIGHT;y++){
                if(x==queen[y])
                    System.out.print("<*>");
                else
                    System.out.print("<->");

            }
            System.out.print("\n\t");
        }
        PressEnter();
    }

    public static void main(String args[]){
        CH04_06.decide_position(0);
    }

}
