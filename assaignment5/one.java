
public class one {  
 
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }   
    public Node head = null;  
    public Node tail = null;    
    public void addAtStart(int data) {  
        Node newNode = new Node(data);    
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else{  
            Node temp = head;    
            head = newNode;  
            head.next = temp;  
        }  
    }   
    public void display() {  
        
        Node current = head;  
        if(head == null) {  
            return;  
        }  
        while(current != null) {   
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        one sList = new one();  
        sList.addAtStart(1);  
        sList.addAtStart(2);  
        sList.addAtStart(3);   
        sList.addAtStart(4);  
        sList.display(); 
    }  
}  