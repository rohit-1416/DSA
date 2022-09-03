package Tree;

public class BSTImplementation {
    Node root;
    BSTImplementation(){root = null;}
    BSTImplementation(int value ){ root = new Node(value);}
    void insert(int key){root= insertRecoed(root,key);}
    Node insertRecoed(Node root,int key){
//        if tree id empty return new node
        if(root == null) {
            root = new Node(key);
            return root;
        }
//        tree recursive call
        if(key < root.data)
            root.left= insertRecoed(root.left,key);
        else if(key> root.data)
            root.right= insertRecoed(root.right,key);
//        return unchanged root pointer
        return root;
    }
    void inorder() { inorderRec(root); }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BSTImplementation tree = new BSTImplementation();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}
