import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AlgoritmoSeguidos implements AlgoritmoPresentacion {

    @Override
    public List<Contenido> estrategia(Usuario user, List<Contenido> publicaciones) {
        List<Contenido> seguidos = new ArrayList<>();
        List<Contenido> otros = new ArrayList<>();
        //No se por qué no va entiendo que es algo del equals del usuario pero me estoy volviendo loco
    for (Contenido content : publicaciones) {
        if (user.getFollow().contains(content.getUsuario())) {
            seguidos.add(content);
        } else {
            otros.add(content);
        }
    }
    


    seguidos.addAll(otros);
    return seguidos;
    }

}
