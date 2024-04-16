package Library;

public class Book {

    //Variable title protegida para guardarla como clave en el hashmap
    protected String title;
    private String author;
    private String ISBN;
    private String editorial;
    private int year;
    private double price;

    protected boolean lent;

    public Book(String title, String author, String ISBN, String editorial, int year, double price, boolean lent) {
        this.title = title.toLowerCase();
        this.author = author;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.year = year;
        this.price = price;
        this.lent = lent;
    }

    /* Cuando se imprime el hashmap, se imprime una representación del objeto book de esta forma
    por ejemplo: "libro" = “Library.Book@6108b2d7”;
    y no sus valores, eso lo hace por defecto el método toString().
    Por esto, se tuvo que usar un método toString() propio, que permitiera imprimir los datos de la manera deseada.
     */

    @Override
    public String toString() {
        return "titulo: " + title+"\n"+
                "autor: " + author +"\n"+
                "ISBN: " + ISBN +"\n"+
                "editorial: " + editorial +"\n"+
                "año de publicación: " + year +"\n"+
                "precio: " + price;
    }


    public String getAuthor() {
        return this.author;
    }

    public boolean getLent() {
        return this.lent;
    }

    //cuando lent es false, significa que no se puede prestar
    // cuando lent es true, significa que se puede prestar
    //el setter de lent permite indicar si un libro fue prestado o no
    public void setLent(boolean lent) {
        this.lent = lent;
    }
}
