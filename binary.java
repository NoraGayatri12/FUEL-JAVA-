class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
    }
    void inOrder(Node node1){
        if(node1==null)
            return;
        inOrder(node1.left);
        System.out.print(node1.data+"--->");
        inOrder(node1.right);
        
        
    }
    
}

public class binary {
    public static void main(String args[]){
        Node root=new Node(50);
        root.left=new Node(10);
        root.right=new Node(80);
        root.left.left=new Node(20);
        root.left.right=new Node(60);
        root.right.left=new Node(40);
        root.right.right=new Node(70);
        root.inOrder(root);
        }    
}
