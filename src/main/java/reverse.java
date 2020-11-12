import java.util.Scanner;

class  ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}




public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


    }
    public  static ListNode Re(ListNode head){
        if(head==null||head.next==null){
            return  head;
        }
        ListNode next=null;
        ListNode pre=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            head=next;
        }
        return pre;
    }
}
