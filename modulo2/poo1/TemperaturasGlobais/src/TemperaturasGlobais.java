public class TemperaturasGlobais {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "New York", "Buenos Aires", "Asunção", "São Paulo", "Lima", "Santigado de Chile", "Lisboa", "Tokio"};
        int [][] temperaturas = { {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35} };
        int indexCidadeMaiorTemperatura = 0;
        int indexCidadeMenorTemperatura = 0;
        for (int i = 0; i < cidades.length; i++) {
            if (temperaturas[i][0] < temperaturas[indexCidadeMenorTemperatura][0]) {
                indexCidadeMenorTemperatura = i;
            }
            if (temperaturas[i][1] > temperaturas[indexCidadeMaiorTemperatura][1]) {
                indexCidadeMaiorTemperatura = i;
            }
        }
        System.out.println("A cidade com a menor temperatura é " + cidades[indexCidadeMenorTemperatura] + " com " + temperaturas[indexCidadeMenorTemperatura][0] + " graus");
        System.out.println("A cidade com a maior temperatura é " + cidades[indexCidadeMaiorTemperatura] + " com " + temperaturas[indexCidadeMaiorTemperatura][1] + " graus");
    }
}
