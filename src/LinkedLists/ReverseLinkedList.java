package LinkedLists;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode newHead = reverseList(listNode);

    }

    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode newHead = null;

        if (!stack.isEmpty()) {
            newHead = stack.peek();
            //to make the old head points to null i.e. make it new tail
            stack.firstElement().next = null;

            for (int i = stack.size() - 1; i > 0; i--) {
                stack.get(i).next = stack.get(i - 1);
            }
        }

        return (newHead == null) ? head : newHead;
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
