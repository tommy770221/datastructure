package com.caculate.leednode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp=new ListNode(0);
        ListNode temp2=new ListNode(0);

        temp.val=l1.val+l2.val;
        temp2.next=temp;

        while(l1.next!=null){

            l1=l1.next;
            l2=l2.next;
            ListNode next=new ListNode(l1.val+l2.val);
            ListNode nextTemp=temp;
            while(nextTemp.next!=null){
                nextTemp=nextTemp.next;
                nextTemp.next=next;
            }
            temp.next=next;

        }



        return null;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}