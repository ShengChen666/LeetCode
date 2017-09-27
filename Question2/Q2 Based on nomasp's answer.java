//Based on nomasp's answer
public class Solution {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int temp=0;
         ListNode listNode=new ListNode(0);
         ListNode p1=l1,p2=l2,p3=listNode;
         while(p1!=null || p2!=null){
             if(p1!=null){
                 temp+=p1.val;
                 p1=p1.next;
             }
             if(p2!=null){
                 temp+=p2.val;
                 p2=p2.next;
             }
             p3.next=new ListNode(temp%10);
             p3=p3.next;
             carry/=10;
         }
         if(temp==1)
             p3.next=new ListNode(1);
         return listNode.next;  
     }
}