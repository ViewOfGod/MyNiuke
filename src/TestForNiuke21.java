import java.util.ArrayList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。3423217351-12345678@
 */
public class TestForNiuke21 {





    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        ArrayList<Integer> respList = new ArrayList<>();
        int count = 0;//表示每行元素数量
        int firstnum = 0;//当前行首位置

        if (null == root) {
            return respList;
        } else {
            list.add(root);
            count++;
        }
        while (count > 0) {
            int num = 0;//当前行下一行元素数量
            for (int i = firstnum; i < firstnum + count; i++) {
                if (null != list.get(i).left) {
                    list.add(list.get(i).left);
                    num++;
                }
                if (null != list.get(i).right) {
                    list.add(list.get(i).right);
                    num++;
                }

            }
            firstnum = firstnum + count;
            count = num;
        }
        for (int i = 0; i < list.size(); i++) {
            respList.add(list.get(i).val);
        }

        return respList;
    }

}
