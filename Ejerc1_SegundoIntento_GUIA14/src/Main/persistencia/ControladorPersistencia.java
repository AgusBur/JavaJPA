package Main.persistencia;

import Main.logica.Autor;
import Main.logica.Editorial;
import Main.logica.Libro;
import Main.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {

    AutorJpaController autorJpa = new AutorJpaController();
    EditorialJpaController editoJpa = new EditorialJpaController();
    LibroJpaController libroJpa = new LibroJpaController();

    public void guardarAutor(Autor autor) {
        autorJpa.create(autor);
    }

    public void guardarEditorial(Editorial edito) {
        editoJpa.create(edito);
    }

    public void guardarLibro(Libro book) {
        try {
            libroJpa.create(book);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAutor(Autor autor) {
        try {
            autorJpa.edit(autor);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEditorial(Editorial edito) {
        try {
            editoJpa.edit(edito);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Libro> traerLibros() {

        return libroJpa.findLibroEntities();
    }

    public void eliminarLibro(int bnLibro) {
        try {
            libroJpa.destroy(String.valueOf(bnLibro));
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Libro traerAutor(int bn) {
        return libroJpa.findLibro(String.valueOf(bn));
    }

    public void modificarLibro(Libro book) {
        try {
            libroJpa.edit(book);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Autor> traerAutores() {
        return autorJpa.findAutorEntities();
    }

    public void eliminarAutor(int idA) {
        try {
            autorJpa.destroy(idA);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Editorial> traerEditoriales() {
        return editoJpa.findEditorialEntities();
    }

    public void eliminarEditorial(int idA) {
        try {
            editoJpa.destroy(idA);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
