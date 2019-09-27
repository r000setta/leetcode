package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 删除链表倒数第N个节点
 */
public class RemoveNthFromEnd {
    public ListNode solution(ListNode head,int n){
        ListNode curr=head;
        int t=0;
        while (curr.next!=null&&t!=n){
            curr=curr.next;
            t++;
        }

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
