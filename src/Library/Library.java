package Library;

import java.util.HashMap;

public class Library {
    private String name;
    private HashMap<String, Book> stock;

    public Library(String name){
        this.name = name;
        this.stock = new HashMap<>();
        System.out.println("|-- Bienvenido a la libreria: "+name);
    }

    public void addBook(String bookTitle, Book book){
        stock.put(bookTitle, book);
    }

    public void getBookByTitle(String title){
        if (stock.containsKey(title)) {
            System.out.println("|- ¡El libro se encuentra en nuestro inventario!");
            System.out.println("|- Su información es: \n" + stock.get(title));
        } else {
            System.out.println("|- ¡Ups...! El libro no se encuentra en nuestro inventario.");
        }
    }

    public void getBookbyAuthor(){
        System.out.println("Mensaje de prueba");
    }

}
