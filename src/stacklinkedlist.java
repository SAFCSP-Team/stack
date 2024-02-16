class stacklinkedlist{
    public Node top;  
    int size;

    public stacklinkedlist () {
        top = null;
        size = 0;
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
            this.size-=1;
    
            return poppedBook;
    
        }

    

    public Book top() {
        if (isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
        
    }
}
class Node{
    public Node next;
    public Book data;
    public Node(Book data){
        this.next = null;
        this.data=data;
    } 
}
