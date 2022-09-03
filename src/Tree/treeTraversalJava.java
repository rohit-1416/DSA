package Tree;

public class treeTraversalJava {
    Node root;
    static class Node{
        Node left, right;
        int data;
        Node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    public void Inorder(Node ptr){
        if(ptr != null){
            Inorder(ptr.left);
            System.out.println(ptr.data);
            Inorder(ptr.right);
        }
    }
    public void postorder(Node ptr){
        if(ptr != null){
            Inorder(ptr.left);
            Inorder(ptr.right);
            System.out.println(ptr.data);
        }
    }
    public void preorder(Node ptr){
        if(ptr != null){
            System.out.println(ptr.data);
            Inorder(ptr.left);
            Inorder(ptr.right);
        }
    }

    void Inorder(){Inorder(root);}
    void preorder(){preorder(root);}
    void postorder(){postorder(root);}
    public static void main(String[] args) {
        treeTraversalJava t = new treeTraversalJava();
        t.root = new Node(10);
        t.root.right= new Node(30);
        t.root.left= new Node(20);

        System.out.println("Preorder ");
        t.preorder();
        System.out.println("Inorder ");
        t.Inorder();
        System.out.println("Postorder ");
        t.postorder();
    }
}

/*
                10
                /\
              /     \
             20     30
 */