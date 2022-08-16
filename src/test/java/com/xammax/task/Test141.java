package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class Test141 {


    @Test
    void test(){

    }

    public boolean hasCycle(ListNode head) {
        if(head.next==null) return false;
        HashSet<ListNode> hashSet = new HashSet();
        hashSet.add(head);
        boolean control = true;
        while (control){
            if(head.next!=null) {
                head = head.next;
                if (!hashSet.add(head)) return true;
            }
        }

        return false;
    }

    class ListNode {
      int val;

      ListNode next;


      ListNode(int x) {
         val = x;
         next = null;
     }
    }
}
