import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class GestorContenido {
    private HashSet<Contenido> Publicaciones = new HashSet<>();

    public GestorContenido() {
        Publicaciones = new HashSet<>();
    }

    public void crearContenido(String texto, String ruta, Usuario usuario, HashSet<Etiquetas> etiquetas,
            String tituloArchivo) {

        Random r = new Random();
        int codigo_random = r.nextInt(600000) + 100000;

        if (texto != null && ruta == null) {
            Contenido contenido = new ContenidoTexto(codigo_random, "15/07/2024", usuario, texto);
            for (Etiquetas etiquetas2 : etiquetas) {
                contenido.agregarEtiquetas(etiquetas2);
            }
            Publicaciones.add(contenido);
        }

        if (texto == null && ruta != null) {
            Contenido contenido = new ContenidoArchivo(codigo_random, "11/09/2021", usuario, ruta, tituloArchivo);
            for (Etiquetas etiquetas2 : etiquetas) {
                contenido.agregarEtiquetas(etiquetas2);
            }
            Publicaciones.add(contenido);
        }

        if (texto != null && ruta != null) {
            Contenido contenido = new ContenidoMixto(codigo_random, "11/09/2021", usuario, texto, ruta);
            for (Etiquetas etiquetas2 : etiquetas) {
                contenido.agregarEtiquetas(etiquetas2);
            }
            Publicaciones.add(contenido);
        }

    }

    public String mostrarContenido() {
        StringBuilder sb = new StringBuilder();
        for (Contenido contenido : Publicaciones) {
            sb.append(contenido.mostrarSuperficial() + "\n");
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

    public HashSet<Contenido> TodasLasPublicaciones(){
        return Publicaciones;
    }

}
