import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.TRUE;

public class HeightLabel {
    public boolean isLeaf(TreeNode t) {
        if (t.left == null && t.right == null) return true;
        Map<Integer, Integer> dict = new HashMap<>();
        return false;
    }


    public int height(TreeNode t) {
        if (t == null) return 0;
        if (isLeaf(t)) return 1;
        else return 1 + Math.max(height(t.left), height(t.right));
    }

    public TreeNode rewire(TreeNode t) {
        if (t == null) {
            return t;
        }
        if (isLeaf(t)) {
            t.info = 1;
            return t;
        } else {
            t.info = height(t);
            rewire(t.left);
            rewire(t.right);
            return t;
        }
    }
}

/*
public class HeightLabel {
    public TreeNode rewire(TreeNode t){
        TreeNode tree = relevel(t, auto);
        int max = Collections.max(maxTracker);
        return maxPutter(tree, max);
    }
    public TreeNode maxPutter(TreeNode t, int highest){
        if(t != null){
            t.info = highest + 1 - t.info;
            if(t.left != null && t.right != null){
                maxPutter(t.left, highest);
                maxPutter(t.right, highest);
            }
            if(t.left != null && t.right == null){
                maxPutter(t.left, highest);
            }
            if(t.left == null && t.right != null){
                maxPutter(t.right, highest);
            }
        }
        return t;
    }
    int auto = 1;
    Set<Integer> maxTracker = new HashSet<>();
    public TreeNode relevel(TreeNode t, int auto ) {
        if(t != null){
            t.info = auto;
            maxTracker.add(auto);
            if(t.left != null && t.right != null){
                relevel(t.left, auto + 1);
                relevel(t.right, auto + 1);
            }
            if(t.left != null && t.right == null){
                relevel(t.left, auto + 1);
            }
            if(t.left == null && t.right != null){
                relevel(t.right, auto + 1);
            }
        }
        return t;
    }
}
//I need a shorter way to do this.
//Also I don't know how this is wrong.
/*
public static void main(String[] args){
        TreeNode test = new TreeNode(1);
        test.left = new TreeNode(2);
        test.left.left = new TreeNode(3);
        System.out.println(test);
    }
 */
