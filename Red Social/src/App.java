import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        final Scanner sc = new Scanner(System.in);

        Usuario usuario1 = new Usuario(1, "Carlos", "sol123");
        Usuario usuario2 = new Usuario(2, "Ana", "luna456");
        Usuario usuario3 = new Usuario(3, "Pedro", "roca789");
        Usuario usuario4 = new Usuario(4, "Lucia", "flor321");
        Usuario usuario5 = new Usuario(5, "Miguel", "rio654");
        Usuario usuario6 = new Usuario(6, "Sofia", "estrella987");
        Usuario usuario7 = new Usuario(7, "Javier", "viento147");
        Usuario usuario8 = new Usuario(8, "Elena", "mar258");
        Usuario usuario9 = new Usuario(9, "David", "arena369");
        Usuario usuario10 = new Usuario(10, "Marta", "nube159");
        Usuario usuario11 = new Usuario(11, "Raul", "fuego753");
        Usuario usuario12 = new Usuario(12, "Paula", "tierra852");
        Usuario usuario13 = new Usuario(13, "Sergio", "bosque951");
        Usuario usuario14 = new Usuario(14, "Laura", "cielo357");
        Usuario usuario15 = new Usuario(15, "Alberto", "trueno654");
        Usuario usuario16 = new Usuario(16, "Natalia", "hoja456");
        Usuario usuario17 = new Usuario(17, "Diego", "montana741");
        Usuario usuario18 = new Usuario(18, "Claudia", "sol987");
        Usuario usuario19 = new Usuario(19, "Ivan", "lago258");
        Usuario usuario20 = new Usuario(20, "Carmen", "brisa369");
        Usuario usuario21 = new Usuario(21, "Bruce", "12345");

        Terminal.menuInicial();
        System.out.println(Terminal.menuInicial());
        GestorContenido gestorC = new GestorContenido();

        Contenido conten = new ContenidoTexto("12132131", usuario21, "hola");
        
        System.out.println("Etiquetas disponibles");
        gestorC.mostrarEtiquetas();

        System.out.println("Elige un numero de esas etiquetas del 1 al 10 tal cual estan y se agrega a tu publicacion");


        gestorC.agregarContenidoExis(conten);

        gestorC.mostrarContenido();

        System.out.println(gestorC.mostrarContenido());

            conten.mostrarEtiquetas(conten);


       
    }
}
