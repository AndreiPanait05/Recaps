package advanced.collections;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
//        Book book = new Book("Scott", "Gatsby", Genre.DRAMA, 2002);
//        library.addBook(book);
        System.out.println(library.getBooksByGenre());
//        System.out.println(library.getAllGenres());
//        System.out.println(library.getAllBooksByGenre(Genre.DRAMA));

        try {
            //library.buyBook(library.findBookByTitle("Great Gatsby", Genre.DRAMA));
            library.buyBook(new Book("Scott Fitzgerald", "Great Gatsby", Genre.ADVENTURE, 2001));
        } catch (NoSuchBookException e) {
            e.getMessage();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(library.getBooksByGenre());
        System.out.println(library.getAllGenderWithNoOfBooks());
        System.out.println(library.getNumberOfAllBooks());
        System.out.println(library.getAllBooksWithYearGreaterThanForGenre(Genre.DRAMA, 2000));
        System.out.println(library.getAllBooksTitle());
        library.printAllBooksTileWithYearBetween(1961, 2000);


    }
}
