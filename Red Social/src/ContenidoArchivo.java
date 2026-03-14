public class ContenidoArchivo extends Contenido {
    private Desktop desktop;


    private String archivoContenido;

    public ContenidoArchivo(int codigoPublicacion, String fechaPublicacion, Usuario usuario, String ruta_archivo, String titulo) {
      
        this.archivoContenido = ruta_archivo;
        
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
