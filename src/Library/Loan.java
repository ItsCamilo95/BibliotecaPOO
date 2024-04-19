package Library;

import java.util.HashMap;

public class Loan{
    //este hashmap contendrá todos los libros prestados.
    //la clave es el nombre del libro y el valor es un objeto lentData
    // que contiene toda la información del usuario que lo prestó
    protected static HashMap <String, lentData> loanStock;

    public Loan() {
        loanStock = new HashMap<>();
    }

    public boolean verifyBook(String bookTitle){
        //se verifica si la libreria tiene el libro
        if (Library.stock.containsKey(bookTitle)){
            // se evalua si el libro se puede prestar o no ( si es true o false)
            if (Library.stock.get(bookTitle).getLent()){
                System.out.println("|- Encontramos el libro en el inventario y podemos prestartelo!");
                return true;
            }else{
                System.out.println("|- Lo sentimos, alguien más tiene este libro.");
                return false;
            }
        }else {
            System.out.println("|- ¡Ups... No encontramos el libro en el inventario");
            return false;
        }
    }

    public void lendBook(String bookTitle, lentData data){
        loanStock.put(bookTitle, data);

        //ya que se prestó el libro, es necesario actualizar el campo lent
        //para que nadie mas pueda prestarlo tambien
        Library.stock.get(bookTitle).setLent(false);
    }

    public void showLoanStock() {
        if (loanStock.isEmpty()) {
            System.out.println("|- El inventario está vacío.");
        } else {
            System.out.println("|- Información de libros prestados: ");
            for (lentData data : loanStock.values()) {
                System.out.println(data);
            }
        }
    }
    public void returnBook(String bookTitle) {
        if (loanStock.containsKey(bookTitle)) {
            Library.stock.get(bookTitle).setLent(true);
            loanStock.remove(bookTitle);
            System.out.println("|- El libro con título '" + bookTitle + "' ha sido devuelto con éxito.");
        } else {
            System.out.println("|- No encontramos el libro en el registro de préstamos!");

        }

    }

}
