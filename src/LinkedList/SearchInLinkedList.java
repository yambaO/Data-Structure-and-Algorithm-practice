package LinkedList;
//Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
//Examples:
//
//Input: 1 -> 2 -> 3 -> 4 -> 5, X = 3
//Output: Yes
//3 is present in the linked list.
//
//Input: 1 -> 2 -> 3 -> 4 -> 5, X = 6
//Output: No
//6 is not present in the linked list.
//
//Approach: The idea is to traverse the linked list and check if the key ‘X’ is present in the linked list or not. If the key is present in the linked list then print “Yes” else print “No”.


public class SearchInLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;
    };

    // Function that detects loop in the list
    int countNodes(Node n) {
        int res = 1;
        Node temp = n;
        while (temp.next != n) {
            res++;
            temp = temp.next;
        }
        return res;
    }

    /* This function detects and counts loop
    nodes in the list. If loop is not there
    in then returns 0 */
    int countNodesinLoop(Node list) {
        Node slow_p = list, fast_p = list;

        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

            /* If slow_p and fast_p meet at some point
            then there is a loop */
            if (slow_p == fast_p)
                return countNodes(slow_p);
        }

        /* Return 0 to indeciate that ther is no loop*/
        return 0;
    }

    // Driver code
    public static void main(String[] args) {
        SearchInLinkedList list = new SearchInLinkedList();
        list.head = new Node();
        list.head.data = 1;
        list.head.next = new Node();
        list.head.next.data = 2;
        list.head.next.next = new Node();
        list.head.next.next.data = 3;
        list.head.next.next.next = new Node();
        list.head.next.next.next.data = 4;
        list.head.next.next.next.next = new Node();
        list.head.next.next.next.next.data = 5;

        /* Create a loop for testing */
        head.next.next.next.next.next = head.next.next;
        int length = list.countNodesinLoop(head);
        System.out.println(length);
    }

}
