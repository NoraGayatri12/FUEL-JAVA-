// class Node{
//     int data;
//     Node next;

// }

// public class constructor {
//     public static void main(String arg[]){
//         Node node1=new Node();
//         Node node2=new Node();
//         Node node3=new Node():
//         node1.data=10;
//         node2.data=20;
//         node3.data=30;
//         node1.next=node2;
//         node2.next=node3;
//     }
// }



// using Constructure
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}

public class constructor {
    public static void main(String arg[]){
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        node1.next=node2;
        node2.next=node3;
        Node head=node1;
        while(head!=null){
            System.out.print(head.data+"--->");
            head=head.next;
        }
    }
}
