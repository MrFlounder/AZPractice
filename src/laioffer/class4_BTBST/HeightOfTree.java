package laioffer.class4_BTBST;

import util.TreeNode;

/**
 * Created by guangshuo on 3/31/17.
 */
public class HeightOfTree {
    public static int getHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
