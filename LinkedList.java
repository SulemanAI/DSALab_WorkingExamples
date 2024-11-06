class Node{
    int data=23;
    Node address;


public Node(int data){
    this.data = data;
    this.address = null;
}
}

public class LinkedList {
    
        Node head , tail;
        int size;
        
    public LinkedList(){
        head = tail = null;
        size = 0 ;
    }
    
    public void add (int d){
        Node n = new Node(d);
        
        if(head == null){
            head=tail=n;
        }
        else{
            tail.address = n;
            tail = n;
        }
    }
     public void printList() {
        Node current = head;  
        
        while (current != null) {
            System.out.println(current.data + " ");  
            current = current.address; 
        }
 
    }              
    public static void main(String[] args) {            
//        Node node1 = new Node(1);
//        Node node2= new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
        
//        node1.address = node2;
//        node2.address = node3;
//        node3.address = node4;
//        node4.address = node5;
//        node5.address = null;
       
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.printList(); 
        
//       System.out.println(node1.data);
//       System.out.println(node1.address.data); // node1.address.data = node2.data
//       System.out.println(node1.address.address.data); // node1.address.address.data = node2.address.data = node3.data
//       System.out.println(node1.address.address.address.data); //node1.address.address.address.data = node2.address.address.data = node3.address.data = node4.data
//       System.out.println(node1.address.address.address.address.data); //node1.address.address.address.address.data = node2.address.address.address.data = node3.address.address.data = node4.address.data = node5.data
    }
}
