import java.util.HashSet;

public class RedSocial {
    private Usuario Sesion;
    private HashSet<Usuario> follow;
    private GestorContenido gestorContenidoredSocial;

    public RedSocial(Usuario usuario, HashSet<Usuario> baseDeDatos, GestorContenido gc) {
        if (inicioSesion(usuario, baseDeDatos)) {
            this.follow = new HashSet<>();
            this.Sesion = usuario;
            this.gestorContenidoredSocial = gc;
        }

    }

    public Usuario getSesion() {
        return Sesion;
    }

    public void setSesion(Usuario usuario) {
        this.Sesion = usuario;
    }

    public boolean seguir(Usuario usuario) {
        if (!follow.contains(usuario)) {
            follow.add(usuario);
            return true;
        }
        return false;
    }

    public boolean dejar_de_seguir(Usuario usuario) {

        if (follow.contains(usuario)) {
            follow.remove(usuario);
            return true;
        }
        return false;
    }

    public boolean inicioSesion(Usuario usuario, HashSet<Usuario> baseDeDatos) {
        for (Usuario usuarioSesion : baseDeDatos) {
            if ((usuario.getName_user().equals(usuarioSesion.getName_user()))
                    && (usuario.getPassword().equals(usuarioSesion.getPassword()))) {

                return true;
            }
        }
        return false;
    }

    public String PublicacionesPortal() {
        return gestorContenidoredSocial.mostrarContenido();
    }

    public String abrirPublicacion(int id_contenido) {
        return gestorContenidoredSocial.buscarContenido(id_contenido).toString();
    }

    public boolean ConfirmarSeguimientoUsuario(int id) {
        Usuario usuario = gestorContenidoredSocial.buscarContenido(id).getUsuario();

        return seguir(usuario);
            
    }

}
