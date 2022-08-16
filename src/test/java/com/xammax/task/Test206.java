package com.xammax.task;

import org.assertj.core.error.ShouldEndWith;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Test206 {

    @Test
    void test(){
        ListNode attr1 = new ListNode(5);
        ListNode attr2 = new ListNode(4,attr1);
        ListNode attr3 = new ListNode(3,attr2);
        ListNode attr4 = new ListNode(2,attr3);
        ListNode attr5 = new ListNode(1,attr4);
        ListNode res = result(new ListNode());
        System.out.println(res);
    }

    private ListNode result(ListNode head){
        if(head!=null && head.next==null)return head;
        ListNode res = head;
        ArrayList<Integer> mmm = new ArrayList<>();
        do{
            mmm.add(res.val);
            res = res.next;
        }while (res!=null);

        ListNode listNode = null;
        for(Integer i: mmm){
            listNode = new ListNode(i,listNode);
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
