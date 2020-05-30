class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> node=new ArrayList<>();
        solve(root, node);
        return node.get(k-1);
    }
    public void solve(TreeNode root, ArrayList<Integer> node){
        if(root==null)
            return;
        solve(root.left,node);
        node.add(root.val);
        solve(root.right,node);
    }
}
