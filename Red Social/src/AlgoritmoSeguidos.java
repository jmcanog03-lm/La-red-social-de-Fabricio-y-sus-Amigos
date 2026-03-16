import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AlgoritmoSeguidos implements AlgoritmoPresentacion {

    @Override
    public List<Contenido> estrategia(Usuario user, HashSet<Contenido> publicaciones, Contenido contenido) {
        List<Contenido> contenidoAuxiliar = new ArrayList<>();
        for (Contenido publicacion : publicaciones) {
            if(publicacion.getUsuario().equals(user)){
              contenidoAuxiliar.add(publicacion);  
            }
        }

        for (Contenido publicacion : publicaciones) {
            if(!publicacion.getUsuario().equals(user)){
              contenidoAuxiliar.add(publicacion);  
            }

        }

        return contenidoAuxiliar;
    }

}
