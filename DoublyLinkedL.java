import java.util.*;
public class DoublyLinkedL {
    private Node head;
    private Node tail;
    private int length;
    private class Node{
        private int data;
        private Node next;
        private Node previous;
        public Node(int data){
            this.data=data;
        }
    }
    public DoublyLinkedL(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){

        return length==0;
    }
    public int length(){

        return length;
    }
    public void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void insertAtBeg(int value){
        Node n=new Node(value);
        if(isEmpty()){
            tail=n;
        }
        else{
            head.previous=n;
        }
        n.next=head;
        head=n;
        length++;
    }
    public void insertAtLast(int value){
        Node cur=new Node(value);
            if(isEmpty()){
                head=cur;
            }
            else{
                tail.next=cur;
                cur.previous=tail;
            }
            tail=cur;
            length++;
        }
        public void deleteFirst(){
        if(isEmpty()){
            return;
        }
        Node temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp=null;
        length--;
        return;
        }
        public void deleteLast(){
        if(isEmpty()){
            return;
        }
        Node temp=tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        tail.previous=null;
        length--;
        return;

        }


    public static void main(String[] args) {
        DoublyLinkedL dll=new DoublyLinkedL();
        dll.insertAtBeg(3);
        dll.insertAtBeg(5);
        dll.insertAtBeg(7);
        dll.insertAtLast(15);
       // dll.deleteFirst();
        dll.deleteLast();
        dll.display();
        System.out.println(dll.length());
    }
}
