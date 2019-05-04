//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
public class TestForNiuke38 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(null==root)
            return true;
        if(null==root.left&&null==root.right)
            return true;
        if (null != root.right && null != root.left) {//若左孩子右孩子都不为空
            if (IsBalanced_Solution(root.right) && IsBalanced_Solution(root.left) && mo(TreeDepth(root.right) - TreeDepth(root.left)) <= 1)
                return true;
        }
        if (null != root.left && null == root.right) {
            if (TreeDepth(root.left) == 1)
                return true;
        }
        if (null == root.left && null != root.right) {
            if (TreeDepth(root.right) == 1)
                return true;
        }

        return false;
    }

    int mo(int num) {
        if (num < 0)
            return 0 - num;
        return num;
    }

    public int TreeDepth(TreeNode root) {
        if (null == root)
            return 0;
        if (null == root.left && null == root.right)
            return 1;
        if (null == root.left && null != root.right)
            return 1 + TreeDepth(root.right);
        if (null != root.left && null == root.right)
            return 1 + TreeDepth(root.left);
        if (null != root.left && null != root.right)
            return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
        return 0;

    }

}
