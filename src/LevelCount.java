public class LevelCount {
    int counter = 0;
    public int count(TreeNode t, int level) {
        if(t == null) return 0; //this could be replaced with an if statement if t!= null
        if(level != 0){
            if(t.left != null && t.right != null){
                count(t.left, level - 1);
                count(t.right, level - 1);
            }
            if(t.left != null && t.right == null){
                count(t.left, level - 1);
            }
            if(t.left == null && t.right != null){
                count(t.right, level - 1);
            }
        }
        else{ //either level or complimentary if statement work here
            counter++;
        }
        return counter; //why don't all the extra returns get in the way? wouldn't even the base cases return something?
    }
}