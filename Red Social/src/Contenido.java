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
        this.etiquetasPublicacion = new HashSet<>();
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

    public String getTexto_contenido() {
        return this.texto_contenido;
    }

    public void setTexto_contenido(String texto_contenido) {
        this.texto_contenido = texto_contenido;
    }

    public Desktop getDesktop() {
        return this.desktop;
    }

    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }

    public String getRutaArchivo() {
        return this.rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getTituloContenido() {
        return this.tituloContenido;
    }

    public void setTituloContenido(String tituloContenido) {
        this.tituloContenido = tituloContenido;
    }

    public void mostrarEtiquetas(Contenido contenido) {
        for (Etiquetas etiquetas : contenido.getEtiquetasPublicacion()) {
            System.out.println(etiquetas);
        }
    }

    // public void agregarEtiquetas(Etiquetas etiqueta) {

    // etiquetasPublicacion.add(etiqueta);
    // }

    public void agregarEtiquetas(final Scanner sc) {

        // int numero = Integer.parseInt(sc.nextLine());
        // while (numero >= 0 && numero <= 11) {
        // numero = Integer.parseInt(sc.nextLine());
        // if (numero <= 11) {
        // Etiquetas etiqueta = Etiquetas.values()[numero - 1];
        // etiquetasPublicacion.add(etiqueta);
        // }
        // }

        boolean salida = true;
        while (salida) {
            int numero = Integer.parseInt(sc.nextLine());
            if (numero <= 11) {
                Etiquetas etiqueta = Etiquetas.values()[numero - 1];
                etiquetasPublicacion.add(etiqueta);
            } else if (numero == 12) {
                salida = false;
            }
        }

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
        return "{" +
                " codigoPublicacion='" + getCodigoPublicacion() + "'" +
                ", fechaPublicacion='" + getFechaPublicacion() + "'" +
                ", etiquetasPublicacion='" + getEtiquetasPublicacion() + "'" +
                ", usuario='" + getUsuario() + "'" +
                ", texto_contenido='" + getTexto_contenido() + "'" +
                ", desktop='" + getDesktop() + "'" +
                ", rutaArchivo='" + getRutaArchivo() + "'" +
                ", tituloContenido='" + getTituloContenido() + "'" +
                "}";
    }

}
