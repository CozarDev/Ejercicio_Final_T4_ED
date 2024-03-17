public class Pelicula {
    private String nombre;
    private String director;
    private int duracion;
    private int anio;

    public Pelicula(PeliculaBuilder builder) {
        this.nombre = builder.nombre;
        this.director = builder.director;
        this.duracion = builder.duracion;
        this.anio = builder.anio;
    }

    public static PeliculaBuilder builder(){
        return new PeliculaBuilder(builder().nombre);
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

    public static class PeliculaBuilder {
        private String nombre;
        private String director;
        private int duracion;
        private int anio;

        public PeliculaBuilder(String nombre){
            this.nombre = nombre;
        }
        public PeliculaBuilder setDirector(String director) {
            this.director = director;
            return this;
        }

        public PeliculaBuilder setDuracion(int duracion) {
            this.duracion = duracion;
            return this;
        }

        public PeliculaBuilder setAño(int anio) {
            this.anio = anio;
            return this;
        }
        public Pelicula build() {
            Pelicula pelicula = new Pelicula(this);
            return pelicula;
        }
    }
}

