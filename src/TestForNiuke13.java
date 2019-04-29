public class TestForNiuke13 {

    public static void main(String[] args) {


        ListNode listNode=FindKthToTail(list5(),1);
        System.out.println(listNode.val);
    }

    public static ListNode list5(){
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        return listNode1;
    }



    public static ListNode FindKthToTail(ListNode head, int k) {

        int count = 0;
        int num = 0;

        if(null!=head) {
            count++;
        }else {
            return head;
        }
        ListNode listNode = head;

        while (null != listNode.next) {
            count++;
            listNode = listNode.next;
        }
        if(k>count)
            return null;
        System.out.println(count);
        listNode = head;
        while (num != count - k) {
            num++;
            listNode = listNode.next;
        }

        return listNode;
    }
}
