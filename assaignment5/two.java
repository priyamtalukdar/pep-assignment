public class two { 
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
        public void addAtEnd(int data) {  
            Node newNode = new Node(data);   
            if(head == null) {  
                head = newNode;  
                tail = newNode;  
            }  
            else {    
                tail.next = newNode;  
                tail = newNode;  
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
      
            two sList = new two();  
            sList.addAtEnd(1);
            sList.addAtEnd(2);  
            sList.addAtEnd(3); 
            sList.addAtEnd(4);  
            sList.display();  
        }  
    }  

