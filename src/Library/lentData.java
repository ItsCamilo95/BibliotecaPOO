package Library;

import java.time.LocalDate;

public class lentData {
    protected String name;
    protected String id;
    protected String book;
    protected LocalDate date;
    protected int lentDays;

    public lentData(String name, String id, String book, int lentDays) {
        this.name = name;
        this.id = id;
        this.book = book;
        this.date = LocalDate.now();
        this.lentDays = lentDays;
    }

    //metodo para poder imprimir el objeto, al igual que en la clase book
    @Override
    public String toString() {
        return  "\n"+"|------------------------|"+"\n"+
                "|- Nombre: " + name+"\n"+
                "|- ID: " + id +"\n"+
                "|- Libro prestado: " + book +"\n"+
                "|- Fecha: " + date +"\n"+
                "|- Dias prestados: " + lentDays +"\n"+
                "|------------------------|";
    }

    public String getId() {
        return id;
    }
}
