import java.util.HashSet;

public class Usuario implements Comparable<Usuario>, Cloneable {

    private int id;
    private String name_user;
    private String password;
    ///// Algotitmo seleccionado
   // private HashSet<Etiquetas> set;

    public Usuario(int id, String name_user, String password) {
        this.id = id;
        this.name_user = name_user;
        this.password = password;
     //   this.set = new HashSet<>();

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


 //   public void agregarEtiquetas(Etiquetas etiqueta) {
 //       set.add(etiqueta);

 //   }

//    public void eliminarEtiqueta(Etiquetas etiqueta) {

    //    for (Etiquetas etiquetasEach : set) {
    //        if (etiquetasEach == etiqueta) {
    //            set.remove(etiquetasEach);
    //         }
    //    }
   // }

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

}