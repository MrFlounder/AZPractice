package laioffer.class4_BTBST;


import util.TreeNode;

import static laioffer.class4_BTBST.HeightOfTree.getHeight;

/**
 * Created by guangshuo on 3/31/17.
 */
public class IsBalancedBT {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
