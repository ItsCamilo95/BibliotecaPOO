package Library;

public class Main {
    public static void main(String[] args) {

        Book libro1 = new Book("1984", "George Orwell", "12345", "Comcosur", 1949, 29.999);
        Book libro2 = new Book("La nausea", "Jean-Paul Sartre", "54321", "Comcosur", 1938, 39.999);

        Library libreria = new Library("Mi libreria");

        libreria.addBook(libro1.title, libro1);
        libreria.addBook(libro2.title, libro2);

        libreria.getBookByTitle("1984");

    }
}
