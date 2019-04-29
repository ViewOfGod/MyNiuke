public class TestForNiuke14 {

    public static void main(String[] args) {

        ListNode lre=ReverseList(TestForNiuke13.list5());

        outs(lre);
    }
    public static ListNode ReverseList(ListNode head) {
        if(null==head)
            return head;
        ListNode list = head;
        int count = 0;
        if(null!=head)
            count++;
        while (null != list.next) {
            count++;
            list=list.next;//循环结束，list为最后一个Node
        }
        ListNode [] lresp=new ListNode[count];
        for(int i=0;i<count;i++){
            ListNode l2=head;
            for(int j=0;j<count-i-1;j++){
                l2=l2.next;
            }
            lresp[i]=l2;
        }
        lresp[count-1]=head;

        for(int i=0;i<count-1;i++){
            lresp[i].next=lresp[i+1];
        }
        lresp[count-1].next=null;

        return lresp[0];

    }

    public static void outs(ListNode head){
        ListNode li=head;
        System.out.println(li.val);
        while (null!=li.next){
            System.out.println(li.next.val);
            li=li.next;
        }
    }

}
