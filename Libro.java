
/**
 * Clase que modela objetos del tipo libro, que contiene su titulo, su isbn
 * su autor y su numero de paginas.
 *
 * @author Dasins666
 * @version 24/01/2018
 */
public class Libro {
    // El codigo del libro. Autonumerico, no se puede modificar.
    private int codLibro;
    // El isbn del libro.
    private int isbn;
    // El nombre del libro.
    private String titulo;
    // El autor del libro.
    private String autor;
    // El numero de paginas del libro.
    private int numPags;
    
    /**
     * Constructor de objetos de la clase Libro.
     * @param isbn El isbn del libro.
     * @param titulo El titulo del libro.
     * @param autor El autor del libro.
     * @param numPags El numero de paginas del libro.
     */
    public Libro(int isbn, String titulo, String autor, int numPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }
    
    /**
     * @return Devuelve el isbn del libro.
     */
    public int getISBN() {
        return isbn;
    }
    
    /**
     * @return Devuelve el titulo del libro.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * @return Devuelve el autor del libro.
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * @return Devuelve el numero de paginas del libro.
     */
    public int getNumPags() {
        return numPags;
    }
    
    /**
     * Modifica el isbn del libro.
     * @param isbn El nuevo isbn.
     */
    public void setISBN(int isbn) {
        this.isbn = isbn;
    }
    
    /**
     * Modifica el titulo del libro.
     * @param titulo El nuevo titulo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Modifica el autor del libro.
     * @param autor El nuevo autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    /**
     * Modifica el numero de paginas del libro.
     * @param numPags El nuevo numero de paginas.
     */
    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }
}
