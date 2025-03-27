package leetcode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node n=new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(4);
        n.next.next.next.next=new Node(5);

      //  Node.getNode(n);
        Node rev=Node.reverse(n);
        Node.getNode(rev);
    }

}

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data=data;
    }

    public static void getNode(Node n){
        while (n.next!=null){
            System.out.println(n.data);
             n=n.next;
        }
        System.out.println(n.data);
    }

    public static Node reverse(Node node) {
        //1,2,3
        //
        Node current = node;
        Node prev = null;

        while (current!= null) {
             Node next = current.next;
             current.next=prev;
             prev=current;
             current=next;
        }
        return prev;
    }
}
