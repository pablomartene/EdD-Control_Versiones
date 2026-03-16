// Book.java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    
    // BUG 1: No hay getters/setters para todos los campos
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    // Faltan getIsbn() y isAvailable()
    
    public void borrow() {
        // BUG 2: No valida si ya está prestado
        available = false;
    }
    
    public void returnBook() {
        // BUG 3: No valida si ya estaba disponible
        available = true;
    }
}
//bugs corregidos en el commit 1234567, pero no se han subido al repositorio remoto.
// BUG 2 corregido: Ahora valida si el libro ya está prestado antes de cambiar el estado
public void borrow() {
    if (available) {
        available = false;
        System.out.println("El libro '" + title + "' ha sido prestado con éxito.");
    } else {
        System.out.println("Error: El libro '" + title + "' ya está prestado.");
    }
}

// BUG 3 corregido: Ahora valida si el libro ya estaba en la biblioteca
public void returnBook() {
    if (!available) {
        available = true;
        System.out.println("El libro '" + title + "' ha sido devuelto.");
    } else {
        System.out.println("Error: El libro '" + title + "' ya estaba disponible en la biblioteca.");
    }
}