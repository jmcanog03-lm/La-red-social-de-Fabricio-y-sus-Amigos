public class ContenidoMixto extends Contenido {
    private String texto_Mixto;
    private String archivo_mixto;

    public ContenidoMixto(int codigoPublicacion, String fechaPublicacion, Usuario usuario, String texto,
            String archivo) {
        super(codigoPublicacion, fechaPublicacion, usuario);
        this.texto_Mixto = texto;
        this.archivo_mixto = archivo;
    }

    public String getTexto_Mixto() {
        return texto_Mixto;
    }

    public void setTexto_Mixto(String texto) {
        this.texto_Mixto = texto;
    }

    public String getArchivo_mixto() {
        return archivo_mixto;
    }

    public void setArchivo_mixto(String archivo) {
        this.archivo_mixto = archivo;
    }

    @Override
    String mostrarSuperficial() {
        
        if (this.texto_Mixto.length() > 50) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < texto_Mixto.length(); i++) {
                if (i <= 50) {
                 char caracter = texto_Mixto.charAt(i);
                 sb.append(caracter);   
                }
                

            }

            String resultado = sb.toString();
            return " ID_Contenido: " + getCodigoPublicacion() + " Usuario : " + getUsuario().getName_user() + " Titulo Archivo : " + getArchivo_mixto() + " Texto: " + resultado;
        }
        return " ID_Contenido: " + getCodigoPublicacion() +  " Usuario : " + getUsuario().getName_user() + " Titulo Archivo : " + getArchivo_mixto() + " Texto: " + getTexto_Mixto();



        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Texto : " + texto_Mixto + " Archivo : " + archivo_mixto;
    }
}
