import java.util.HashSet;
import java.awt.Desktop;
import java.io.File;

public abstract class Contenido {
    protected int codigoPublicacion;
    protected String fechaPublicacion;
    protected HashSet<Etiquetas> etiquetasPublicacion;
    protected Usuario usuario;
    protected int contador;
    protected String texto_contenido;

    

    public Contenido() {
    }


    public Contenido( String fechaPublicacion,
            Usuario usuario) {
        this.codigoPublicacion = contador;
        contador++;
        this.fechaPublicacion = fechaPublicacion;
        this.etiquetasPublicacion = new HashSet<>();
        this.usuario = usuario;
    }

    abstract String mostrarSuperficial();

    protected int getCodigoPublicacion() {
        return codigoPublicacion;
    }

    protected void setCodigoPublicacion(int codigoPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
    }

    protected String getFechaPublicacion() {
        return fechaPublicacion;
    }

    protected void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    protected Usuario getUsuario() {
        return usuario;
    }

    protected void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void agregarEtiquetas(Etiquetas etiqueta) {
        etiquetasPublicacion.add(etiqueta);

    }

    public void eliminarEtiqueta(Etiquetas etiqueta) {

        for (Etiquetas etiquetasEach : etiquetasPublicacion) {
            if (etiquetasEach == etiqueta) {
                etiquetasPublicacion.remove(etiquetasEach);
            }
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " ID_Contenido: " + getCodigoPublicacion() + " Creador de contenido: " + this.usuario.getName_user();
    }

}
