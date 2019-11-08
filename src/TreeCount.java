public class TreeCount {
    int counter = 0;
    public int count(TreeNode t) {
        if(t != null){ //why did this have an infinite runtime with a while statement?
            counter ++;
            if(t.right != null && t.left != null){
                TreeNode left = t.left;
                t = t.right;
                count(t);
                count(left);
            }
            if(t.right != null && t.left == null){
                t = t.right;
                count(t);
            }
            if(t.left != null && t.right == null){
                t = t.left;
                count(t);
            }
        }
        return counter; //base case here is just return. Because when you get to the bottom (when it's a null node, you do your base case
        //operation, which is just return.
    }
}

