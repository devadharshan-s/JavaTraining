class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
    }

    Node(int d,Node n){
        data = d;
        next = n;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node res = head;

        for(int i = 1; i < 11; i++){
            head.next = new Node(i);
            head = head.next;
        }
        while (res != null) {
            System.out.print(res.data + " ");
        }
    }
}
