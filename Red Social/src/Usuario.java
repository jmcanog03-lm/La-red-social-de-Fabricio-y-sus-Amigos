import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Usuario implements Comparable<Usuario>, Cloneable{

   private int id;
    private String name_user;
    private String password;
    private AlgoritmoPresentacion algoritmoPresentacion;
    private HashSet<Etiquetas> setEtiqueta;
    private HashSet<Usuario> follow;

    public Usuario(int id, String name_user, String password) {
        this.id = id;
        this.name_user = name_user;
        this.password = password;
        this.setEtiqueta = new HashSet<>();
        this.follow = new HashSet<>();
        this.algoritmoPresentacion = new AlgoritmoSeguidos();

    }

    public HashSet<Usuario> getFollow() {
        return follow;
    }

    public void setFollow(HashSet<Usuario> follow) {
        this.follow = follow;
    }

    public HashSet<Etiquetas> getSetEtiqueta() {
        return setEtiqueta;
    }

    public void setSetEtiqueta(HashSet<Etiquetas> setEtiquetas) {
        this.setEtiqueta = setEtiquetas;
    }

    public void setAlgoritmoPresentacion(AlgoritmoPresentacion alg){
        this.algoritmoPresentacion = alg;
    }

    public AlgoritmoPresentacion getAlgoritmoPresentacion(){
        return this.algoritmoPresentacion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName(String name_user) {
        this.name_user = name_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void agregarEtiquetas(Etiquetas etiqueta) {
        setEtiqueta.add(etiqueta);

    }

    public void agregarUsuario(Usuario usuario){
        follow.add(usuario);
    }

    

    public void eliminarEtiqueta(Etiquetas etiqueta) {

        for (Etiquetas etiquetasEach : setEtiqueta) {
            if (etiquetasEach == etiqueta) {
                setEtiqueta.remove(etiquetasEach);
            }
        }
    }

    @Override
    public int compareTo(Usuario o) {
        int resultado = Integer.compare(this.id, o.id);
        if (resultado != 0) {

            return resultado;
        }
        return this.name_user.compareTo(o.name_user);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre de usuario : " + this.name_user;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (!(o instanceof Usuario)) 
            return false;
        Usuario u = (Usuario) o;
        return this.id == u.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
   
    public List<Contenido> mostrarContenido(List<Contenido> contenidos) {
    return algoritmoPresentacion.estrategia(this, contenidos);
    }

}