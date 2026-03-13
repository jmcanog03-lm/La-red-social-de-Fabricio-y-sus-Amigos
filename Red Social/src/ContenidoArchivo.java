public class ContenidoArchivo extends Contenido {
    private String tituloArchivo;


    private String archivoContenido;

    public ContenidoArchivo(int codigoPublicacion, String fechaPublicacion, Usuario usuario, String archivo, String titulo) {
        super(codigoPublicacion, fechaPublicacion, usuario);
        this.archivoContenido = archivo;
        this.tituloArchivo = titulo;
    }

    public String getArchivoContenido() {
        return archivoContenido;
    }

    public void setArchivoContenido(String archivo) {
        this.archivoContenido = archivo;
    }

    public String getTituloArchivo() {
        return tituloArchivo;
    }

    public void setTituloArchivo(String tituloArchivo) {
        this.tituloArchivo = tituloArchivo;
    }

    @Override
    String mostrarSuperficial() {
        // TODO Auto-generated method stub
        return" ID_Contenido: " + getCodigoPublicacion() +" Usuario : " + getUsuario().getName_user() + " Titulo Archivo : " + getTituloArchivo();
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Archivo: " + getArchivoContenido();
    }

}
