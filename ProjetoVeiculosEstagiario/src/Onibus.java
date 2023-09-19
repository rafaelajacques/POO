public class Onibus extends BaseVeiculosTerrestres {
    private int assentos;
    private int portas;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Onibus(int i, String string, String string2, String string3, String string4, int j, double d, double e,
            String string5, double f, String string6, String string7, String string8, String string9, String string10,
            int k, int l, int m, int n, int o, int p, int q, int r) {
    }

    public Onibus(int codigo, String nome, String placa, String modelo, String cor, int eixos, double pesoLiquido,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, int anoModelo,
            int anoFabricacao, int rodas, String chassi, String codigoRenavam, int assentos, int portas) {
        super(codigo, nome, placa, modelo, cor, eixos, pesoLiquido, pesoTotal, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, anoModelo, anoFabricacao,
                rodas, chassi, codigoRenavam);
        this.assentos = assentos;
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
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Portas: " + this.portas);
        System.out.println("");
    }

}