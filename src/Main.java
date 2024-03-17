class Main{
         public static void main(String[] args) {

            stacklinkedlist bookStack = new stacklinkedlist();
    
            Book book1 = new Book("data structure", "mark", 1910);
    
            Book book2 = new Book("java", "khalid", 2022);
    
            Book book3 = new Book("hi", "salman", 2023);
    
            Book book4 = new Book("python", "sari", 2024);
    
            bookStack.push(book1);
    
            bookStack.push(book2);
    
            bookStack.push(book3);
    
            bookStack.push(book4);
    
            System.out.println("The size of the stack: " + bookStack.size());
            System.out.println("the top book is: "+bookStack.top().getTitle() );
    
            Book poppedBook = bookStack.pop();
            System.out.println("the book that got pooped is: "+poppedBook.getTitle());
            System.out.println("the top book is: "+bookStack.top().getTitle() );
            System.out.println("The size of the stack: " + bookStack.size());

           

    
     
        }
    }