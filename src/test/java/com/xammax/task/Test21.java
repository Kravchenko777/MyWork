package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test21 {

    @Test
    void test(){

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        TreeSet<Integer> treeSet = new TreeSet<>();
        boolean flas=true;
        ListNode kkk = list1;
        while (flas){
            treeSet.add(kkk.val);
            if(kkk.next==null) flas = false;
            else kkk = kkk.next;
        }
        flas = true;
        kkk = list2;
        while (flas){
            treeSet.add(kkk.val);
            if(kkk.next==null) flas = false;
            else kkk = kkk.next;
        }

        for(Integer i: treeSet){
                res = new ListNode(i,res);
        }


        return res;
    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

