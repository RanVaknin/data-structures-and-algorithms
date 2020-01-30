//package tree;
//
//import java.util.ArrayList;
//
//public class TraverseBF<T> {
//
//    public ArrayList<T> traverseBreadthFirst(Tree<T> tree){
//        if(tree.root == null)  {
//            return new ArrayList<>();
//        }
//        ArrayList<Node> list = new ArrayList<>();
//        list.add(tree.root);
//        Node temp = tree.root;
//        int i = 0;
//        while(temp.left != null || temp.right != null) {
//            if(temp.left !=null){
//                list.add(temp.left);
//            }
//            if(temp.right !=null){
//            list.add(temp.right);
//            }
//            i++;
//            temp = list.get(i);
//        }
//        ArrayList<T> result = new ArrayList<>();
//        for(Node<T> node : list){
//            result.add(node.value);
//        }
//        return result;
//    }
//}
