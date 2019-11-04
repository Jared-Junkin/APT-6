import java.util.Arrays;

public class AllPaths {
    public boolean isLeaf(TreeNode t){
        if(t.left == null && t.right == null) return true;
        return false;
    }
    public String[] paths(TreeNode t) {
        if(t == null) return new String[0];
        if(isLeaf(t)){
            String[] toReturn = new String[0];
            return new String[] {t.info + ""};
        }
        else{
            String[] right = paths(t.right);
            String[] left = paths(t.left);
            for(int k = 0; k<right.length; k++){
                right[k] = (t.info + "->") + right[k];
            }
            for(int k = 0; k<left.length; k++){
                left[k] = (t.info + "->") + left[k];
            }
            String[] ambi = new String[right.length + left.length];
            for(int k = 0; k<right.length; k++){
                ambi[k] = right[k];
            }
            for(int k = right.length; k<left.length + right.length; k++){
                ambi[k] = left[k - right.length];
            }
            Arrays.sort(ambi);
            return ambi;
        }
    }
}