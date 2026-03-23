import java.util.HashSet;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;

public abstract class Contenido {
    protected int codigoPublicacion;
    protected String fechaPublicacion;
    protected HashSet<Etiquetas> etiquetasPublicacion;
    protected Usuario usuario;
    protected static int contador;
    protected String texto_contenido;
    protected Desktop desktop;
    protected String rutaArchivo;
    protected String tituloContenido;

    public Contenido() {
    }

    public Contenido(String fechaPublicacion,
            Usuario usuario) {
        this.codigoPublicacion = contador;
        contador++;
        this.fechaPublicacion = fechaPublicacion;
        this.etiquetasPublicacion = new HashSet<>();
        this.usuario = usuario;
        this.desktop = Desktop.getDesktop();
        this.tituloContenido = tituloContenido;
        this.rutaArchivo = rutaArchivo;
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

    public void mostrarEtiquetas(Contenido contenido) {
        for (Etiquetas etiquetas : contenido.getEtiquetasPublicacion()) {
            System.out.println(etiquetas);
        }
    }

    // public void agregarEtiquetas(Etiquetas etiqueta) {

    // etiquetasPublicacion.add(etiqueta);
    // }


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
