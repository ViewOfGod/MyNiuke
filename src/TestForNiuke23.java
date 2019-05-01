import java.util.ArrayList;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class TestForNiuke23 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (null == root)
            return arrayLists;


        return null;


    }

    //前序遍历树
    public void pathList(TreeNode root) {
        ArrayList<TreeNode> treeNodeList = new ArrayList<>();
        if (null != root.left) {
            pathList(root.left);
        }
        if(null!=root.right){
            pathList(root.right);
        }
    }
}
