package com.kspendli.examples;

public class ReverseListNode {
    public static void main(String[] args) {
        ReverseListNode reverseListNode = new ReverseListNode();
        ListNode node = reverseListNode.addToNode("243");
        ListNode node1 = reverseListNode.addToNode("564");
       ListNode node2= reverseListNode.addTwoNumbers(node, node1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int left = getSumValue(l1);
        int right = getSumValue(l2);
        int result = left+right;
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        String reverse = sb.reverse().toString();
        return addToNode(reverse);
    }

    private ListNode addToNode(String s){
        char[] a = s.toCharArray();
        ListNode node = new ListNode(Character.getNumericValue(a[0]));
        for(int i=1;i<a.length;i++){
            node = new ListNode(Character.getNumericValue(a[i]),node);
        }
        return node;
    }

    private int getSumValue(ListNode l1){
        StringBuilder sb = new StringBuilder();
        int val = l1.val;
        while(val!=0){
            sb.append(val);
            l1 = l1.next;
            if(l1!=null){
                val = l1.val;
            }else{
                val=0;
            }
        }
        return Integer.valueOf(sb.toString());
    }
}

 class ListNode {
    int val;
   ListNode next;
    ListNode() {}
   ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}