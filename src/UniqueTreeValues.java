import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueTreeValues {
    List<Integer> ordered = new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            if(!ordered.contains(root.info)){ //why does the function not hit this till the innermost loop?
                ordered.add(root.info);
            }
            inOrder(root.right);
        }
    }
    public int[] unique(TreeNode root) {
        inOrder(root);
        int[] toReturn = new int[ordered.size()];
        for(int k = 0; k < ordered.size(); k++){
            toReturn[k] = ordered.get(k);
        }
        Arrays.sort(toReturn);
        return toReturn;
    }
}