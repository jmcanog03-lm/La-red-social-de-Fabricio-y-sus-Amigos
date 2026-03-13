public class ContenidoArchivo extends Contenido {
    private Desktop desktop;

    public ContenidoArchivo( String fechaPublicacion, Usuario usuario, String archivo, String titulo) {
       super();
       super.codigoPublicacion = super.contador;
       super.contador++;
       this.rutaArchivo = archivo;
       this.tituloArchivo = titulo;
    }

    public String getTituloArchivo() {
        return this.tituloArchivo;
    }

    public void setTituloArchivo(String tituloArchivo) {
        this.tituloArchivo = tituloArchivo;
    }

    public String getRutaArchivo() {
        return this.rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

  

   

    @Override
    String mostrarSuperficial() {
        // TODO Auto-generated method stub
        return" ID_Contenido: " + getCodigoPublicacion() +" Usuario : " + getUsuario().getName_user() + " Titulo Archivo : " + getTituloArchivo();
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() ;
    }

}
