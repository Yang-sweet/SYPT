
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
public class test0 {
    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        head.val = 1;
        head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        a(head);
    }

    public static void a(ListNode l1) {
        System.out.println("secondNode 的值为：" + l1.next.next.val);
        System.out.println(l1);

    }
}
