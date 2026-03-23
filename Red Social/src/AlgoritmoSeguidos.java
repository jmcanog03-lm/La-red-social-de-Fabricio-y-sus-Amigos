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
            System.out.println(1);
            seguidos.add(content);
        } else {
            System.out.println(2);
            otros.add(content);
        }
    }
    


    seguidos.addAll(otros);
    for(Contenido contenido : seguidos){
        System.out.println(contenido);
    }
    return seguidos;
    }

}
