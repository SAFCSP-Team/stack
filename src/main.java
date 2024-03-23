public class main {
    public static void main(String[] args) {
        Stack bookStack = new Stack(3);
        bookStack.push(new Book("harry potter", "aljawharah", 2000));
        bookStack.push(new Book("escaperoom", "khalid", 2023));
        System.out.println(bookStack.size());
        System.out.println(bookStack.top().getTitle());
        System.out.println(bookStack.pop().getTitle());
        System.out.println(bookStack.size());

    }
}
