import java.util.Scanner;

public class linkedlist1 {
    Node head,tail;

    public linkedlist1(){
        tail = head  = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(){
        int s;
        Scanner sc = new Scanner(System.in);
        while(true){
            s = sc.nextInt();
            if(s == 0)
                break;
            else{
                Node newnode = new Node(s);
                if(head == null){
                    tail = head = newnode;
                }
                else{
                    tail.next = newnode;
                    tail = newnode;
                }
            }    
        }

    }
    public void printNode(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
           while(head != null){
               System.out.println(head.data);
               head= head.next;
            }
        }
    }
    
    public static void main(String args[]){
        linkedlist1 list= new linkedlist1();
       
        list.create();
        list.printNode(list.head);
    }
}
