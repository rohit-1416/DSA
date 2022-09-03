package Tree;

public class TreeTraversal {
    Node root;
    TreeTraversal(){
        root=null;
    }
    public void printPostOrder(Node node){
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data+" ");
    }
    public void printInorder(Node node){
        if(node == null)
            return;
        printInorder(node.left);
        System.out.println(node.data+" ");
        printInorder(node.right);
    }
    public void printPreorder(Node node){
        if(node == null)
            return;
        System.out.println(node.data+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
//    wrappers over recursive function
    void printPostOrder(){printPostOrder(root);}
    void printPreorder(){printPreorder(root); }
    void printInorder(){printInorder(root);}

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.printPostOrder();
    }
}
