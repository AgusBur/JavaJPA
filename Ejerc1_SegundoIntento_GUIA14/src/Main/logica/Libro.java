
package Main.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Libro implements Serializable {
    
    @Id
    private String isbn;
    private String titulo;
    private int anio;
    private int ejempTotales;
    private int ejempPrestados;
    private int ejempRestantes;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String isbn, String titulo, int anio, int ejempTotales, int ejempPrestados, int ejempRestantes, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejempTotales = ejempTotales;
        this.ejempPrestados = ejempPrestados;
        this.ejempRestantes = ejempRestantes;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEjempTotales() {
        return ejempTotales;
    }

    public void setEjempTotales(int ejempTotales) {
        this.ejempTotales = ejempTotales;
    }

    public int getEjempPrestados() {
        return ejempPrestados;
    }

    public void setEjempPrestados(int ejempPrestados) {
        this.ejempPrestados = ejempPrestados;
    }

    public int getEjempRestantes() {
        return ejempRestantes;
    }

    public void setEjempRestantes(int ejempRestantes) {
        this.ejempRestantes = ejempRestantes;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
  
