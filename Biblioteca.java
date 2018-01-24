import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

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
     * @param Isbn El Isbn del libro.
     * @param titulo El titulo del libro.
     * @param autor El autor del libro.
     * @param numPags El numero de paginas del libro. 
     */
    public void addLibro(int Isbn, String titulo, String autor, int numPags){
        int codLibro = libros.size();
        libros.add(new Libro(codLibro,Isbn, titulo, autor, numPags));
    }
    
    /**
     * Modifica el Isbn del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param Isbn El nuevo Isbn.
     */
    public void setIsbn(int index, int isbn) {
        if(validarIndex(index)) {
            libros.get(index).setIsbn(isbn);
        } 
    }
    
    /**
     * Modifica el ISBN del libro con un determinado codigo. 
     * @param id El codigo del libro.
     * @param isbn El nuevo Isbn.
     */
    public void setIsbnByID(int id, int isbn) {
        int index = 0;
        while(index < libros.size()) {
            Libro libro = libros.get(index);
            if (libro.getCodLibro() == id){
                libro.setIsbn(isbn);
                index = libros.size();
            }
            index++;
        }
    }
    
    /**
     * Modifica el titulo del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param titulo El nuevo titulo.
     */
    public void setTitulo(int index, String titulo) {
        if(validarIndex(index)) {
            libros.get(index).setTitulo(titulo);
        } 
    }
    
    /**
     * Modifica el titulo del libro con un determinado codigo. 
     * @param id El codigo del libro.
     * @param autor El nuevo autor.
     */
    public void setTituloByID(int id, String autor) {
        int index = 0;
        while(index < libros.size()) {
            Libro libro = libros.get(index);
            if (libro.getCodLibro() == id){
                libro.setAutor(autor);
                index = libros.size();
            }
            index++;
        }
    }
    
    /**
     * Modifica el autor del libro indicado por parametro.  
     * @param index El indice que ocupa el libro. 
     * @param Isbn El nuevo autor.
     */
    public void setAutor(int index, String autor) {
        if(validarIndex(index)) {
            libros.get(index).setAutor(autor);
        } 
    }
    
    /**
     * Modifica el autor del libro con un determinado codigo. 
     * Si el indice no es valido, no hace nada.
     * @param id El codigo del libro.
     * @param autor El nuevo autor.
     */
    public void setAutorByID(int id, String autor) {
        int index = 0;
        while(index < libros.size()) {
            Libro libro = libros.get(index);
            if (libro.getCodLibro() == id){
                libro.setTitulo(autor);
                index = libros.size();
            }
            index++;
        }
    }
    
    /**
     * Modifica el numero de paginas del libro indicado por parametro. 
     * Si el indice no es valido, no hace nada.
     * @param index El indice que ocupa el libro. 
     * @param numPags El nuevo numero de paginas.
     */
    public void setNumPags(int index, int numPags) {
        if(validarIndex(index)) {
            libros.get(index).setNumPags(numPags);
        } 
    }
    
    /**
     * Modifica el numero de paginas del libro con un determinado codigo. 
     * Si el indice no es valido, no hace nada.
     * @param id El codigo del libro.
     * @param numPags El nuevo numero de paginas.
     */
    public void setNumPagsByID(int id, int numPags) {
        int index = 0;
        while(index < libros.size()) {
            Libro libro = libros.get(index);
            if (libro.getCodLibro() == id){
                libro.setNumPags(numPags);
                index = libros.size();
            }
            index++;
        }
    }
    
    /**
     * Borra el libro que ocupa la posicion indicada por parametro
     * @index La posicion que ocupa el elemento
     */
    public void borrarLibro(int index) {
        if(validarIndex(index)) {
            libros.remove(index);
        }
    }
    
    /**
     * Borra todos los libros de un autor
     * @param autor
     */
    public void borrarLibrosPorAutor(String autor) {
        Iterator<Libro> it = libros.iterator();
        while(it.hasNext()) {
            Libro libro = it.next();
            if(libro.getAutor().equals(autor)) {
                it.remove();
            }
        }
    }
    
    /**
     * Imprime por la terminal de texto toda la informacion de todos los libros.
     * Si no hay ninguno, no hace nada.
     */
    public void mostrarTodos() {
        imprimirColeccion(libros);
    }

  
    /**
     * Este metodo imprime todos los elementos de una coleccion de libros
     * @param coleccion La coleccion que se quiere imprimir.
     */
    private void imprimirColeccion(ArrayList<Libro> coleccion) {
        for(Libro libro : coleccion) {
            System.out.println(libro.getInfo());
        }
    }
    
    public ArrayList<Libro> tituloOrdenAlfabetico() {
        ArrayList<Libro> aDevolver = new ArrayList<>();
        
        return aDevolver;
    }
    
    private boolean validarIndex(int index) {
        boolean indiceValido = false;
        if(index >= 0 && index < libros.size()){
            indiceValido =  true;
        }
        return indiceValido;
    }
    
    public void test() {
        addLibro(1111,"Zalacain el aventurero", "Anonimo", 400);
        addLibro(1111,"El Quijote", "Anonimo", 400);
        addLibro(1111,"Sirvientes del inframundo", "Anonimo", 400);
        addLibro(1111,"Como cocinar a tu perro", "Anonimo", 400);
    }
}
