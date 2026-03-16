import java.util.List;

public class AlgoritmoEtiqueta implements AlgoritmoPresentacion{

    @Override
    public List<Contenido> estrategia(Usuario user, List<Contenido> objetos) {
        for(Etiquetas etiqueta : user.getSetEtiqueta()){
            //if(objetos.get)
            return objetos;
        }
        return objetos;
        
    }

    
}
