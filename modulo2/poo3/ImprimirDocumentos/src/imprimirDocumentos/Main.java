package imprimirDocumentos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidades = new ArrayList<>();
        habilidades.add("Java");
        habilidades.add("Python");
        habilidades.add("C++");
        habilidades.add("C#");
        Documento[] documentos = new Documento[3];
        documentos[0] = new Livro("Autor", "Titulo", 100, "Genero");
        documentos[1] = new Relatorio("Texto", "100", "Autor", "Revisor");
        documentos[2] = new Curriculo("Nome", "Sobrenome", 20, "Email", habilidades);
        for (Documento documento : documentos) {
            documento.imprimir();
        }
    }
}
