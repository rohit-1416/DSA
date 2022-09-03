package PI.Tree;

import java.util.Stack;

public class BinarySearchTreeImplementation {
    Node root;
    void insert(int d){
        Node newNode = new Node(d);

        if(root == null) {
            root = newNode;
            return;
        }
        Node temp = root ;
        Node prev= null;

        while(temp != null){
            if(temp.data > d) {
                prev =temp;
                temp = temp.left;
            }
            else {
                prev= temp;
                temp=temp.right;
            }
        }
        if (prev.data >d)
            prev.left=newNode;
        else
            prev.right= newNode;
    }
    static void preOrder(Node root){
        if(root != null) {
            System.out.print("Preorder : "+root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inorder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                stack.add(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }
    public static void main(String[] args) {
       BinarySearchTreeImplementation obj = new BinarySearchTreeImplementation();
//        Node root= new Node(20);
//        root.left= new Node(10);
//        root.right= new Node (30);
        obj.insert(30);
        obj.insert(50);
        obj.insert(15);
        obj.insert(20);
        obj.insert(10);
        obj.insert(40);
        obj.insert(60);

        obj.inorder();
//        preOrder(root);
    }
}
