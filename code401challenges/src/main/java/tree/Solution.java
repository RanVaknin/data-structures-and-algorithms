package tree;

class Solution {
    public Node insertIntoBST(Node root, int val) {
        if(root == null){
            return new Node(val);
        }
        if(val > root.value){
            if(root.right != null){
                insertIntoBST(root.right,val);
            } else{
                root.right = new Node(val);
            }
        }
        if(val < root.value){
            if(root.left !=null){
                insertIntoBST(root.left,val);
            } else {
                root.left = new Node(val);
            }
        }
        return new Node(val);
    }
}