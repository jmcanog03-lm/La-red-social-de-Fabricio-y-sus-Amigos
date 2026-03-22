public enum Etiquetas {
DEPORTES(1),
VIDEOJUEGOS(2),
FABRICIO(3),
TV(4),
MODA(5),
IA(6),
PELICULAS(7),
COCINA(8),
SERIES(9),
TECNOLOGIA(10),
COMIC(11);


 private final int n;

    private Etiquetas(int n){
        this.n = n;
    }

    public int getN(){
        return n;
    }

    public static Etiquetas fromN(int n){
        for (Etiquetas etiqueta : Etiquetas.values()) {
            if (etiqueta.getN()==n) {
                return etiqueta;
            }
        }
        return null;
    }
}
