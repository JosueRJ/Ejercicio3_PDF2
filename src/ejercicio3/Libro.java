
package ejercicio3;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int año;

    
    //Constructores
    //Por defecto
    public Libro() {
    }
    //Con parametros
    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    
    //Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //Metodos
    public void prestamo(){}
    public void devolucion(){}
    
  //Metodo toString

    @Override
    public String toString() {
        return "Libro :"+getTitulo()+"\t"+"Autor :"+getAutor()+"\t"+"Año: "+getAño();
    } 
}
