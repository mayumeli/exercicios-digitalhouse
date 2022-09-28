package imprimirDocumentos;

public class Relatorio extends Documento {
    private String texto;
    private String numeroPaginas;
    private String autor;

    @Override
    public String toString() {
        return "Relatorio{" +
                "texto='" + texto + '\'' +
                ", numeroPaginas='" + numeroPaginas + '\'' +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    public Relatorio(String texto, String numeroPaginas, String autor, String revisor) {
        this.texto = texto;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public void imprimir() {
        Imprimir.imprimirDocumento(this.toString());
    }

    private String revisor;
}
