package Main.logica;

import Main.persistencia.ControladorPersistencia;
import java.util.List;

public class ControladorLogica {

    ControladorPersistencia controlP = new ControladorPersistencia();
    Libro book = new Libro();
    Editorial edito = new Editorial();
    Autor autor = new Autor();

    public void guardarLibro(String isbn, String titulo, int anio, int ejempTotales,
            int ejempPrestados, String nombreAutor, String nombreEdito) {

        autor.setNombre(nombreAutor);
        controlP.guardarAutor(autor);

        edito.setNombre(nombreEdito);
        controlP.guardarEditorial(edito);

        book.setIsbn(isbn);
        book.setTitulo(titulo);
        book.setAnio(anio);
        book.setEjempTotales(ejempTotales);
        book.setEjempPrestados(ejempPrestados);
        book.setEjempRestantes(ejempTotales - ejempPrestados);
        book.setAutor(autor);
        book.setEditorial(edito);
        controlP.guardarLibro(book);

    }

    public List<Libro> traerLibros() {

        return controlP.traerLibros();
    }

    public void eliminarLibro(int bnLibro, String nombreAutor, String nombreEditorial) {

        controlP.eliminarLibro(bnLibro);

        for (Autor au : traerAutores()) {
            if (au.getNombre().equalsIgnoreCase(nombreAutor)) {
                controlP.eliminarAutor(au.getId());
            }
        }

        for (Editorial edi : traerEditoriales()) {
            if (edi.getNombre().equalsIgnoreCase(nombreEditorial)) {
                controlP.eliminarEditorial(edi.getId());
            }
        }

    }

    public Libro traerAuto(int bn) {
        return controlP.traerAutor(bn);
    }

    public void modificarLibro(Libro book, String titulo, int anio, int ejempTotales,
            int ejempPrestados, String nombreAutor, String nombreEdito) {

        autor.setNombre(nombreAutor);
        edito.setNombre(nombreEdito);

        book.setTitulo(titulo);
        book.setAnio(anio);
        book.setEjempTotales(ejempTotales);
        book.setEjempPrestados(ejempPrestados);
        book.setEjempRestantes(ejempTotales - ejempPrestados);
        book.setAutor(autor);
        book.setEditorial(edito);

        controlP.modificarLibro(book);
    }

    private List<Autor> traerAutores() {
        return controlP.traerAutores();
    }

    private List<Editorial> traerEditoriales() {
        return controlP.traerEditoriales();
    }

}
