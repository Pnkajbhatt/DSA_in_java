package DSA.LinkedList;

public class DoubleLinkedList {
    public  class Node{
        int data; 
        Node next; 
        Node prev;
 
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node  head;
    public static Node  tail;
    public static int size = 0;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail= newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head=tail= newNode;
            size++;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void removeLast() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    
    public void PrintDLL(){
        System.out.println("-----YOUR LINKED LIST----");
        if(head == null){
            System.out.println("Dll is Null");
        }
        Node temp = head;
        
        while(temp.next != null){
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);
        ll.addLast(11);
        ll.addLast(13);
        ll.addLast(15);
        ll.addLast(17);
        ll.addLast(19);
        ll.addLast(21);
        ll.addLast(23);
        ll.addLast(25);
        ll.addLast(27);
        ll.addLast(29);
        ll.addLast(31);

        ll.PrintDLL();
    }
}
