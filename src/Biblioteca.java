public class Biblioteca {
    public Pelicula[] peliculas;

    public Biblioteca(int capacidad) {
        this.peliculas = new Pelicula[capacidad];
    }

    public boolean buscadorPorNombre(String titulo) {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getNombre().equals(titulo)){
                return true;
            }
        }
        return false;
    }
}
