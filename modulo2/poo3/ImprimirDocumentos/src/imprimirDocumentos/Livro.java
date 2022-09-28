package imprimirDocumentos;

public class Livro extends Documento {
    private String autor;
    private String titulo;
    private int numeroPaginas;

    public Livro(String autor, String titulo, int numeroPaginas, String genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void imprimir() {
        Imprimir.imprimirDocumento(this.toString());
    }

    private String genero;
}
