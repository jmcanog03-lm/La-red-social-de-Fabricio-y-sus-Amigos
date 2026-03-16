import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AlgoritmoSeguidos implements AlgoritmoPresentacion {

    @Override
    public List<Contenido> estrategia(Usuario user, HashSet<Contenido> publicaciones, Contenido contenido) {
        List<Contenido> contenidoAuxiliar = new ArrayList<>();
        for (Contenido contenidoSet : publicaciones) {
            for (Etiquetas etiquetas : contenido.getEtiquetasPublicacion()) {
                if (contenidoSet.etiquetasPublicacion.contains(etiquetas)) {
                    contenidoAuxiliar.add(contenidoSet);
                }
            }

        }
        return contenidoAuxiliar;
    }

}
