public class ContenidoTexto extends Contenido {
    private String texto_contenido;

    public ContenidoTexto(int codigoPublicacion, String fechaPublicacion, Usuario usuario, String texto) {
        super(codigoPublicacion, fechaPublicacion, usuario);
        this.texto_contenido = texto;
    }

    public String getTexto_contenido() {
        return texto_contenido;
    }

    public void setTexto_contenido(String texto) {
        this.texto_contenido = texto;
    }

    @Override
    String mostrarSuperficial() {
        if (this.texto_contenido.length() > 50) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < texto_contenido.length(); i++) {
                if (i <= 50) {
                 char caracter = texto_contenido.charAt(i);
                 sb.append(caracter);   
                }
                

            }

            String resultado = sb.toString();
            return " ID_Contenido: " + getCodigoPublicacion() + " Usuario : " + getUsuario().getName_user() + " Texto : " + resultado;
        }
        return " ID_Contenido: " + getCodigoPublicacion() + " Usuario : " + getUsuario().getName_user() + " Texto : " + getTexto_contenido();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Texto: " + getTexto_contenido();
    }

}
