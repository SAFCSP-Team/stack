class Stack {

    public Book [] array;
    int top;
    int size;

    public Stack (int size) {
        array = new Book [size];
        this.size = size;
        top = -1;
    }

    public void push(Book value) {
        if(top == array.length - 1){
            System.out.println("array is full");
            return;
        
        }
        array[++top] = value;
        }
    

    public Book pop() {
        if(top == -1){
            System.out.println("stack is empty");
            return null;
        }
        Book poppedBook = array[top];
        array[top--] = null;
        return poppedBook;
    }

    public Book top() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
