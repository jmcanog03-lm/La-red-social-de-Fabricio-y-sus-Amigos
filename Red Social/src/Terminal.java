import java.util.Scanner;

public abstract class Terminal {
    static Scanner sc = new Scanner(System.in);
    static GestorUsuario gUsuarios = new GestorUsuario();
    static String userName = "";
    static Usuario userTrue;
    public static void menuInicial(){
        // String titulo = "Bienvenidos a la Magnífica Red Social de Fabricio y sus amigos";
        // String pregunta = "Qué opción deseas realizar";
        // String opcion1 = "1- Iniciar Sesión";
        // String opcion2 = "2- Crear Usuario";
        System.out.println("Bienvenidos a la Magnífica Red Social de Fabricio y sus amigos");
        System.out.println("Qué opción deseas realizar");
        System.out.println("1- Iniciar Sesión");
        System.out.println("2- Crear Usuario");
        
        int option = Integer.parseInt(sc.nextLine());
        while (option != 1 || option != 2){
            switch (option){
            case 1:
                if(InicioSesion() == false) option = 0;
                else MenuIniciado(userName);        
                break;
            case 2:
                CrearUsuario();
                break;
            default:
                break;

        }
        }
        
    }

    public static boolean InicioSesion(){
        System.out.println("Introduce tu nombre de usuario");
        userName = sc.nextLine();
        boolean flag = false;
        String contrasena = "";
        Usuario usuarioReal = new Usuario(0, "", "");
        for (Usuario user : gUsuarios.coleccionUsuarios()) {
            if(user.getName_user().toUpperCase().equals(userName.toUpperCase())){
                flag = true;
                contrasena = user.getPassword();
                usuarioReal = user;
            }
        }
        if(flag){
            System.out.println("Introduce la contraseña de " + userName);
            String contrasenaTry = sc.nextLine();
            if(contrasenaTry.equals(contrasena)){
                System.out.println("Contraseña correcta\nIniciando Sesión...");
                userTrue = usuarioReal;
                return true;
            } else {
                System.out.println("Contraseña incorrecta");
                return false;
            }
        }  else  {
                System.out.println("El usuario " + userName + " no existe\nComprueba si has escrito correctamente el nombre de usuario");
                return false;
        }
    }

    public static void CrearUsuario(){
        System.out.println("¿Cual será tu nombre de usuario?");
        String userName = sc.nextLine();
        System.out.println("¿Cual será tu contraseña?");
        String contrasena = sc.nextLine();
        userTrue = new Usuario(0000, userName, contrasena);
        gUsuarios.registrar_Usuario(userTrue);
    }

    public static void MenuIniciado(String user){
        System.out.println("Bienvenido " + user);
        System.out.println("");
    }

    public static void CrearPublicacion(){
        GestorContenido gContenido = new GestorContenido();
        System.out.println("¿Qué tipo de publicación quieres hacer?");
        System.out.println("1. Texto");
        System.out.println("2. Imagen");
        System.out.println("2. Mixto");
        int option = Integer.parseInt(sc.nextLine());
        while (option != 0){
            switch(option){
                case 1: 
                System.out.println("Introduce el texto de tu publicación");
                String textoT = sc.nextLine();
                gContenido.crearContenidoTexto("fecha de hoy", userTrue, textoT);
                    break;
                case 2:
                System.out.println("Introduce la direccion de tu imagen");
                String imagenI = sc.nextLine();
                System.out.println("Introduce el título de la imagen");
                String tituloI = sc.nextLine();
                gContenido.crearContenidoImagen("fecha de hoy", userTrue, imagenI, tituloI);
                    break;
                case 3:
                System.out.println("Introduce el texto de tu publicación");
                String textoM = sc.nextLine();
                System.out.println("Introduce la direccion de tu imagen");
                String imagenM = sc.nextLine();
                System.out.println("Introduce el titulo de la imagen");
                String tituloM = sc.nextLine();

                gContenido.crearContenidoMixto("fecha de hoy", userTrue, imagenM, tituloM, textoM);
            }
        }
    }
}
