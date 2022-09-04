package PI.Tree;

public class HeightOfTree {
    Node root;
    int maxDepth(Node root){
            if(root == null )
                return -1;
            int lDepth =maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            if(lDepth > rDepth)
                return (lDepth+1);
            else
                return (rDepth+1);

    }

    public static void main(String[] args) {
        HeightOfTree obj = new HeightOfTree();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);

        System.out.println("Height of obj is : " + obj.maxDepth(obj.root));

    }
}
