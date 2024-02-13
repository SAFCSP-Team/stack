class Stack {
   Node top;
   int size;

    public Stack () {
        this.top = null;
    }

    public void push(Book value) {
        Node newNode = new Node(value) ;
        newNode.next = top;
        top = newNode;
        this.size += 1;
    }

    public Book pop() {

            if (isEmpty()) {
    
                System.out.println("Stack is empty.");
    
                return null;
    
            }
    
            Book poppedBook = top.data;
    
            top = top.next;
    
            return poppedBook;
    
        }

    

    public Book top() {
        return top.data;
    }

    public boolean isEmpty() {
        return top.data == null;
    }

    public int size() {
        return size;
        
    }
}
class Node{
    Node next;
    Book data;
    public Node(Book data){
        this.next = null;
    } 
}
