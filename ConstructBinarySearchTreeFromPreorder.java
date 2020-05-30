class Solution {
public:
    TreeNode* BST(TreeNode* root, int x){
        if(root==NULL){
            return root=new TreeNode(x);
        }
        if(root->val>x){
            root->left=BST(root->left,x);
        }
        else
            root->right=BST(root->right,x);
        return root;
    }
    TreeNode* bstFromPreorder(vector<int>& preorder) {
     TreeNode* root=NULL;
        for(auto x:preorder){
            root=BST(root,x);
        }
        return root;
    }
};
