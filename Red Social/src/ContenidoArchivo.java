import java.awt.Desktop;


public class ContenidoArchivo extends Contenido {


    public ContenidoArchivo() {
    }


    public ContenidoArchivo(String fechaPublicacion, Usuario usuario, String ruta_archivo, String titulo,Etiquetas etiquetaP) {
        super(fechaPublicacion, usuario,etiquetaP);
        this.rutaArchivo = ruta_archivo;
        this.tituloContenido = titulo;

        this.etiquetasPublicacion.add(etiquetaP);
    }

    

    @Override
    String mostrarSuperficial() {
        return  "ID " + getCodigoPublicacion() + " Usuario " + getUsuario() + " Titulo " + getTituloContenido(); 
    }

  

    

}
