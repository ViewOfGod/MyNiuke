
/**
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TestForNiuke37 {
    public int TreeDepth(TreeNode root) {
        if(null==root)
            return 0;

        if(null==root.left&&null==root.right)
            return 1;
        if(null==root.left&&null!=root.right)
            return 1+TreeDepth(root.right);
        if(null!=root.left&&null==root.right)
            return 1+TreeDepth(root.left);
        if(null!=root.left&&null!=root.right)
            return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
        return 0;

    }
}
