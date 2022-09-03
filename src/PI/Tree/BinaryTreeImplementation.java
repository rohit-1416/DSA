package PI.Tree;

public class BinaryTreeImplementation {
    static void preOrder(Node root){
        if(root != null) {
            System.out.print("Preorder : "+root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void inOrder(Node root){
        if(root != null) {
            inOrder(root.left);
            System.out.print("InOrder : "+root.data+" ");
            inOrder(root.right);
        }
    }
    static void postOrder(Node root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print("PostOrder : "+root.data+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTreeImplementation obj = new BinaryTreeImplementation();
        Node root= new Node(20);
        root.left= new Node(10);
        root.right= new Node (30);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

}
