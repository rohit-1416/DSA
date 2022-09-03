package Tree;

class Node{
    int data ;
    Node left,right;
    public Node(int data){
//        key =data;
//        left =right= null;
        this.data=data;
        this.left=this.right=null;
    }
}
/*              node
                item(5)
                /   \
               /      \
            left     right
 *          null       null
 *
 *
 * */

public class BinaryTreeImplementation {
    static final int COUNT = 10;
    private static Node root;

    BinaryTreeImplementation(int key){
        root =new Node(key);
    }
    /*           node
                root
                /   \
               /      \
            left     right
 *          null       null
 *
 *
 * */
    BinaryTreeImplementation(){
        root= null;
    }

    public static void printData(Node root, int space){
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        printData(root.right, space);
        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        // Process left child
        printData(root.left, space);
    }
    static void print2d(Node root){
        printData(root,0);
    }

    public static void main(String[] args) {
        BinaryTreeImplementation btree= new BinaryTreeImplementation();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);
          /*     node
                root=5
                /   \
               /      \
             node     node
            left     right
 *           2         7
            /
           node
          left
          1
 *
 *
 * */
    print2d(root);
    }

}
