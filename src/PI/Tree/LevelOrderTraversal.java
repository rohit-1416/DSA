package PI.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    Node root;
    public void printLevelOrder(){
        Queue<Node> queue =new LinkedList<>();
        Node tempNode =root;
        queue.add(root);
        while (! queue.isEmpty()){
            tempNode =queue.poll();
            System.out.print(tempNode.data+" ");
            if(tempNode.left != null)
                queue.add(tempNode.left);
            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LevelOrderTraversal obj = new LevelOrderTraversal();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
                obj.printLevelOrder();
    }
}
