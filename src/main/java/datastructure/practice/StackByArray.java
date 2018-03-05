package datastructure.practice;

public class StackByArray {

    private int[] stack;
    private int top;

    public StackByArray(int stack_size){
        stack=new int[stack_size];
        top=-1;
    }

    public boolean push(int data){
        if(top>=stack.length){
            System.out.println("堆疊已滿,無法再加入");
            return false;
        }else{
            stack[++top]=data;
            return true;
        }
    }

    public boolean empty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    public int pop(){
        if(empty()){
            return -1;
        }else{
            return stack[top--];
        }
    }

}
