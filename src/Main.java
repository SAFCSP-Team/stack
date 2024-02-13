class Main{
         public static void main(String[] args) {

            Stack bookStack = new Stack();
    
            Book book1 = new Book("1", "Author 1", 2021);
    
            Book book2 = new Book("2", "Author 2", 2022);
    
            Book book3 = new Book("3", "Author 3", 2023);
    
            Book book4 = new Book("4", "Author 4", 2024);
    
            bookStack.push(book1);
    
            bookStack.push(book2);
    
            bookStack.push(book3);
    
            bookStack.push(book4);
    
            System.out.println("The size of the stack: " + bookStack.size());
    
    
            Book poppedBook = bookStack.pop();
    
    
            System.out.println("The size of the stack: " + bookStack.size());
    
        }
    }
