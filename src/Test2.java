import leetcode.ListNode;

/**
 * 给出两个非空的链表用来表示两个非负的整数。其中，
 * 它们各自的位数是按照逆序的方式存储的,并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @param
 */
public class Test2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode(0);
        int carry=0,sum=0;
        while (l1!=null||l2!=null){
            if(l1!=null||l2!=null)
                sum=l1.val+l2.val+carry;
            carry=sum/10;
            listNode.next=new ListNode(sum/10);
            listNode=listNode.next;
            if (l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;
        }
        if(carry>0){
            listNode.next=new ListNode(carry);
        }
       return listNode.next;
    }

    public static void main(String[] args) {
        Test2 test2=new Test2();
        ListNode l1=new ListNode(342);
        ListNode l2=new ListNode(465);
        ListNode listNode;
        listNode=test2.addTwoNumbers(l1,l2);
        while (listNode.next!=null){
            System.out.println(listNode.next.val);
        }


    }
}
