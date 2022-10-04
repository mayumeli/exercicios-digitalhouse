import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v1 = new Veiculo("Uno", "Fiat", 10000);
        Veiculo v2 = new Veiculo("Gol", "Volkswagen", 20000);
        Veiculo v3 = new Veiculo("Celta", "Chevrolet", 15000);
        Veiculo v4 = new Veiculo("Civic", "Honda", 30000);
        Veiculo v5 = new Veiculo("Corolla", "Toyota", 35000);
        Veiculo v6 = new Veiculo("Fiesta", "Ford", 25000);
        Veiculo v7 = new Veiculo("Fusion", "Ford", 40000);
        Veiculo v8 = new Veiculo("Cruze", "Chevrolet", 35000);
        Veiculo v9 = new Veiculo("Argo", "Fiat", 20000);
        Veiculo v10 = new Veiculo("Onix", "Chevrolet", 25000);
        Garagem garagem = new Garagem(1, Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10));

        // abaixo, está a forma antiga de se listar veículos
        // System.out.println("Veículos da garagem:");
        // for (Veiculo veiculo : garagem.getVeiculos()) {
        //     System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - R$ " + veiculo.getPreco());
        // }

        // aqui temos a forma nova, usando stream e lambda (lambdas são como as arrow functions)
        // garagem.getVeiculos().stream().forEach(veiculo -> {
        //     System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - R$ " + veiculo.getPreco());
        // });

        // listar os veículos com expressões lambda ordenando por preço do menor para o maior
        // garagem.getVeiculos().stream()
        //     .sorted((veiculo1, veiculo2) -> Double.compare(veiculo1.getPreco(), veiculo2.getPreco()))
        //     .forEach(veiculo -> {
        //         System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - R$ " + veiculo.getPreco());
        //     });

        // listar veículos ordenados por marca
        System.out.println("Veículos da garagem:");
        garagem.getVeiculos().stream()
            .sorted((veiculo1, veiculo2) -> veiculo1.getMarca().compareTo(veiculo2.getMarca()))
            .forEach(veiculo -> {
                System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - R$ " + veiculo.getPreco());
            });

        // mostrar a média de preço entre os veículos
        double media = garagem.getVeiculos().stream()
            .mapToDouble(veiculo -> veiculo.getPreco())
            .average()
            .getAsDouble();
        System.out.println("Média de preço: " + media);

        // filtrar veículos com preço maior que a média
        System.out.println("Veículos com preço maior que a média:");
        garagem.getVeiculos().stream()
            .filter(veiculo -> veiculo.getPreco() > media)
            .forEach(veiculo -> {
                System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - R$ " + veiculo.getPreco());
            });

    }
}
