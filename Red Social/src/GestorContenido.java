import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.awt.Desktop;
import java.io.File;

public class GestorContenido {
    private HashSet<Contenido> Publicaciones = new HashSet<>();
    private static GestorContenido instancia;

    public GestorContenido() {
        Publicaciones = new HashSet<>();
    }

    public HashSet<Contenido> getPublicaciones(){
        return this.Publicaciones;
    }

    public void setPublicaciones (HashSet<Contenido> Publicaciones){
        this.Publicaciones = Publicaciones;
    }

    // public void crearContenido(String texto, String ruta, Usuario usuario,
    // HashSet<Etiquetas> etiquetas,
    // String tituloArchivo) {

    // Random r = new Random();
    // int codigo_random = r.nextInt(600000) + 100000;

    // // if (texto != null && ruta == null) {
    // // Contenido contenido = new ContenidoTexto(codigo_random, "15/07/2024",
    // usuario, texto);
    // // for (Etiquetas etiquetas2 : etiquetas) {
    // // contenido.agregarEtiquetas(etiquetas2);
    // // }
    // // Publicaciones.add(contenido);
    // // }

    // if (texto == null && ruta != null) {
    // Contenido contenido = new ContenidoArchivo(codigo_random, "11/09/2021",
    // usuario, ruta, tituloArchivo);
    // for (Etiquetas etiquetas2 : etiquetas) {
    // contenido.agregarEtiquetas(etiquetas2);
    // }
    // Publicaciones.add(contenido);
    // }

    // if (texto != null && ruta != null) {
    // Contenido contenido = new ContenidoMixto(codigo_random, "11/09/2021",
    // usuario, texto, ruta);
    // for (Etiquetas etiquetas2 : etiquetas) {
    // contenido.agregarEtiquetas(etiquetas2);
    // }
    // Publicaciones.add(contenido);
    // }

    // }

    public void crearContenidoTexto(String fechaPublicacion, Usuario usuario, String texto, Etiquetas etiqueta ) {
        Contenido contenido = new ContenidoTexto(fechaPublicacion, usuario, texto, etiqueta);
        Publicaciones.add(contenido);
    }

    public void crearContenidoImagen(String fechaPublicacion, Usuario usuario, String archivo, String titulo, Etiquetas etiqueta) {
        Contenido contenido = new ContenidoArchivo(fechaPublicacion, usuario, archivo, titulo, etiqueta);
        Publicaciones.add(contenido);
    }

    public void crearContenidoMixto(String fechaPublicacion, Usuario usuario, String archivo, String titulo, String texto, Etiquetas etiqueta) {
        Contenido contenido = new ContenidoMixto(fechaPublicacion, usuario, texto, archivo, titulo, etiqueta);
        Publicaciones.add(contenido);
    }

    public void mostrarEtiquetas() {
        for (Etiquetas etiqueta : Etiquetas.values()) {
            System.out.println(etiqueta);
        }

    }

    public static GestorContenido getInstancia() {
        if (instancia == null) {
            instancia = new GestorContenido();
        }
        return instancia;
    }

    public String mostrarContenido() {
        StringBuilder sb = new StringBuilder();

        for (Contenido c : Publicaciones) {
            sb.append(c.mostrarSuperficial() + "\n");
            if (c instanceof ContenidoArchivo) {
                ContenidoArchivo ca = (ContenidoArchivo) c;
                try {
                    File f = new File(ca.getRutaArchivo());
                    ca.desktop.open(f);
                } catch (Exception e) {
                    System.out.println("No se ha podido abrir el archivo " + ca.getRutaArchivo());
                }
            }


            if (c instanceof ContenidoMixto) {
                ContenidoMixto cm = (ContenidoMixto) c;
                try {
                    File f = new File(cm.rutaArchivo);
                    cm.desktop.open(f);
                } catch (Exception e) {
                    System.out.println("No se ha podido abrir el archivo " + cm.rutaArchivo);
                }

            }

        }
        String resultado = sb.toString();
        return resultado;
    }

    public Contenido buscarContenido(int id_contenido) {
        List<Contenido> auxiliarContenido = new ArrayList<>(Publicaciones);
        for (Contenido contenido : auxiliarContenido) {
            if (contenido.getCodigoPublicacion() == id_contenido) {
                return contenido;
            }
        }
        return null;
    }

    public void agregarContenidoExis(Contenido contenido) {
        Publicaciones.add(contenido);
    }

    public HashSet<Contenido> TodasLasPublicaciones() {
        return Publicaciones;
    }

}
