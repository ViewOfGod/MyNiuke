import java.util.ArrayList;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class TestForNiuke24 {
    public RandomListNode Clone(RandomListNode pHead) {
        ArrayList<RandomListNode> randomListNodeList = new ArrayList<>();
        if (null == pHead) {
            return null;
        } else {
            randomListNodeList.add(new RandomListNode(pHead.label));
        }

        RandomListNode root = pHead;
        while (null != root.next) {
            randomListNodeList.add(new RandomListNode(root.next.label));
            root = root.next;
        }
        //赋值next
        for (int i = 0; i < randomListNodeList.size() - 1; i++) {
            randomListNodeList.get(i).next = randomListNodeList.get(i + 1);
        }
        root = pHead;
        //赋值random
        for (int i = 0; i < randomListNodeList.size() - 1; i++) {
            if (null != root.random) {
                int num = 0;
                RandomListNode numNode = pHead;
                while (root.random != numNode) {
                    num++;
                    numNode = numNode.next;
                }

                randomListNodeList.get(i).random = randomListNodeList.get(num);
            }
            if (null != root.next) {
                root = root.next;
            }
        }

        return randomListNodeList.get(0);

    }


}
