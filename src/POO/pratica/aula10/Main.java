public class Main {
    
    public static void main(String[] args) {
         
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Ferrari";
        veiculo.modelo = "F8 Tributo";
        veiculo.placa = "TNA-5A26";

        Carro carro = new Carro();
        carro.nPortas = 4;
        carro.capacidadeMala = "200l";

        Object objVeiculo = veiculo; //Criar um objeto da classe object e instanciar a classe veiculo
        Object objCarro = carro; //Criar um objeto da classe object e instanciar a classe carro

        Veiculo objVeiculoConvertido = (Veiculo)objVeiculo;
        Carro objCarroConvertido = (Carro)objCarro;

        System.out.println(objVeiculoConvertido);
        System.out.println(objCarroConvertido);
    }
}
