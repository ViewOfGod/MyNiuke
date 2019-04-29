public class TestForNiuke16 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(6);
        TreeNode root4 = new TreeNode(5);
        TreeNode root5 = new TreeNode(4);
        TreeNode root6 = new TreeNode(3);
        TreeNode root7 = new TreeNode(2);

        TreeNode root21 = new TreeNode(5);
        TreeNode root22 = new TreeNode(4);
        TreeNode root23 = new TreeNode(3);


        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root5.left = root6;
        root5.right = root7;

        root21.left = root22;
        root21.right = root23;

//        System.out.println(nodeNum(root21));
        boolean flag = HasSubtree(root21, root1);
        System.out.println(flag);
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (nodeNum(root1) < nodeNum(root2))
            return HasSubtree_a(root2, root1);
        else {
            return HasSubtree_a(root1, root2);
        }
    }

    /**
     * 该方法的前提条件为前者为父后者为子，然后当前节点匹配不了，就递归的寻其两个子节点进行匹配
     * @param root1
     * @param root2
     * @return
     */
    public static boolean HasSubtree_a(TreeNode root1, TreeNode root2) {
        if (null == root1 || null == root2)
            return false;

        if (!pipei(root1, root2)) {//当前节点匹配失败，则选其两个子节点分表进行匹配，有成功者即可返回true
            if (null != root1.left && null != root1.right) {
                return HasSubtree_a(root1.left, root2) || HasSubtree_a(root1.right, root2);
            } else if (null != root1.left && null == root1.right) {
                return HasSubtree_a(root1.left, root2);
            } else if (null == root1.left && null != root1.right) {
                return HasSubtree_a(root1.right, root2);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    /**
     * 该方法的作用是，子树能否匹配父树当前节点为顶的树
     * @param root1
     * @param rood2
     * @return
     */
    public static boolean pipei(TreeNode root1, TreeNode rood2) {
        if (root1.val != rood2.val)
            return false;
        if (null != rood2.left && null == root1.left)
            return false;
        if (null != rood2.right && null == root1.right)
            return false;
        if (null != rood2.left && null != rood2.right) {
            return pipei(root1.left, rood2.left) && pipei(root1.right, rood2.right);
        } else if (null != rood2.left && null == rood2.right) {
            return pipei(root1.left, rood2.left);
        } else if (null == rood2.left && null != rood2.right) {
            return pipei(root1.right, rood2.right);
        } else {
            return true;
        }
    }

    public static int nodeNum(TreeNode root) {
        int num = 0;
        if (null == root)
            return 0;
        if (null != root.left && null != root.right) {
            num = nodeNum(root.left) + nodeNum(root.right) + 1;
        } else if (null != root.left && null == root.right) {
            num = nodeNum(root.left) + 1;
        } else if (null == root.left && null != root.right) {
            num = nodeNum(root.right) + 1;
        } else {
            num = 1;
        }
        return num;
    }


}
