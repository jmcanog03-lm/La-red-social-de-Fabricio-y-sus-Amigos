import java.util.HashMap;
import java.util.HashSet;

public class GestorUsuario {
    private HashSet<Usuario> baseDeDatos;
    private HashMap <String, Usuario> MapBaseDeDatos;

    public GestorUsuario() {
        this.baseDeDatos = new HashSet<>();
        this.MapBaseDeDatos = new HashMap<>();
    }

    public void registrar_Usuario(Usuario usuario){
        baseDeDatos.add(usuario);
        MapBaseDeDatos.put(usuario.getName_user(), usuario);
    }

    public Usuario buscar_Usuario(String user_name){

        return MapBaseDeDatos.get(user_name);
    }
    
    public String mostrarUsuario(){
        StringBuilder sb =  new StringBuilder("");
        for (Usuario usuario : baseDeDatos) {
            sb.append(usuario.toString() + "\n");
        }

        String resultado = sb.toString();
        return resultado;

        
    }

    public HashSet<Usuario> coleccionUsuarios(){
        return baseDeDatos;
    }
    
}