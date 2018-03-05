package datastructure.practice;


import sun.invoke.empty.Empty;

class Node{

    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

}

public class StackByLink {

    public Node front;
    public Node rear;

    public boolean isEmpty(){
        return front ==null;
    }

    public void output_of_Stack(){
        Node current=front;
        while(current!=null){
            System.out.println("["+current.data+"]");
            current=current.next;
        }
        System.out.println();
    }

    public void insert(int data){
        Node newNode=new Node(data);
        if(this.isEmpty()){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;

        }

    }

    public void pop(){
        Node newNode;
        if(this.isEmpty()){
            System.out.println("目前為空堆疊");
            return ;
        }
        newNode=front;
        if(newNode==rear){
            {
                front=null;
                rear=null;
                System.out.println("目前為空堆疊");
            }
        }
        else{
            while (newNode.next!=rear){
                newNode=newNode.next;
                newNode.next=rear.next;
                rear=newNode;
            }
        }
    }

}
