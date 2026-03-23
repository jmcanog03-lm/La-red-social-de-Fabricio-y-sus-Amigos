import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GestorUsuario {
    private static HashSet<Usuario> baseDeDatos;
    private static HashMap <String, Usuario> MapBaseDeDatos;
    private static GestorUsuario instancia;

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

    public static GestorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new GestorUsuario();
        }
        return instancia;
    }
    
    public String mostrarUsuario(){
        StringBuilder sb =  new StringBuilder("");
        for (Usuario usuario : baseDeDatos) {
            sb.append(usuario.toString() + "\n");
        }

        String resultado = sb.toString();
        return resultado;

        
    }

    public HashSet<Usuario> getList(){
        return baseDeDatos;
    }

    public HashSet<Usuario> coleccionUsuarios(){
        return baseDeDatos;
    }
    
}