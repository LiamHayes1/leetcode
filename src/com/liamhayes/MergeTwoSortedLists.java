package com.liamhayes;

public class MergeTwoSortedLists {
  
   /**
   * Definition for singly-linked list.
   * public class ListNode {
   *     int val;
   *     ListNode next;
   *     ListNode() {}
   *     ListNode(int val) { this.val = val; }
   *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   * }
   */
  
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode current = dummyHead;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val > l2.val) {
//                current.next = new ListNode(l2.val);
//                l2 = l2.next;
//            } else {
//                current.next = new ListNode(l1.val);
//                l1 = l1.next;
//            }
//            current = current.next;
//        }
//        if (l1 != null) current.next = l1;
//        if (l2 != null) current.next = l2;
//        return dummyHead.next;
//    }
}
    
    
