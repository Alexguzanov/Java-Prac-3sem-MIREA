import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> shelf = new ArrayList<>();
    private int countOfBooks;

    public void addBooks(Book[] books){
        for (int i = 0; i < books.length; i++){
            this.shelf.add(books[i]);
        }
    }

    public Book oldestBook(){
        int minYear = 99999999;
        Book oldBook = new Book();
        for (int i = 0; i < this.shelf.size(); i++){
            Book currentBook = this.shelf.get(i);
            if (currentBook.getYear() < minYear){
                minYear = currentBook.getYear();
                oldBook = currentBook;
            }
        }
        return oldBook;
    }

    public Book newestBook(){
        int maxYear = -99999999;
        Book newBook = new Book();
        for (int i = 0; i < this.shelf.size(); i++){
            Book currentBook = this.shelf.get(i);
            if (currentBook.getYear() > maxYear){
                maxYear = currentBook.getYear();
                newBook = currentBook;
            }
        }
        return newBook;
    }

    public void sortShelf(ArrayList<Book> shelf, int low, int high) {
        if (shelf.size() == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = shelf.get(middle).getYear();


        int i = low, j = high;
        while (i <= j) {
            while (shelf.get(i).getYear() < opora) {
                i++;
            }

            while (shelf.get(j).getYear() > opora) {
                j--;
            }

            if (i <= j) {
                Book temp = shelf.get(i);
                shelf.set(i, shelf.get(j));
                shelf.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j)
            sortShelf(shelf, low, j);

        if (high > i)
            sortShelf(shelf, i, high);
    }



}
