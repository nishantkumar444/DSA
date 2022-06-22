import java.util.*;
class SinglyLinkedList{
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            data=d;
            left=right=null;
        }
    }
    Node print(){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        Node root=null;
        if(d!=-1){
            root=InsertInBst(root,d);
            d=sc.nextInt();
        }
        return root;
    }
    Node InsertInBst(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<=root.data){
            root.left=InsertInBst(root.left,data);
        }
        else{
            root.right=InsertInBst(root.right,data);
        }
        return root;
    }
    void printInOrder(Node root){
        if(root==null){
            return;
        }
        printInOrder(root.left);
        System.out.println(root.data);
        printInOrder(root.right);
    }

    public static void main(String[] args) {
            SinglyLinkedList ob=new SinglyLinkedList();
            ob.printInOrder(root);
    }
}