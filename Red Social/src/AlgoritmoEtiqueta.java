import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AlgoritmoEtiqueta implements AlgoritmoPresentacion{

    @Override
    public List<Contenido> estrategia(Usuario user, List<Contenido> publicaciones) {

        List<Contenido> contenidoAuxiliar = new ArrayList<>();
        for (Contenido contenidoSet : publicaciones) {
            for (Etiquetas etiquetas : contenidoSet.getEtiquetasPublicacion()) {
                if (contenidoSet.etiquetasPublicacion.contains(etiquetas)) {
                    contenidoAuxiliar.add(contenidoSet);
                }
            }

        }

        for (Contenido contenidoSet : publicaciones) {
            for (Etiquetas etiquetas : contenidoSet.getEtiquetasPublicacion()) {
                if (!contenidoSet.etiquetasPublicacion.contains(etiquetas)) {
                    contenidoAuxiliar.add(contenidoSet);
                }
            }

        }

        return contenidoAuxiliar;
    }

    

    
}
