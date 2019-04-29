public class TestForNiuke_Mirro {
    public static void main(String[] args) {
        TreeNode t8 = new TreeNode(8);
        TreeNode t7 = new TreeNode(7);
        TreeNode t6 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);

        t8.left = t7;
        t7.left = t6;
        t6.left = t5;
        t5.left = t4;

        Mirror(t8);
        sout(t8);
        sout(t7);
        sout(t6);
        sout(t5);

    }

    public static void sout(TreeNode root) {
        if (null != root.left) {
            System.out.println("当前为：" + root.val + "左子树为" + root.left.val);
        }
        if (null != root.right) {
            System.out.println("当前为：" + root.val + "右子树为" + root.right.val);
        }


    }

    public static void Mirror(TreeNode root) {
        if (null == root)
            return;
        if (null != root.right) {
            Mirror(root.right);
        }
        if (null != root.left) {
            Mirror(root.left);
        }

        if (null != root.left && null != root.right) {
            TreeNode mid = root.left;
            root.left = root.right;
            root.right = mid;
        } else if (null != root.left && null == root.right) {
            root.right = root.left;
            root.left = null;
        } else if (null == root.left && null != root.right) {
            root.left = root.right;
            root.right = null;
        } else {
            return;
        }


    }
}
