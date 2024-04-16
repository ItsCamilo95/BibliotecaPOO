import Library.Book;
import Library.Library;
import Library.Loan;
import Library.lentData;

public class Main {
    public static void main(String[] args) {

        Book libro1 = new Book("1984", "George Orwell", "12345", "Comcosur", 1949, 29.999, true);
        Book libro2 = new Book("La nausea", "Jean-Paul Sartre", "54321", "Comcosur", 1938, 39.999, true);

        Library libreria = new Library();

        libreria.addBook("1984", libro1);
        libreria.addBook("La nausea", libro2);

        Loan prestamo = new Loan();
        String libroPrestar = "1984";
        if (prestamo.verifyBook(libroPrestar)){
            //si el libro se puede prestar se crea una nueva instancia con los datos del prestamo
            lentData userData = new lentData("Camilo", "12345", libroPrestar, 7);
            prestamo.lendBook(libroPrestar, userData);
        }

        String libroPrestar2 = "1984";
        if (prestamo.verifyBook(libroPrestar2)){
            //si el libro se puede prestar se crea una nueva instancia con los datos del prestamo

            lentData userData = new lentData("Julian", "54321", libroPrestar2, 14);
            prestamo.lendBook(libroPrestar2, userData);
        }

        prestamo.showLoanStock();
    }
}
