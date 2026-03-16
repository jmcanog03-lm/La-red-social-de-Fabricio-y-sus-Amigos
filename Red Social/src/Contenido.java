import java.util.HashSet;

public abstract class Contenido {
    protected int codigoPublicacion;
    protected String fechaPublicacion;
    protected HashSet<Etiquetas> etiquetasPublicacion;
    protected Usuario usuario;

    public Contenido(int codigoPublicacion, String fechaPublicacion,
            Usuario usuario) {
        this.codigoPublicacion = codigoPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.etiquetasPublicacion = new HashSet<>();
        this.usuario = usuario;
    }

    abstract String mostrarSuperficial();

    public int getCodigoPublicacion() {
        return this.codigoPublicacion;
    }

    public void setCodigoPublicacion(int codigoPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
    }

    public String getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public HashSet<Etiquetas> getEtiquetasPublicacion() {
        return this.etiquetasPublicacion;
    }

    public void setEtiquetasPublicacion(HashSet<Etiquetas> etiquetasPublicacion) {
        this.etiquetasPublicacion = etiquetasPublicacion;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
