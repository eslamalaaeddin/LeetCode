package LinkedLists;

import java.util.Stack;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode(7,new ListNode(7, new ListNode(7, new ListNode(7, null))));

        System.out.println(removeElements(listNode1, 6));
        System.out.println("------------");
        System.out.println(removeElements(listNode2, 1));
        System.out.println("------------");
        System.out.println(removeElements(listNode3, 7));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode traversal = head;
        Stack<ListNode> stack = new Stack<>();

        while (traversal != null){
            if (traversal.val != val)
                stack.push(traversal);
            traversal = traversal.next;
        }


        if (!stack.isEmpty())
            return stack.firstElement();

        else
            return traversal;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
