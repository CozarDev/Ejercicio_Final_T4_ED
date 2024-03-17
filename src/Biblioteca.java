public class Biblioteca {
    private static Biblioteca INSTANCE;
    public String value;
    private Pelicula[] peliculas;
    public Biblioteca(int capacidad) {
        this.peliculas = new Pelicula[capacidad];
    }
    private void setPeliculas(Pelicula[] var) {
        this.peliculas = var;
    }

    private Biblioteca(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Biblioteca getInstance(String value) {
        if (INSTANCE == null){
            INSTANCE = new Biblioteca(value);
        }
        return INSTANCE;
    }
    private void setPelicula(int donde, Pelicula pelicula) {
        this.peliculas[donde] = pelicula;
    }
    private Pelicula[] getPeliculas() {
        return peliculas;
    }
    public void setPeliculasCopia (Pelicula[] var) {
        this.peliculas = new Pelicula[var.length];
        for (int i = 0; i < var.length; i++) {
            setPelicula(i, var[i]);
        }
    }
    public Pelicula[] getPeliculasCopia() {
        Pelicula[] var = new Pelicula[this.peliculas.length];
        System.arraycopy(this.peliculas, 0, var, 0, this.peliculas.length);
        return var;
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
