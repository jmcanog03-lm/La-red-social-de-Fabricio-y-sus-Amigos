import java.util.Scanner;

public abstract class Terminal {
    static Scanner sc = new Scanner(System.in);
    static GestorUsuario gUsuarios = GestorUsuario.getInstancia();
    static String userName = "";
    static Usuario userTrue;
    static RedSocial redSocial = new RedSocial(userTrue);
    public static void menuInicial(){
        // String titulo = "Bienvenidos a la Magnífica Red Social de Fabricio y sus amigos";
        // String pregunta = "Qué opción deseas realizar";
        // String opcion1 = "1- Iniciar Sesión";
        // String opcion2 = "2- Crear Usuario";
        System.out.println("Bienvenidos a la Magnífica Red Social de Fabricio y sus amigos");
        System.out.println("Qué opción deseas realizar");
        System.out.println("1- Iniciar Sesión");
        System.out.println("2- Crear Usuario");
        
        int option = 0;
        while (option != 1 || option != 2){
            option = Integer.parseInt(sc.nextLine());
            switch (option){
            case 1:
                if(InicioSesion() == false) option = 0;
                else {
                    redSocial.setSesion(userTrue);
                    MenuIniciado(userName);  
                }      
                break;
            case 2:
                CrearUsuario();
                System.out.println("Usuario creado, pulsa 1 para iniciar sesion");
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
        
        int option = -1;
        while (option != 5){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Bienvenido " + user);
        System.out.println("Elige la actividad que quieres hacer");
        System.out.println("1- Ver contenido");
        System.out.println("2- Crear Contenido");
        System.out.println("3- Configuración");
        System.out.println("4- Abrir publicacion");
        System.out.println("5- Salir");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1: System.out.println(redSocial.PublicacionesPortal());

                break;
                case 2: 
                        crearPublicacion();
                break;
                        case 3:
                               
                                int optionAlgoritmo = 0;
                                
                                     System.out.println("Qué algoritmo de seleccion de contenido quieres usar");
                                System.out.println("1. Por seguidos");
                                System.out.println("2. Por más recientes");
                                System.out.println("3. Por interés");
                                System.out.println("4. Salir");
                                    optionAlgoritmo = Integer.parseInt(sc.nextLine());
                                    switch (optionAlgoritmo){
                                    case 1: userTrue.setAlgoritmoPresentacion(new AlgoritmoSeguidos()); 
                                    break;
                                    case 2: userTrue.setAlgoritmoPresentacion(new AlgoritmoFecha()); 
                                    break;
                                    case 3: userTrue.setAlgoritmoPresentacion(new AlgoritmoEtiqueta()); 
                                    break;
                                    }
                                    
                                    redSocial.cambiarOrden(userTrue.mostrarContenido(redSocial.todasLasPublicaciones()));
                                
                break;
                        case 5: System.out.println("Saliendo...");
                        break;

                        case 4: System.out.println("Que ID de publicacion quieres abrir");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println(redSocial.abrirPublicacion(id));
                        
                        System.out.println("Quieres seguir al usuario? Y/N");
                        String opcion = sc.nextLine();
                        if(opcion.equals("Y") || opcion.equals("y")){
                            
                            redSocial.seguir(redSocial.obtenerPublicacionAPartirDeID(id).getUsuario());
                            System.out.println("Ahora sigues a " + redSocial.obtenerPublicacionAPartirDeID(id).getUsuario().getName_user());
                            // for (Usuario usuarioASeguir : gUsuarios.getList()){
                            //     if(usuarioASeguir.getId() == id){

                            //         redSocial.seguir(usuarioASeguir);
                            //         System.out.println("Ahora sigues a " + usuarioASeguir.getName_user());
                            //     }
                            // }
                        } else if (opcion.equals("N") || opcion.equals("n")){
                            System.out.println("No seguiste a nadie");
                            System.out.println();
                        }
                        



                        
                     
                        
                    
            }
            
        }
    }
    

    public static void crearPublicacion(){
                        int optionContent = 0;
                        System.out.println("Que contenido quieres crear");
                        System.out.println("1. Texto");
                        System.out.println("2. Imagen");
                        System.out.println("3. Mixto");
                        System.out.println("4. Salir");
                        while (optionContent != 4){
                            
                            optionContent = Integer.parseInt(sc.nextLine());
                            System.out.println("Antes de crear tu publicacion, que etiqueta quieres anadirle?");
                            System.out.println("A continuacion se muestra una lista de las etiquetas disponibles");
                            redSocial.mostrarEtiquetas();
                            String etiquetaAnadir = sc.nextLine();
                            Etiquetas etiqueta = Etiquetas.valueOf(etiquetaAnadir.toUpperCase());
                            switch (optionContent) {
                                case 1:
                                    System.out.println("Que texto quieres publicar");
                                    String textoAPublicar = sc.nextLine();
                                    redSocial.crearContentText(textoAPublicar, etiqueta);
                                    optionContent = 4;
                                        break;
                                case 2:
                                    System.out.println("Escribe la url de la imagen");
                                    String url = sc.nextLine();
                                    System.out.println("Escribe el titulo");
                                    String titulo = sc.nextLine();
                                    redSocial.crearContentImagen(url, titulo, etiqueta);
                                    optionContent = 4;
                                    break;
                                case 3:
                                    System.out.println("Que texto quieres publicar");
                                    String textoAPublicarMixto = sc.nextLine();
                                    System.out.println("Escribe la url de la imagen");
                                    String urlMixto = sc.nextLine();
                                    System.out.println("Escribe el titulo");
                                    String tituloMixto = sc.nextLine();
                                    redSocial.crearContentMixto(urlMixto, tituloMixto, textoAPublicarMixto, etiqueta);
                                    optionContent = 4;
                            }
                            
                        }
                    }
}
