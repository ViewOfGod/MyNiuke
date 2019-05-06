import java.util.ArrayList;

//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
public class TestForNiuke54 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(null==pHead||null==pHead.next)
            return null;
        ArrayList<ListNode> listNodes = new ArrayList<>();
        listNodes.add(pHead);
        ListNode node = pHead;
        while (null != node.next&&!listNodes.contains(node.next)) {
            node = node.next;
            listNodes.add(node);
        }
        if (null != node.next) {
            return null;
        }else {
            return node.next;
        }
    }
}
