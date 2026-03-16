import java.awt.Desktop;

public class ContenidoArchivo extends Contenido {


    public ContenidoArchivo(String fechaPublicacion, Usuario usuario, String ruta_archivo, String titulo) {
        super(fechaPublicacion, usuario);
        this.rutaArchivo = ruta_archivo;
        this.tituloContenido = titulo;
    }

    @Override
    String mostrarSuperficial() {
        return  "ID" + getCodigoPublicacion() + "Usuario" + getUsuario() + "Titulo " /*+ getTitulo()*/; 
    }

    

}
