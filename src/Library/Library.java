package Library;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {
    public static HashMap<String, Book> stock;

    public Library() {
        stock = new HashMap<>();
    }


    public void addBook(String bookTitle, Book book) {
        stock.put(bookTitle, book);
    }

    public void getBookByTitle(String title) {
        if (stock.containsKey(title)) {
            System.out.println("|- ¡El libro se encuentra en nuestro inventario!");
            System.out.println("|- Su información es: \n" + stock.get(title));
        } else {
            System.out.println("|- ¡Ups...! El libro no se encuentra en nuestro inventario.");
        }
    }




    //se cre una lista para almacenar libros que se encuentren
    // se itera sobre el stock
    //si el autor del libro actual coincide con el autor buscado = se añade el libro a booksFound
    public void getBooksByAuthor(String author) {
        List<Book> booksFound = new ArrayList<>();
        for (Book book : stock.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksFound.add(book);
            }
        }

        if (!booksFound.isEmpty()) {
            System.out.println("|- ¡Hemos encontrado libros del autor en nuestro inventario!");
            booksFound.forEach(book -> System.out.println(book));
        } else {
            System.out.println("|- ¡Ups...! No tenemos libros de ese autor en nuestro inventario.");
        }
    }




   //esto es para mostrar el inventaroi
    public void showInventory() {
        if (stock.isEmpty()) {
            System.out.println("|- El inventario está vacío.");
        } else {
            System.out.println("|-  todos los libros en el inventario:");
            for (Book book : stock.values()) {
                System.out.println(book);
            }
        }
    }



}