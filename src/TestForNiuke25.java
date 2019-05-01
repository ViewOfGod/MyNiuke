import java.util.ArrayList;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class TestForNiuke25 {
    static ArrayList<TreeNode> treeNodeList = new ArrayList<>();

    //思路：先中序遍历，输出结果即为排序的结果，然后再赋值链表关系
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (null == pRootOfTree)
            return null;
        treeNodes(pRootOfTree);
        if (treeNodeList.size() == 1) {
            treeNodeList.get(0).right=treeNodeList.get(0);
            treeNodeList.get(0).left=treeNodeList.get(0);
            return treeNodeList.get(0);
        }
        //赋值前后关系
        treeNodeList.get(0).right = treeNodeList.get(1);
        treeNodeList.get(0).left = null;
        for (int i = 1; i < treeNodeList.size() - 1; i++) {
            treeNodeList.get(i).right = treeNodeList.get(i + 1);
            treeNodeList.get(i).left = treeNodeList.get(i - 1);
        }
        treeNodeList.get(treeNodeList.size() - 1).left = treeNodeList.get(treeNodeList.size() - 1 - 1);
        treeNodeList.get(treeNodeList.size() - 1).right = null;
        return treeNodeList.get(0);
    }

    //中序遍历
    public static void treeNodes(TreeNode root) {
        if (null != root.left) {
            treeNodes(root.left);
//            treeNodeList.add(root.left);
        }
        treeNodeList.add(root);
        if (null != root.right) {
            treeNodes(root.right);
        }
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        TreeNode root2 = new TreeNode(4);
        TreeNode root3 = new TreeNode(12);
        TreeNode root4 = new TreeNode(2);
        TreeNode root5 = new TreeNode(6);
        TreeNode root6 = new TreeNode(5);
        TreeNode root7 = new TreeNode(7);


        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root5.left = root6;
        root5.right = root7;

        TreeNode t;
        t = Convert(root1);


    }

}
