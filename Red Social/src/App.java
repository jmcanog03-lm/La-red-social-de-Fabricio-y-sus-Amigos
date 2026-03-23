import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        GestorUsuario gUsuarios = GestorUsuario.getInstancia();
        GestorContenido gestorC = GestorContenido.getInstancia();

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
        Usuario usuario22 = new Usuario(22, "Emilio", "ayuda");
        
        gUsuarios.registrar_Usuario(new Usuario(21, "Bruce", "12345"));
        gUsuarios.registrar_Usuario(usuario20);
        gUsuarios.registrar_Usuario(usuario19);
        gUsuarios.registrar_Usuario(usuario18);
        gUsuarios.registrar_Usuario(usuario17);
        gUsuarios.registrar_Usuario(usuario16);
        gUsuarios.registrar_Usuario(usuario15);
        gUsuarios.registrar_Usuario(usuario14);
        gUsuarios.registrar_Usuario(usuario13);
        gUsuarios.registrar_Usuario(usuario12);
        gUsuarios.registrar_Usuario(usuario11);
        gUsuarios.registrar_Usuario(usuario10);
        gUsuarios.registrar_Usuario(usuario9);
        gUsuarios.registrar_Usuario(usuario8);
        gUsuarios.registrar_Usuario(usuario7);
        gUsuarios.registrar_Usuario(usuario6);
        gUsuarios.registrar_Usuario(usuario5);
        gUsuarios.registrar_Usuario(usuario4);
        gUsuarios.registrar_Usuario(usuario3);
        gUsuarios.registrar_Usuario(usuario2);
        gUsuarios.registrar_Usuario(usuario1);
        gUsuarios.registrar_Usuario(usuario22);

        

        Contenido conten = new ContenidoTexto("23032026", usuario20, "Juego de tronos un mierdon", Etiquetas.SERIES);
        Contenido conten1 = new ContenidoTexto("20022025", usuario17, "El señor de los anillos esta wapo", Etiquetas.PELICULAS);
        Contenido conten2 = new ContenidoTexto("21032026", usuario3, "Grok esto es real?", Etiquetas.IA);
        Contenido conten3 = new ContenidoTexto("03012022", usuario12, "Fabricio le gana a Goku", Etiquetas.FABRICIO);
        Contenido conten4 = new ContenidoTexto("01012021", usuario5, "Ayer mes pegue un hostion jugando al volley", Etiquetas.DEPORTES);
        Contenido conten5 = new ContenidoTexto("22032026", usuario22, "Pablo, esto es literalmente un mensaje de auxilio, Ayudame", Etiquetas.TECNOLOGIA);
        
        gestorC.agregarContenidoExis(conten5);
        gestorC.agregarContenidoExis(conten4);
        gestorC.agregarContenidoExis(conten3);
        gestorC.agregarContenidoExis(conten2);
        gestorC.agregarContenidoExis(conten1);
        gestorC.agregarContenidoExis(conten);

        Terminal.menuInicial();
        // System.out.println("Etiquetas disponibles");
        // gestorC.mostrarEtiquetas();

        // Contenido conten = new ContenidoTexto("12132131", usuario21, "hola");
        // Contenido conten4 = new ContenidoTexto("12132131", usuario21, "holaawsdasdaajsdhjashjdshjasdjhasdjhasdjhahjsdjhasdhjashjdajhshjasyuqwyueqwyueqyuweyuqweyuqwyueqwyuweyuqeyuqwyueqwyueyuwqeyuwqeyuqwyueqwhewdjhsdhjasyidhqweyuqwehqwedyquwdhqwdyudeqwuydqwdhqwyudqwhdyqwudewqhjdywqdhwqdywqdhwqydwqhdqywdhwqydwqhjdqwyudhqwedyqbdhyqwdbqwdyuqwdnbqwdyuqwbdqyuwdqwedu8yqwedhuy");
        // Contenido conten2 = new ContenidoArchivo("12121", usuario21, ".\\img\\hola.jpg", "hola");
        // Contenido conten3 = new ContenidoMixto("123456", usuario10, "Hola esto es una publicacion", "\\img\\hola.jpg", "Publicacion mixto");
        //  Contenido conten5 = new ContenidoTexto("121312131", usuario21, "holasasdasda");
        // C:\\Users\\tarde\\Desktop\\La-red-social-de-Fabricio-y-sus-Amigos\\Red Social\\img\\hola.jpg
        System.out.println("Etiquetas disponibles");
        gestorC.mostrarEtiquetas();

        //System.out.println("Elige un numero de esas etiquetas del 1 al 10 tal cual estan y se agrega a tu publicacion");

        gestorC.agregarContenidoExis(conten);
        gestorC.agregarContenidoExis(conten2);
        gestorC.agregarContenidoExis(conten3);
        gestorC.agregarContenidoExis(conten4);
        gestorC.agregarContenidoExis(conten5);

        conten.agregarEtiquetas(sc);

        // System.out.println(gestorC.mostrarContenido());

        conten.mostrarEtiquetas(conten);
        

    
    }
}
