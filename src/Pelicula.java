public class Pelicula {
    private String nombre;
    private String director;
    private int duracion;
    private int anio;

    public Pelicula(String nombre, String director, int duracion, int anio) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    public String getNombre() {
        return nombre;
    }
}
