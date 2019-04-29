public class TestForNiuke15 {

    public ListNode Merge(ListNode list1,ListNode list2) {
        if(null==list1){
            return list2;
        }
        if(null==list2){
            return list1;
        }


        ListNode listNode1=list1;
        int count1=1;
        while (null!=listNode1.next){
            count1++;
            listNode1=listNode1.next;
        }

        ListNode listNode2=list2;
        int count2=1;
        while (null!=listNode2.next){
            count2++;
            listNode2=listNode2.next;
        }


        ListNode[] listNode=new ListNode[count1+count2];
        if(listNode1.val>listNode2.val){
            listNode[count1+count2-1]=listNode1;
        }else {
            listNode[count1+count2-1]=listNode2;
        }
        listNode1=list1;listNode2=list2;
        int num=0;
        while (num<count1+count2-1) {
            if(listNode1.val <= listNode2.val&&null==listNode1.next){
                listNode[num++] = listNode1;
                while (num<count1+count2-1){
                    listNode[num++] = listNode2;
                    listNode2=listNode2.next;
                }
            }

            if(listNode1.val > listNode2.val&&null==listNode2.next){
                listNode[num++]=listNode2;
                while (num<count1+count2-1){
                    listNode[num++] = listNode1;
                    listNode2=listNode1.next;
                }
            }
            while (listNode1.val <= listNode2.val&&null!=listNode1.next) {
                listNode[num++] = listNode1;
                listNode1 = listNode1.next;
            }
            while (listNode1.val > listNode2.val&&null!=listNode2.next){
                listNode[num++]=listNode2;
                listNode2=listNode2.next;
            }

        }


        for(int i=0;i<count1+count2-1;i++){
            listNode[i].next=listNode[i+1];
        }

        return listNode[0];

    }
}
