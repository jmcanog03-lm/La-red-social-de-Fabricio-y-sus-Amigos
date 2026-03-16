public abstract class Terminal {
    public static String menuInicial(){
        String titulo = "Bienvenidos a la Magnífica Red Social de Fabricio y sus amigos";
        String pregunta = "Qué opción deseas realizar";
        String opcion1 = "1- Iniciar Sesión";
        String opcion2 = "2- Crear Usuario";
        String resultado = titulo + "\n" + pregunta + "\n" + opcion1 + "\n" + opcion2;
        return resultado;
    }
}
