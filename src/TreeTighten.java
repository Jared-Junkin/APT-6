public class TreeTighten {
    public boolean isLeaf(TreeNode t){
        if(t.left == null && t.right == null) return true;
        return false;
    }
    public TreeNode tighten(TreeNode t) {
        if(!isLeaf(t)){
            if(t.right != null && t.left != null){
                t.right = tighten(t.right);
                t.left = tighten(t.left);
            }
            if(t.right != null && t.left == null){
                return tighten(t.right);
                //just saying t = tighten t wouldn't work because that would just be an infinite recursion.
                //it would be an infinite recursion because saying t = tighten t would take the function right back to that same space,
                //over and over again.
            }
            if(t.right == null && t.left != null){
                return tighten(t.left);
                // this is overwriting t with t.left because it goes back into the function and then returns t (if it's a leaf),
                //whihc was originally t.left
            }
        }
        return t;
    }
    //so, it's not necessary to keep a pointer on the root like it is for a linked list?
    //also, I don't understand why it's missing thirteen and twentyfive
    //I'm doing something wrong with recursion, and I don't get what it is.
    //this also might be me not overwriting balues properly
    //what is the method for thinking through recursion?

    //start by thinking about base cases and putting them out in front
}