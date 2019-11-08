import java.util.ArrayList;
import java.util.Arrays;

public class SortedLeaves {
    public boolean isLeaf(TreeNode t){
        if(t.left == null && t.right == null) return true;
        return false;
    }
    public void doWork(TreeNode t){
        if(t != null){
            if(isLeaf(t)){
                chars.add("" + (char) t.info);
            }
            else{
                doWork(t.right);
                doWork(t.left);
            }
        }
    }
    ArrayList<String> chars = new ArrayList<>(); //what are the things you put inside the () again?
    public String[] values(TreeNode tree) {
        if(tree == null) return new String[0]; //this shouldn't be necessary later.
        doWork(tree);
        String[] toReturn = chars.toArray(new String[0]);
        Arrays.sort(toReturn);
        return toReturn;
        //this was originally fucked up because Arrays.sort doesn't return a value. And I wasn't saving the result of arrays.sort...
    }
}
/*
chars.toArray(new String[0]); //Why is this current arrangement giving me red squiggly lines?
        return chars;
//Right now, I'm feeling like I don't really know how to do these things in one pass, wihtout a helper function,
especially when the output of the function is of a different type from the input. Is that alright?
How should I try to get around that.
 */