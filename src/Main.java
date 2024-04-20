import Library.Book;
import Library.Library;
import Library.Loan;
import Library.lentData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner numerico
        Scanner input = new Scanner(System.in);

        //Scanner de texto
        Scanner inputText = new Scanner(System.in);

        Library library = new Library();

        Loan loan = new Loan();

        boolean run = true;
        while (run){

            System.out.println("|--------------------------------------------------|");
            System.out.println("|-- ¡BIENVENIDO A NUESTRA LIBRERÍA!");
            System.out.println("|- 1. Agregar libro.");
            System.out.println("|- 2. Buscar libro por titulo.");
            System.out.println("|- 3. Buscar libro por autor.");
            System.out.println("|- 4. Mostrar libros.");
            System.out.println("|- 5. Realizar préstamo.");
            System.out.println("|- 6. Devolver libro.");
            System.out.println("|- 7. Consultar libros prestados por usuario.");
            System.out.println("|- 8. Salir.");
            System.out.println("|--------------------------------------------------|");

            int option =  input.nextInt();

            switch (option){

                case 1: {

                    //libros quemados mientras se implimente una API
                    Book book1 = new Book("1984", "George Orwell", "12345", "Comcosur", 1949, 29.999, true);
                    Book book2 = new Book("La nausea", "Jean-Paul Sartre", "54321", "Comcosur", 1938, 39.999, true);

                    library.addBook("1984", book1);
                    library.addBook("La nausea", book2);

                    System.out.println("|- ¡Los libros se añadieron de forma exitosa!");

                    break;
                }

                case 2:{

                    System.out.println("|- Buscar libro por título.");
                    boolean run2 = true;
                    while(run2){

                        System.out.println("|- Ingrese el nombre del libro: ");
                        String title = inputText.nextLine();
                        library.getBookByTitle(title);
                        System.out.println("|- ¿Desea buscar otro libro?");
                        System.out.println("|- 1. SI.");
                        System.out.println("|- 2. NO.");
                        option = input.nextInt();
                        if (option != 1){
                            run2 = false;
                        }
                    }
                    break;
                }

                case 3:{

                    System.out.println("|- Buscar libro por Autor.");
                    boolean run2 = true;
                    while(run2){

                        System.out.println("|- Ingrese el nombre del autor: ");
                        String autor = inputText.nextLine();
                        library.getBooksByAuthor(autor);
                        System.out.println("|- ¿Desea buscar otro autor?");
                        System.out.println("|- 1. SI.");
                        System.out.println("|- 2. NO.");
                        option = input.nextInt();
                        if (option != 1){
                            run2 = false;
                        }
                    }
                    break;
                }

                case 4:{

                    System.out.println("|- Mostrar inventario.");
                    library.showInventory();
                    break;
                }

                case 5:{

                    System.out.println("|- Prestar libro.");
                    boolean run2 = true;
                    while(run2){

                        System.out.println("|- Ingrese el nombre del libro: ");
                        String title = inputText.nextLine();
                        if (loan.verifyBook(title)){

                            //datos quemados para agilizar las pruebas
                            lentData userData = new lentData("Camilo", "12345", title, 7);
                            loan.lendBook(title, userData);
                        }

                        System.out.println("|- ¿Desea prestar otro libro?");
                        System.out.println("|- 1. SI.");
                        System.out.println("|- 2. NO.");
                        option = input.nextInt();
                        if (option != 1){
                            run2 = false;
                        }
                    }
                    break;
                }

                case 6: {

                    System.out.println("|- Devolver libro.");
                    boolean run2 = true;
                    while(run2){

                        System.out.println("|- Ingrese el nombre del libro: ");
                        String title = inputText.nextLine();
                        loan.returnBook(title);
                        System.out.println("|- ¿Desea devolver otro libro?");
                        System.out.println("|- 1. SI.");
                        System.out.println("|- 2. NO.");
                        option = input.nextInt();
                        if (option != 1){
                            run2 = false;
                        }
                    }
                    break;
                }

                case 7: {

                    System.out.println("|- Consultar libros prestados por usuario.");
                    boolean run2 = true;
                    while(run2){

                        System.out.println("|- Ingrese el ID del usuario");
                        String id = inputText.nextLine();
                        loan.showUserLent(id);
                        System.out.println("|- ¿Desea consultar otro usuario?");
                        System.out.println("|- 1. SI.");
                        System.out.println("|- 2. NO.");
                        option = input.nextInt();
                        if (option != 1){
                            run2 = false;
                        }
                    }
                    break;
                }

                case 8: {
                    run = false;
                    break;
                }
                default: run = false;
            }
        }

        System.out.println("|-- ¡Un placer haberte servido!");
        System.out.println("|- ¡Adiós!");

    }
}
