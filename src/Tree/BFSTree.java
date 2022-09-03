package Tree;//level wise display
//          10           add 10 to queue
//          /\
//        /    \            delete 10 and output it
//                              and add 20 and 30 t q
//      20      30              delete 20 and 30 op it
//                                  add 40
//    /
//  40
//OP = 10 20 30 40

import java.util.LinkedList;
import java.util.Queue;

//need extra ds PI.Queue;
public class BFSTree {
    Node root;
   static class Node{
       int data;
       Node left ,right ;
       Node(int val ){
        data =val;
        left = right = null;
       }
    }

    void PrintBFS(){
        Queue<Node> queue =new LinkedList<>();
        queue.add(root);
        while (! queue.isEmpty()){
//            Java’s Linked list class offers a function that allows a “PI.Queue Based” working called poll(). This function not only returns deletes the first element, but also displays them while being deleted and hence can have a lot of usage in daily life problems and competitive programming as well. There are 3 variants of poll(), all three are discussed in this article.
//1. poll() : This method retrieves and removes the head (first element) of this list.
            Node tempNode =   queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }


    public static void main(String[] args) {
       BFSTree tree_level =new BFSTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal ");
                tree_level.PrintBFS();
    }
}
