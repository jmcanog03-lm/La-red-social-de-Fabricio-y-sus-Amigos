import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class AlgoritmoFecha implements AlgoritmoPresentacion {

    @Override
    public List<Contenido> estrategia(Usuario user, HashSet<Contenido> objetos, Contenido contenido) {
        List<Contenido> porFecha = new ArrayList<>(objetos);

        porFecha.sort(Comparator.comparing(Contenido::getFechaPublicacion));

        return porFecha;
    }

}
