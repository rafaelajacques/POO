public class Carro extends BaseVeiculosTerrestres {

    private int portas;
    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Carro() {
    }

    public Carro(int codigo, String nome, String placa, String modelo, String cor, int eixos, double pesoLiquido,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, int anoModelo,
            int anoFabricacao, int rodas, String chassi, String codigoRenavam, int portas) {
        super(codigo, nome, placa, modelo, cor, eixos, pesoLiquido, pesoTotal, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, anoModelo, anoFabricacao,
                rodas, chassi, codigoRenavam);
        this.portas = portas;
    }

    public void imprimir() {

        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Peso Líquido: " + this.pesoLiquido);
        System.out.println("Peso Total: " + this.pesoTotal);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Nome do Proprietário: " + this.nomeProprietario);
        System.out.println("Estado: " + this.estadoUF);
        System.out.println("Cidade: " + this.cidadeUF);
        System.out.println("Tipo Veículo: " + this.tipoVeiculo);
        System.out.println("Quantidade de motores: " + this.qtdeMotores);
        System.out.println("Quantidade de ocupantes: " + this.qtdeOcupantes);
        System.out.println("Ano do Modelo: " + this.anoModelo);
        System.out.println("Ano de Fabricacão: " + this.anoFabricacao);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Renavam: " + this.codigoRenavam);
        System.out.println("Portas: " + this.portas);
        System.out.println("");
    }

}
