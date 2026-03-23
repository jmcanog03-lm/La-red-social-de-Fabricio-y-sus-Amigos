import java.security.PublicKey;
import java.time.LocalDate;
import java.util.HashSet;

public class RedSocial {
    private Usuario Sesion;
    private HashSet<Usuario> follow;
    private GestorContenido gestorContenidoredSocial;
    private String localDate;

    public RedSocial(Usuario usuario) {
        
            this.follow = new HashSet<>();
            this.Sesion = usuario;
            this.gestorContenidoredSocial = GestorContenido.getInstancia();
            this.localDate = "23/03/2026";

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
  

    public String PublicacionesPortal() {
        return gestorContenidoredSocial.mostrarContenido();
    }

    public HashSet<Contenido> todasLasPublicaciones(){
        return gestorContenidoredSocial.getPublicaciones();
    }

    public String abrirPublicacion(int id_contenido) {
        return gestorContenidoredSocial.buscarContenido(id_contenido).toString();
    }

    public boolean ConfirmarSeguimientoUsuario(int id) {
        Usuario usuario = gestorContenidoredSocial.buscarContenido(id).getUsuario();

        return seguir(usuario);
            
    }

    public void cambiarOrden(HashSet<Contenido> publis){
        gestorContenidoredSocial.setPublicaciones(publis);
    }

    public void mostrarEtiquetas(){
        gestorContenidoredSocial.mostrarEtiquetas();
    }

    public void crearContentText(String text, Etiquetas etiqueta){
        gestorContenidoredSocial.crearContenidoTexto(localDate, Sesion, text, etiqueta);
    }

    public void crearContentImagen(String url, String titulo, Etiquetas etiqueta){
        gestorContenidoredSocial.crearContenidoImagen(localDate, Sesion, url, titulo, etiqueta);
    }

    public void crearContentMixto(String url, String text, String titulo, Etiquetas etiqueta){
        gestorContenidoredSocial.crearContenidoMixto(localDate, Sesion, url, titulo, text, etiqueta);
    }

    

}
