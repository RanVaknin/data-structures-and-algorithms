//package tree;
//
//public class FizzBuzzTree {
//
//    public static String fizzbuzz(Integer input){
//        if(input % 3 == 0 && input % 5 ==0){
//            return "Fizzbuzz";
//        } else if(input % 3 == 0){
//            return "Fizz";
//        } else if(input % 5 == 0){
//            return "Buzz";
//        } else {
//            return input.toString();
//        }
//    }
//
//    public Node fizzBuzzTree(Node inputNode){
//        if(inputNode == null){
//            return null;
//        }
//        Node fizzbuzzedNode = new Node(fizzbuzz(inputNode.value));
//        fizzbuzzedNode.left = fizzBuzzTree(inputNode.left);
//        fizzbuzzedNode.right = fizzBuzzTree(inputNode.right);
//        return fizzbuzzedNode;
//    }
//}
