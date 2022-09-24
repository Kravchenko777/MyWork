package com.xammax.task;

import java.util.ArrayList;

public class Test203 {


    public ListNode removeElements(ListNode head, int val) {
        ListNode listNode =  new ListNode();
        ArrayList<Integer> integers = new ArrayList<>();
        boolean flas = true;
        ListNode kkk = head;
        while (flas){
            if(kkk.val!=val) integers.add(kkk.val);
            if(kkk.next==null) flas = false;
            else kkk = kkk.next;
        }

        for(int i = integers.size()-1; i>=0;i--){
            if(i!=0)listNode = new ListNode(integers.get(i),listNode);
            else listNode = new ListNode(integers.get(i),listNode);
        }


        return listNode;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
