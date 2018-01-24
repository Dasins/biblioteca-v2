import java.util.ArrayList;

/**
 * Clase que modela objetos del tipo biblioteca, que guardan referencias a libros
 *
 * @author Dasins666
 * @version 24/01/2018
 */
public class Biblioteca{
    private ArrayList<Libro> libros;
    
    /**
     * Constructor de objetos de la clase biblioteca.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }
    
    /**
     * Anade un libro a la coleccion.
     * @param isbn El isbn del libro.
     * @param titulo El titulo del libro.
     * @param autor El autor del libro.
     * @param numPags El numero de paginas del libro. 
     */
    public void addLibro(int isbn, String titulo, String autor, int numPags){
        int codLibro = libros.size();
        libros.add(new Libro(codLibro,isbn, titulo, autor, numPags));
    }
    
    /**
     * Modifica el isbn del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param isbn El nuevo isbn.
     */
    public void setISBN(int index, int isbn) {
        if(validarIndex(index)) {
            libros.get(index).setISBN(isbn);
        } 
    }
    
    /**
     * Modifica el titulo del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param isbn El nuevo titulo.
     */
    public void setTitulo(int index, String titulo) {
        if(validarIndex(index)) {
            libros.get(index).setTitulo(titulo);
        } 
    }
    
    /**
     * Modifica el autor del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param isbn El nuevo autor.
     */
    public void setAutor(int index, String autor) {
        if(validarIndex(index)) {
            libros.get(index).setAutor(autor);
        } 
    }
    
    /**
     * Modifica el numero de paginas del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param isbn El nuevo numero de paginas.
     */
    public void setAutor(int index, int numPags) {
        if(validarIndex(index)) {
            libros.get(index).setNumPags(numPags);
        } 
    }
    
    private boolean validarIndex(int index) {
        boolean indiceValido = false;
        if(index >= 0 && index < libros.size()){
            indiceValido =  true;
        }
        return indiceValido;
    }
}
