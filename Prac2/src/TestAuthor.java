public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Sergey Pushkin", "ser@mail.com", 'M');
        String email = author.get_email();
        System.out.print(author);
        System.out.print(" ");
        System.out.println(email);
        author.set_email("ser_pushkin@gmail.com");
        System.out.print(author.get_email());
    }
}
