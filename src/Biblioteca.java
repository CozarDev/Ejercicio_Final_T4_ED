public class Biblioteca {
    public Pelicula[] peliculas;

    public Biblioteca(int capacidad) {
        this.peliculas = new Pelicula[capacidad];
    }

    public boolean buscadorPorNombre(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getNombre().equals(titulo)) {
                return true;
            }
        }
        return false;
    }
}
