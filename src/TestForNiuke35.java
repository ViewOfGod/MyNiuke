import java.util.HashMap;
import java.util.Map;

public class TestForNiuke35 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (null == pHead1 || null == pHead2)
            return null;
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode node1 = pHead1;
        map.put(pHead1, 0);
        while (null != node1.next) {
            map.put(node1.next, 0);
            node1 = node1.next;
        }
        ListNode node2 = pHead2;
        while (null != node2.next) {
            if (map.containsKey(node2))
                return node2;
            node2 = node2.next;
        }
        if (map.containsKey(node2))
            return node2;
        return null;
    }
}
